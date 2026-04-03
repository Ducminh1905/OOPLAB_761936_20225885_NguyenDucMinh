package AimsProject;

public class Aims {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "The Lion King", 250.0);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Sci-fi", "Star Wars", 1000.0);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Anime", "Dragon Ball Z", 500.5);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Anime", "One Piece", 50.555);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Anime", "Doraemon", 345.5438);

        Cart cart = new Cart();

        cart.addDVD(dvd1);
        cart.addDVD(dvd2);
        cart.addDVD(dvd3);
        cart.addDVD(dvd4);
        cart.addDVD(dvd5);

        cart.addDVD(dvd1, dvd2, dvd3);

        cart.removeDVD(dvd1);
        cart.removeDVD(dvd3);

        cart.displayCart();
    }
}