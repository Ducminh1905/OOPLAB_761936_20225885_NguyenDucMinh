package AimsProject;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (dvd == null) return;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].equals(dvd)) {
                System.out.println(dvd.getTitle() + " already exists!");
                return;
            }
        }

        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered++] = dvd;
            System.out.println(dvd.getTitle() + " has been added.");
        } else {
            System.out.println("Cart is full!");
        }
    }

    public void addDVD(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc dvd : dvdList) {
            addDVD(dvd); 
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].equals(dvd)) {

                // shift left
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;

                System.out.println(dvd.getTitle() + " has been removed.");
                return;
            }
        }
        System.out.println("DVD not found!");
    }

    public void displayCart() {
        double sum = 0;

        System.out.println("\n CART ");

        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". "
                    + itemOrdered[i].getTitle()
                    + " - " + itemOrdered[i].getCost());
            sum += itemOrdered[i].getCost();
        }

        System.out.printf("Total: %.2f\n", sum);
    }
}