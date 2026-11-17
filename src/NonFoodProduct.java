public class NonFoodProduct extends Product {
    private String brand;
    private String color;
    private String material;
    private int warranty;
    private boolean isFragile;


    public NonFoodProduct() {
        super();

        this.brand = "Unknown";
        this.color = "Unknown";
        this.material = "Unknown";
        this.warranty = 0;
        this.isFragile = false;
    }

    public NonFoodProduct(String name, double price, String brand, String color, String material, int warranty, boolean isFragile) {
        super(name, price);

        this.brand = brand;
        this.color = color;
        this.material = material;
        this.warranty = warranty;
        this.isFragile = isFragile;
    }

    public NonFoodProduct(NonFoodProduct p) {
        super(p.name, p.price);

        this.brand = p.brand;
        this.color = p.color;
        this.material = p.material;
        this.warranty = p.warranty;
        this.isFragile = p.isFragile;
    }

    @Override 
    public void printDetails() {
        System.out.println(this);
    }

    @Override 
    public double calculatePrice() {
        return price + 50 / 100 * price;
    }

    public String toString() {
        return String.format(
            "--Non food product--\n" +
            "Name: %s\n" +
            "Price: %.2f\n" +
            "Brand: %s\n" +
            "Color: %s\n" +
            "Material: %s\n" +
            "Warranty: %d months\n" +
            "Fragile: %b\n" +
            "--Non food product--\n"
            ,
            name, price, brand, color,
            material, warranty, isFragile
        );
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public boolean getFragile() {
        return isFragile;
    }

    public void setFragile(boolean isFragile) {
        this.isFragile = isFragile;
    }
}
