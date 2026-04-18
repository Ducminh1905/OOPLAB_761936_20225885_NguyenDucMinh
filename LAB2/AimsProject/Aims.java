package AimsProject;

public class Aims {
    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Animation", "The Lion King", 250.0);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Sci-fi", "Star Wars", 1000.0);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Anime", "Dragon Ball Z", 500.5);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Anime", "One Piece", 50.555);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Anime", "Doraemon", 345.5438);

        Cart cart = new Cart();

        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        cart.addDigitalVideoDisc(dvd4);
        cart.addDigitalVideoDisc(dvd5);

        // test overloading (varargs)
        cart.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        cart.removeDigitalVideoDisc(dvd1);
        cart.removeDigitalVideoDisc(dvd3);

        cart.displayCart();

        // test search
        cart.searchByTitle("star");
        cart.searchById(2);
    }
}