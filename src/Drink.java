/*
Cerinta: "o interfață sau o clasă abstractă care să conțină 2 metode care vor fi implementate în clase. O
clasă părinte din care să fie derivate următoarele două clase."

Clasa Parinte
 */
public abstract class Drink implements Drinkacts {
    protected double price;
    private String name;
    private int mililiters;
    private boolean plastic; //0 aluminum 1 plastic       bottle
    private boolean cap; //0 screwcap 1 popcap
    
    
    public Drink(){
    this.price = 0;
    this.name = "unknown";
    this.mililiters = 1000;
    this.plastic = true;
    this.cap = false;
    }
    
    public Drink(String name, int mililiters, double price, boolean plastic, boolean cap){
    this.mililiters = mililiters;
    this.name = name;
    this.price = price;
    this.plastic = plastic;
    this.cap = cap;}
    
    public Drink(Drink s){
    this.name = s.name;
    this.price = s.price;
    this.mililiters = s.mililiters;
        }
    }
