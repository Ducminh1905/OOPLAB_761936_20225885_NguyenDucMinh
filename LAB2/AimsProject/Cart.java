package AimsProject;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    // ================= ADD =================
    public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
        if (dvd == null) return;

        // check duplicate (theo title)
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(dvd.getTitle())) {
                System.out.println(dvd.getTitle() + " already exists!");
                return;
            }
        }

        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered++] = dvd;
            System.out.println(dvd.getTitle() + " has been added.");
        } else {
            System.out.println("Cart is full!");
        }
    }

    // overload: varargs
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDigitalVideoDisc(dvd);
        }
    }

    // overload: 2 tham số
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    // ================= REMOVE =================
    public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getTitle().equals(dvd.getTitle())) {

                // shift left
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }

                itemsOrdered[--qtyOrdered] = null;

                System.out.println(dvd.getTitle() + " has been removed.");
                return;
            }
        }
        System.out.println("DVD not found!");
    }

    // ================= TOTAL =================
    public double totalCost() {
        double sum = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }

    // ================= DISPLAY =================
    public void displayCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }

        System.out.printf("Total cost: %.2f\n", totalCost());
        System.out.println("***************************************************");
    }

    // ================= SEARCH BY ID =================
    public void searchById(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println(itemsOrdered[i]);
                return;
            }
        }
        System.out.println("No match found");
    }

    // ================= SEARCH BY TITLE =================
    public void searchByTitle(String title) {
        boolean found = false;

        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println(itemsOrdered[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No match found");
        }
    }
}