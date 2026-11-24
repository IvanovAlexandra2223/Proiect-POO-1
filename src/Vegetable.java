public class Vegetable implements ProductOperations {

    private String name;
    private String color;
    private String origin;
    private double weight;
    private boolean fresh;
    private double pricePerKg;


    public Vegetable() {
        name = "Unknown";
        color = "Unknown";
        origin = "Unknown";
        weight = 0;
        fresh = false;
        pricePerKg = 0;
    }

    public Vegetable(String name, String color, String origin,
                     double weight, boolean fresh, double pricePerKg) {
        this.name = name;
        this.color = color;
        this.origin = origin;
        this.weight = weight;
        this.fresh = fresh;
        this.pricePerKg = pricePerKg;
    }

    public Vegetable(Vegetable v) {
        this.name = v.name;
        this.color = v.color;
        this.origin = v.origin;
        this.weight = v.weight;
        this.fresh = v.fresh;
        this.pricePerKg = v.pricePerKg;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setFresh(boolean fresh) {
        this.fresh = fresh;
    }
    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getOrigin() {
        return origin;
    }
    public double getWeight() {
        return weight;
    }
    public boolean getFresh() {
        return fresh;
    }
    public double getPricePerKg() {
        return pricePerKg;
    }


    @Override
    public void printDetails() {
        System.out.println("Vegetable: " + name);
    }

    @Override
    public double calculatePrice() {
        return weight * pricePerKg;
    }



    @Override
    public String toString() {
        return "Name: " + name +
                ", Color: " + color +
                ", Origin: " + origin +
                ", Weight: " + weight + " kg" +
                ", Fresh: " + fresh +
                ", Price per kg: " + pricePerKg;
    }
}