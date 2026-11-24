package KrylovaKateryna35;

public class Orange extends Fruit {
    private boolean isSeedless;
    private double peelThickness;
    private boolean isEasyToPeel;

    @Override
    public double calculateTotalPrice() {
        double price = (this.getWeightInGrams() / 1000) * this.getPricePerKg();
        if (isSeedless) {
            price *= 1.15;
        }
        return price;
    }

    @Override
    public double calculateVitaminC() {
        double vitaminC = (this.getWeightInGrams() / 100) * 53; //содерж 53 мг на 100 гр
        if (!this.getIsFresh()) {
            vitaminC *= 0.7;
        }
        return vitaminC;
    }


    public Orange() {
        super();
        this.isSeedless = false;
        this.peelThickness = 0;
        this.isEasyToPeel = false;
    }

    public Orange(String name, double weightInGrams, double pricePerKg,
                  String countryOfOrigin, boolean isFresh, String color,
                  boolean isSeedless, double peelThickness, boolean isEasyToPeel) {
        super(name, weightInGrams, pricePerKg, countryOfOrigin, isFresh, color);
        this.isSeedless = isSeedless;
        this.peelThickness = peelThickness;
        this.isEasyToPeel = isEasyToPeel;
    }

    public Orange(Orange o) {
        super(o);
        this.isSeedless = o.isSeedless;
        this.peelThickness = o.peelThickness;
        this.isEasyToPeel = o.isEasyToPeel;
    }

    @Override
    public String toString() {
        return "Orange{" + super.toString() + ", seedless=" + isSeedless +
                ", peelThickness=" + peelThickness + " mm" +
                ", easyToPeel=" + isEasyToPeel + "}";

    }


    public boolean getIsSeedless() {
        return this.isSeedless;
    }

    public double getPeelThickness() {
        return this.peelThickness;
    }

    public boolean getIsEasyToPeel() {
        return this.isEasyToPeel;
    }


    public void setIsSeedless(boolean isSeedless){
        this.isSeedless=isSeedless;
    }

    public void setPeelThickness(double peelThickness) {
        this.peelThickness = peelThickness;
    }

    public void setIsEasyToPeel(boolean isEasyToPeel) {
        this.isEasyToPeel = isEasyToPeel;
    }
}
