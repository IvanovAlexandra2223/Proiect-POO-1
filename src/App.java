public class App {
    public static void main(String[] args) throws Exception {
        
        FoodProduct p1 = new FoodProduct();
        NonFoodProduct p2 = new NonFoodProduct();

        p1.printDetails();
        p2.printDetails();



        PhysicalProduct pF1 = new PhysicalProduct();
        PhysicalProduct pF2 = new PhysicalProduct("Tablet",1500.0,"Blue","Aluminum",0.5,32,11);
        DigitalProduct pD1 = new DigitalProduct();
        DigitalProduct pD2 = new DigitalProduct("Photoshop",350,"Windows","English","EXE",3200.5,"1045-1982-4531-8904-2217-6590");


        System.out.println("\nPhysical Product\n");
        pF1.printDetails();
        pF2.printDetails();
        System.out.println("\nDigital Product\n");
        pD1.printDetails();
        pD2.printDetails();



    }
}
