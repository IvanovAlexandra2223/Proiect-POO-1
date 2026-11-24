public class Tomato extends Vegetable {

    private String variety;
    private double waterContent;
    private boolean ripe;


    public Tomato() {
        super();
        variety = "Unknown";
        waterContent = 0;
        ripe = false;
    }

    public Tomato(String name, String color, String origin,
                  double weight, boolean fresh, double pricePerKg,
                  String variety, double waterContent, boolean ripe) {

        super(name, color, origin, weight, fresh, pricePerKg);

        this.variety = variety;
        this.waterContent = waterContent;
        this.ripe = ripe;
    }

    public Tomato(Tomato t) {
        super(t);
        this.variety = t.variety;
        this.waterContent = t.waterContent;
        this.ripe = t.ripe;
    }


    public void setVariety(String variety) {
        this.variety = variety;
    }
    public void setWaterContent(double waterContent) {
        this.waterContent = waterContent;
    }
    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    public String getVariety() {
        return variety;
    }
    public double getWaterContent() {
        return waterContent;
    }
    public boolean getRipe() {
        return ripe;
    }


    @Override
    public void printDetails() {
        System.out.println("Tomato variety: " + variety);
        System.out.println("Water content: " + waterContent + "%");
        System.out.println("Ripe: " + ripe);
    }
    @Override
    public double calculatePrice() {
        return super.calculatePrice();
    }


    @Override
    public String toString() {
        return super.toString() +
                ", Variety: " + variety +
                ", Water content: " + waterContent + "%" +
                ", Ripe: " + ripe;
    }
}
