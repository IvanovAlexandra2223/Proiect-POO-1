public abstract class Product implements ProductOperations {
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
}
