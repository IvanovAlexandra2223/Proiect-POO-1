/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Soda extends Drink{
    private int kcal;
    private int sugaramt;
    private boolean carbonation;
    
    public Soda(){
        super();
        this.kcal = 0;
        this.sugaramt = 0;
    }
    public Soda(String name, int mililiters, double price, boolean plastic, boolean cap, int kcal, int sugaramt, boolean carb){
        super(name,mililiters,price, plastic, cap);
        this.kcal = kcal;
        this.sugaramt = sugaramt;
        this.carbonation = carb;
    }
   public Soda(Soda C){
   super(C);
   this.kcal = C.kcal;
   this.sugaramt = C.sugaramt;
   this.carbonation = C.carbonation;
   
}
   
    @Override
   public double calculatePrice(){
       double fee = 0.50;
   return this.price + fee;}
      @Override
   public void printDetails(){
       char str = 'T';
       
   }
   }