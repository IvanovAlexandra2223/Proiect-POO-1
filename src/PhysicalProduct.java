public class PhysicalProduct extends Product {
    private String color;
    private String material;
    private double weight;
    private int warranty;
    private int stock;


    public PhysicalProduct() {
        super();
        this.color = "Unknown";
        this.material = "Unknown";
        this.weight = 0.0;
        this.warranty = 0;
        this.stock = 0;
    }

    public PhysicalProduct(String name, double price, String culoare, String material, double greutate, int garantie, int stoc) {
        super(name, price);
        this.color = culoare;
        this.material = material;
        this.weight = greutate;
        this.warranty = garantie;
        this.stock = stoc;
    }

    public PhysicalProduct(PhysicalProduct copy) {
        super(copy);
        this.color = copy.color;
        this.material = copy.material;
        this.weight = copy.weight;
        this.warranty = copy.warranty;
        this.stock = copy.stock;
    }


    //Getter
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public int getWarranty() {
        return warranty;
    }

    public int getStock() {
        return stock;
    }


    //Setter
    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

    public void setWarranty(int warranty) {
        if (warranty >= 0) {
            this.warranty = warranty;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }


    @Override
    public String toString() {
        return String.format(
                " ------- PhysicalProduct -------\n" +
                        "Name: %s\n" +
                        "Color: %s\n" +
                        "Material: %s\n" +
                        "Weight: %.2f\n" +
                        "Warranty: %d\n" +
                        "Stock: %d\n" +
                        "Price: %.2f euros\n",
                name, color, material, weight, warranty, stock, price
        );
    }


    @Override
    public double calculatePrice() {
        double shippingFee = this.weight * 6.0;
        double warrantyFee = 0.0;
        if (warranty > 24) {
            int extraMonths = this.warranty - 24;
            warrantyFee = extraMonths * 5.0;
        }
        return this.price + shippingFee + warrantyFee;

    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name + " | Color: " + color + " | Material: " + material +
                " | Weight: " + weight + " Kg" + " | Warranty: " + warranty + " month" + " | Stock: " + stock + " | Price: " + calculatePrice() + " euros");
    }

}