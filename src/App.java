public class App {
    public static void main(String[] args) throws Exception {
        


        Product p0 = new Product();
        FoodProduct p1 = new FoodProduct();
        NonFoodProduct p2 = new NonFoodProduct();

        p0.printDetails();
        p1.printDetails();
        p2.printDetails();



        //WEEK 2
        PhysicalProduct f1 = new PhysicalProduct();
        PhysicalProduct f2 = new PhysicalProduct("Laptop", 3200.0, "argintiu", "aluminiu", 1.8, 24, 12);
        PhysicalProduct f3 = new PhysicalProduct(f2);

        DigitalProduct d1 = new DigitalProduct();
        DigitalProduct d2 = new DigitalProduct("Photoshop", 350.0, "Windows", "Engleza", "EXE", 3200.5, "PS-1045-1982");
        DigitalProduct d3 = new DigitalProduct(d2);


        //WEEK 3
        Object[] vectorPhysicalProduct = {

                new PhysicalProduct("Laptop", 3200.0, "argintiu", "aluminiu", 1.8, 24, 12),
                new PhysicalProduct("Casti", 150.0, "negru", "plastic", 0.3, 12, 40),
                new PhysicalProduct("Frigider", 2800.0, "alb", "metal", 55.0, 48, 5),
                new PhysicalProduct("Scaun", 400.0, "gri", "textil", 9.5, 36, 0),
                new PhysicalProduct("Telefon", 2100.0, "albastru", "sticla", 0.2, 24, 20),
                new PhysicalProduct("Televizor", 3500.0, "negru", "plastic", 14.0, 60, 8),
                new PhysicalProduct("Cafetiera", 280.0, "rosu", "metal", 3.2, 12, 25),
                new PhysicalProduct("Aspirator", 650.0, "gri", "plastic", 6.5, 24, 15),
                new PhysicalProduct("Monitor", 1100.0, "negru", "plastic", 4.8, 36, 10),
                new PhysicalProduct("Tastatura", 90.0, "alb", "plastic", 0.7, 6, 50)
        };


        for (Object pp : vectorPhysicalProduct) {
            if (pp instanceof PhysicalProduct) {    // verifica daca obiectul a fost creat ca PhysicalProduct daca da intra in if
                PhysicalProduct p = (PhysicalProduct) pp; // creez variabila p de tip produs fizic caruia ii atribui valorea lui pp transformata print cast la produs fizic
                System.out.println(p);
            }
        }

//
        Object[] vectorDigitalProduct = {
                new DigitalProduct("Photoshop", 350.0, "Windows", "Engleza", "EXE", 3200.5, "PS-1045-1982"),
                new DigitalProduct("Antivirus", 120.0, "Android", "Romana", "APK", 85.0, "AV-7731-0042"),
                new DigitalProduct("Joc Aventura", 250.0, "Windows", "Engleza", "ZIP", 5400.0, "JA-5521-9087"),
                new DigitalProduct("Ebook Java", 30.0, "Web", "Romana", "PDF", 4.5, "EB-1200-3345"),
                new DigitalProduct("Editor Video", 480.0, "Windows", "Engleza", "EXE", 1800.0, "EV-9086-1123"),
                new DigitalProduct("VPN Securizat", 60.0, "iOS", "Engleza", "IPA", 45.0, "VP-2204-7781"),
                new DigitalProduct("Curs Video Python", 199.0, "Web", "Romana", "MP4", 2400.0, "CP-3318-4402"),
                new DigitalProduct("Aplicatie Fitness", 45.0, "Android", "Romana", "APK", 120.0, "AF-8890-1156"),
                new DigitalProduct("Pachet Fonturi", 15.0, "Windows", "Engleza", "ZIP", 18.5, "PF-4472-9930"),
                new DigitalProduct("Audiobook", 55.0, "iOS", "Romana", "MP3", 650.0, "AB-6015-2287")
        };
        for (Object pd : vectorDigitalProduct) {
            if (pd instanceof DigitalProduct) {
                DigitalProduct l = (DigitalProduct) pd;
                System.out.println(l);
            }
        }

    }
}
