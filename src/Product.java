public class Product implements ProductOperations {
    public String name;
    public double price;


    public Product() {
        name = "Unknown";
        price = 0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(Product p) {
        this.name = p.name;
        this.price = p.price;
    }

    public String toString() {
        return String.format(
            "--Product--\n" +
            "Name: %s\n" +
            "Price: %.2f euros\n" +
            "--Product--\n",
            name, price
        );
    }

    @Override
    public void printDetails() {
        System.out.println(this);
    }

    @Override
    public double calculatePrice() {
        return price;
    }
}
