public class FoodProduct extends Product {
    private String expirationDate;


    public FoodProduct() {
        super();
        this.expirationDate = "Unknown";
    }

    public FoodProduct(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public FoodProduct(FoodProduct p) {
        super(p.name, p.price);
        this.expirationDate = p.expirationDate;
    }

    @Override 
    public void printDetails() {
        System.out.println("Food product " + name);
        System.out.println("costs " + price + " euros");
        System.out.println("and expires on " + expirationDate + "\n");
    }

    @Override 
    public double calculatePrice() {
        return price + 10 / 100 * price;
    }
}
