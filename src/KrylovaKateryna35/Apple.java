package KrylovaKateryna35;

public class Apple extends Fruit {
    private String variety;
    private boolean isOrganic;
    private int sweetnessLevel;
    private double diameter;

    @Override
    public double calculateTotalPrice() {
        double price = (this.getWeightInGrams() / 1000) * this.getPricePerKg();
        if (isOrganic) {
            price *= 1.2;
        }
        return price;
    }

    @Override
    public double calculateVitaminC() {
        double vitaminC = (this.getWeightInGrams() / 100) * 5;    // 5 мг на 100 г
        if (!this.getIsFresh()) {
            vitaminC *= 0.8;
        }
        return vitaminC;
    }


    public Apple() {
        super();
        this.variety = "Unknown";
        this.isOrganic = false;
        this.sweetnessLevel = 1;
        this.diameter = 0;
    }


    public Apple(String name, double weightInGrams, double pricePerKg, String countryOfOrigin,
                 boolean isFresh, String color, String variety, boolean isOrganic,
                 int sweetnessLevel, double diameter) {
        super(name, weightInGrams, pricePerKg, countryOfOrigin, isFresh, color);
        this.variety = variety;
        this.isOrganic = isOrganic;
        this.sweetnessLevel = sweetnessLevel;
        this.diameter = diameter;
    }


    public Apple(Apple a) {
        super(a);
        this.variety = a.variety;
        this.isOrganic = a.isOrganic;
        this.sweetnessLevel = a.sweetnessLevel;
        this.diameter = a.diameter;
    }


    @Override
    public String toString() {
        return "Apple {" + super.toString() +
                ", variety=" + variety +
                ", organic=" + isOrganic +
                ", sweetness=" + sweetnessLevel +
                ", diameter=" + diameter + " cm}";
    }


    public String getVariety() {
        return this.variety;
    }

    public boolean getIsOrganic() {
        return isOrganic;
    }

    public int getSweetnessLevel() {
        return this.sweetnessLevel;
    }

    public double getDiameter() {
        return diameter;
    }


    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setIsOrganic(boolean isOrganic) {
        this.isOrganic = isOrganic;
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
