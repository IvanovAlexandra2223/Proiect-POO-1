public class PhysicalProduct extends Product{
    private String color;
    private String material;
    private double weight;
    private int warranty;
    private int stock;


    public PhysicalProduct(){
        super();
        this.color     = "Unknown";
        this.material  = "Unknown";
        this.weight    = 0.0;
        this.warranty  = 0;
        this.stock     = 0;
    }
    public PhysicalProduct(String name ,double price ,String culoare,String material, double greutate , int garantie, int stoc){
        super(name,price);
        this.color     = culoare;
        this.material  = material;
        this.weight    = greutate;
        this.warranty  = garantie;
        this.stock     = stoc;
    }
    public PhysicalProduct(PhysicalProduct copy){
        super(copy);
        this.color    = copy.color;
        this.material = copy.material;
        this.weight   = copy.weight;
        this.warranty = copy.warranty;
        this.stock    = copy.stock;
    }


    @Override
    public double calculatePrice(){
        double shippingFee  = this.weight * 6.0;
        double warrantyFee = 0.0;
        if(warranty > 24){
            int extraMonths = this.warranty - 24;
            warrantyFee = extraMonths * 5.0;
        }
        return this.price + shippingFee + warrantyFee;

    }
    @Override
    public void printDetails(){
        System.out.println("Name: " + name + " | Color: " + color + " | Material: " + material +
                " | Weight: " + weight + "Kg"+" | Warranty: " + warranty + "month"+" | Stock: " + stock + " | Price: " + calculatePrice() + "$");
    }

}