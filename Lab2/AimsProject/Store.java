package AimsProject;

public class Store {
    public static final int MAX_ITEMS_IN_STORE = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS_IN_STORE];
    private int qtyInStore = 0;

    // ================= ADD =================
    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd == null) return;

        if (qtyInStore < MAX_ITEMS_IN_STORE) {
            itemsInStore[qtyInStore++] = dvd;
            System.out.println(dvd.getTitle() + " has been added to store.");
        } else {
            System.out.println("Store is full!");
        }
    }

    // ================= REMOVE =================
    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i].getTitle().equals(dvd.getTitle())) {

                // shift left
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }

                itemsInStore[--qtyInStore] = null;

                System.out.println(dvd.getTitle() + " has been removed from store.");
                return;
            }
        }
        System.out.println("DVD not found in store!");
    }

    // ================= DISPLAY =================
    public void displayStore() {
        System.out.println("***********************STORE***********************");

        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i]);
        }

        System.out.println("***************************************************");
    }
}