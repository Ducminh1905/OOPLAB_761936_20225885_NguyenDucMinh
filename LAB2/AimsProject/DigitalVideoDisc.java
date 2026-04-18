package AimsProject;

public class DigitalVideoDisc {

    private static int nbDigitalVideoDiscs = 0;

    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    // ================= GETTER =================
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public String getDirector() { return director; }
    public int getLength() { return length; }
    public double getCost() { return cost; }

    // ================= SETTER =================
    public void setTitle(String title) {
        this.title = title;
    }

    // ================= CONSTRUCTOR =================
    public DigitalVideoDisc(String title) {
        this.title = title;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.id = ++nbDigitalVideoDiscs;
    }

    public boolean isMatch(String title) {
        return this.title != null &&
               this.title.toLowerCase().contains(title.toLowerCase());
    }

    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - "
                + director + " - " + length + ": " + cost + "$";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DigitalVideoDisc)) return false;

        DigitalVideoDisc other = (DigitalVideoDisc) obj;

        if (this.title == null) return other.title == null;
        return this.title.equals(other.title);
    }

    @Override
    public int hashCode() {
        return title == null ? 0 : title.hashCode();
    }
}