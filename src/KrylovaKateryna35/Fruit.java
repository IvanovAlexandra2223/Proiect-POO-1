package KrylovaKateryna35;

public abstract class Fruit implements FruitOperations {
    private String name;
    private double weightInGrams;
    private double pricePerKg;
    private String countryOfOrigin;
    private boolean isFresh;
    private String color;

    public double getWeightInGrams() {
        return this.weightInGrams;

    }

    public double getPricePerKg() {
        return this.pricePerKg;
    }

    public boolean isFresh() {
        return this.isFresh;
    }
}
