public class Beverage extends FoodProduct{
    private String beverageType;
    private boolean carbonated;
    private double volume;

    public Beverage(){
        super();

        this.beverageType = "Unknown";
        this.carbonated = false;
        this.volume = 0.0;

    }

    public Beverage(String name, double price, String expirationDate, double calories,
                    double weight, double sugarContent, double storageTemperature,
                    String beverageType, boolean carbonated, double volume){

        super(name, price, expirationDate, calories, weight, sugarContent, storageTemperature);

        this.beverageType = beverageType;
        this.carbonated = carbonated;
        this.volume = volume;
    }
    public Beverage(Beverage e){
        super(e);

        this.beverageType = e.beverageType;
        this.carbonated = e.carbonated;
        this.volume = e.volume;
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
        return super.toString() + "Beverage Type:" +
                beverageType + "\n" + "Carbonated: " + carbonated + "\n"
                + "Volume: " + volume + " liters\n";
    }

    public String getBeverageType(){
        return beverageType;
    }
    public void setBeverageType(String beverageType){
        this.beverageType = beverageType;
    }

    public boolean isCarbonated(){
        return carbonated;
    }
    public void setCarbonated(boolean carbonated){
        this.carbonated = carbonated;
    }

    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }


}