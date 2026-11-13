public class NonFoodProduct extends Product {
    private int warrantyMonths;

    public NonFoodProduct() {
        super();
        this.warrantyMonths = 0;
    }

    public NonFoodProduct(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public NonFoodProduct(NonFoodProduct p) {
        super(p.name, p.price);
        this.warrantyMonths = p.warrantyMonths;
    }

    @Override 
    public void printDetails() {
        System.out.println("Non food product " + name);
        System.out.println("costs " + price + " euros");
        System.out.println("and has " + warrantyMonths + " months of warranty" + "\n");
    }

    @Override 
    public double calculatePrice() {
        return price + 50 / 100 * price;
    }
}
