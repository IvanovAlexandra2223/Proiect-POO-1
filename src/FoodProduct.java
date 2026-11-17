public class FoodProduct extends Product {
    private String expirationDate;
    private double calories;
    private double weight;
    private double sugarContent;
    private double storageTemperature;


    public FoodProduct() {
        super();

        this.expirationDate = "Unknown";
        this.calories = 0;
        this.weight = 0;
        this.sugarContent = 0;
        this.storageTemperature = 0;
    }

    public FoodProduct(String name, double price, String expirationDate, double calories, double weight, double sugarContent, double storageTemperature) {
        super(name, price);

        this.expirationDate = expirationDate;
        this.calories = calories;
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.storageTemperature = storageTemperature;
    }

    public FoodProduct(FoodProduct p) {
        super(p.name, p.price);

        this.expirationDate = p.expirationDate;
        this.calories = p.calories;
        this.weight = p.weight;
        this.sugarContent = p.sugarContent;
        this.storageTemperature = p.storageTemperature;
    }

    @Override 
    public void printDetails() {
        System.out.println(this);
    }

    @Override 
    public double calculatePrice() {
        return price + 10 / 100 * price;
    }

    public String toString() {
        return String.format(
            "--Food product--\n" +
            "Name: %s\n" +
            "Price: %.2f euros\n" +
            "Expiry date: %s\n" +
            "Calories: %.2f cal\n" +
            "Weight: %.2f kilos\n" +
            "Sugar content: %.2f grams\n" +
            "Storage temperature: %.2f degrees\n" +
            "--Food product--\n"
            ,
            name, price, expirationDate,
            calories, weight, sugarContent,
            storageTemperature
        );
    }


    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    public double getStorageTemperature() {
        return storageTemperature;
    }

    public void setStorageTemperature(double storageTemperature) {
        this.storageTemperature = storageTemperature;
    }
    
}
