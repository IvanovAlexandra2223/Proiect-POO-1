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
        if (!this.isFresh()) {
            vitaminC *= 0.8;
        }
        return vitaminC;
    }
}
