public class Pepper extends Vegetable {

    private String type;
    private int seedCount;
    private boolean spicy;


    public Pepper() {
        super();
        type = "Unknown";
        seedCount = 0;
        spicy = false;
    }

    public Pepper(String name, String color, String origin,
                  double weight, boolean fresh, double pricePerKg,
                  String type, int seedCount, boolean spicy) {

        super(name, color, origin, weight, fresh, pricePerKg);

        this.type = type;
        this.seedCount = seedCount;
        this.spicy = spicy;
    }

    public Pepper(Pepper p) {
        super(p);
        this.type = p.type;
        this.seedCount = p.seedCount;
        this.spicy = p.spicy;
    }


    public void setType(String type) {
        this.type = type;
    }
    public void setSeedCount(int seedCount) {
        this.seedCount = seedCount;
    }
    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

    public String getType() {
        return type;
    }
    public int getSeedCount() {
        return seedCount;
    }
    public boolean getSpicy() {
        return spicy;
    }


    @Override
    public void printDetails() {
        System.out.println("Pepper type: " + type);
        System.out.println("Seed count: " + seedCount);
        System.out.println("Spicy: " + spicy);
    }
    @Override
    public double calculatePrice() {
        return super.calculatePrice();
    }


    @Override
    public String toString() {
        return super.toString() +
                ", Type: " + type +
                ", Seed count: " + seedCount +
                ", Spicy: " + spicy;
    }
}
