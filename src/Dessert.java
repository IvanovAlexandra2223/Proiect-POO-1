public class Dessert extends FoodProduct {
    private String dessertType;
    private boolean containsChoco;
    private double servingSize; //grams

    public Dessert(){
        super();

        this.dessertType = "Unknown";
        this.containsChoco = false;
        this.servingSize = 0;
    }

    public Dessert(String name, double price, String expirationDate, double calories,
                   double weight, double sugarContent, double storageTemperature,
                   String dessertType, boolean containsChoco, double servingSize){

        super(name, price, expirationDate, calories, weight, sugarContent, storageTemperature);

        this.dessertType = dessertType;
        this.containsChoco = containsChoco;
        this.servingSize = servingSize;

    }

    public Dessert(Dessert e){
        super(e);

        this.dessertType = e.dessertType;
        this.containsChoco = e.containsChoco;
        this.servingSize = e.servingSize;
    }

    @Override
    public double calculatePrice(){
        return super.calculatePrice();

    }
    @Override
    public void printDetails(){
        System.out.println(this);
    }
    @Override
    public String toString(){
        return super.toString() +
                "Dessert Type: " + dessertType + "\n" +
                "Contains Chocolate: " + containsChoco + "\n" +
                "Serving Size: " + servingSize + " grams\n";

    }

    public String getDessertType(){
        return dessertType;
    }
    public void setDessertType(String dessertType){
        this.dessertType = dessertType;
    }
    public boolean isContainsChoco(){
        return containsChoco;
    }
    public void setContainsChoco(boolean containsChoco){
        this.containsChoco = containsChoco;
    }

    public double getServingSize(){
        return servingSize;
    }
    public void setServingSize(double servingSize){
        this.servingSize = servingSize;
    }


}
