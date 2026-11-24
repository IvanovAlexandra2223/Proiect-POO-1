package KrylovaKateryna35;

public class Fruit implements FruitOperations {
    private String name;
    private double weightInGrams;
    private double pricePerKg;
    private String countryOfOrigin;
    private boolean isFresh;
    private String color;

    @Override
    public double calculateTotalPrice() {
        double price = (weightInGrams / 1000) * pricePerKg;
        return price;
    }

    @Override
    public double calculateVitaminC() {
        double vitaminC = (weightInGrams / 100) * 5;    // 5 мг на 100 г
        if (!this.getIsFresh()) {
            vitaminC *= 0.8;
        }
        return vitaminC;
    }

    public Fruit() {
        this.name = "Unknown";
        this.weightInGrams = 0;
        this.pricePerKg = 0;
        this.countryOfOrigin = "Unknown";
        this.isFresh = true;
        this.color = "Unknown";
    }


    public Fruit(String name, double weightInGrams, double pricePerKg, String countryOfOrigin, boolean isFresh, String color) {
        this.name = name;
        this.weightInGrams = weightInGrams;
        this.pricePerKg = pricePerKg;
        this.countryOfOrigin = countryOfOrigin;
        this.isFresh = isFresh;
        this.color = color;
    }


    public Fruit(Fruit f) {
        this.name = f.name;
        this.weightInGrams = f.weightInGrams;
        this.pricePerKg = f.pricePerKg;
        this.countryOfOrigin = f.countryOfOrigin;
        this.isFresh = f.isFresh;
        this.color = f.color;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", weight=" + weightInGrams + " g" +
                ", pricePerKg=" + pricePerKg +
                ", country=" + countryOfOrigin +
                ", fresh=" + isFresh +
                ", color=" + color;
    }

    public double getWeightInGrams() {
        return this.weightInGrams;

    }

    public double getPricePerKg() {

        return this.pricePerKg;
    }

    public boolean getIsFresh() {

        return this.isFresh;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getColor() {
        return color;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setWeightInGrams(double weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void setIsFresh(boolean isFresh) {
        this.isFresh = isFresh;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
