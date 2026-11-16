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
        if (!this.isFresh()) {
            vitaminC *= 0.7;
        }
        return vitaminC;
    }
}
