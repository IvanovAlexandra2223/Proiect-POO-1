package KrylovaKateryna35;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //2
        Fruit f1 = new Fruit();
        Fruit f2 = new Fruit("Pear", 215, 14, "Italy", true, "green");
        Fruit f3 = new Fruit(f2);
        System.out.println("Fruits");
        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);


        Apple a1 = new Apple();
        Apple a2=new Apple("Apple", 173, 8.5, "Romania", true, "red", "Golden", true, 7, 8.3);
        Apple a3 = new Apple(a1);
        System.out.println("\nApples");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);


        Orange o1 = new Orange();
        Orange o2 = new Orange("Orange", 250, 10.0, "Spain", true, "Orange", true, 4.0, true);
        Orange o3 = new Orange(o2);
        System.out.println("\nOranges");
        System.out.println("o1: " + o1);
        System.out.println("o2: " + o2);
        System.out.println("o3: " + o3);

        System.out.println();
        System.out.println();


        //3
        ArrayList<Apple> apples =new ArrayList<>();
        ArrayList<Orange> oranges=new ArrayList<>();

        apples.add(new Apple("Apple", 180, 12.5, "Romania", true, "Red", "Golden", false, 7, 7.5));
        apples.add(new Apple("Apple", 150, 10.0, "Poland", true, "Green", "Granny Smith", false, 3, 7.0));
        apples.add(new Apple("Apple", 200, 15.0, "Romania", true, "Red", "Fuji", true, 9, 8.0));
        apples.add(new Apple("Apple", 170, 11.0, "Moldova", false, "Yellow", "Golden", false, 6, 7.2));
        apples.add(new Apple("Apple", 220, 18.0, "Italy", true, "Red", "Gala", true, 8, 8.5));
        apples.add(new Apple("Apple", 140, 9.5, "Romania", true, "Green", "Granny Smith", false, 2, 6.8));
        apples.add(new Apple("Apple", 190, 13.0, "Poland", false, "Red", "Jonagold", false, 5, 7.8));
        apples.add(new Apple("Apple", 160, 14.0, "Romania", true, "Red", "Idared", true, 4, 7.1));
        apples.add(new Apple("Apple", 210, 16.5, "Italy", true, "Yellow", "Golden", true, 8, 8.3));
        apples.add(new Apple("Apple", 175, 12.0, "Moldova", true, "Red", "Fuji", false, 9, 7.6));

        oranges.add(new Orange("Orange", 250, 10.0, "Spain", true, "Orange", true, 4.0, true));
        oranges.add(new Orange("Orange", 200, 8.5, "Greece", true, "Orange", false, 5.5, false));
        oranges.add(new Orange("Orange", 300, 12.0, "Spain", true, "Orange", true, 3.5, true));
        oranges.add(new Orange("Orange", 180, 7.0, "Egypt", false, "Orange", false, 6.0, false));
        oranges.add(new Orange("Orange", 270, 11.0, "Italy", true, "Orange", true, 4.2, true));
        oranges.add(new Orange("Orange", 220, 9.0, "Greece", true, "Orange", false, 5.0, true));
        oranges.add(new Orange("Orange", 240, 10.5, "Spain", false, "Orange", true, 4.5, false));
        oranges.add(new Orange("Orange", 310, 13.0, "Italy", true, "Orange", true, 3.8, true));
        oranges.add(new Orange("Orange", 190, 7.5, "Egypt", true, "Orange", false, 5.8, false));
        oranges.add(new Orange("Orange", 260, 11.5, "Spain", true, "Orange", false, 4.8, true));

        System.out.println("Apples from array: ");
        for(Apple a:apples){
            System.out.println(a);
        }
        System.out.println();

        System.out.println("Oranges from array: ");
        for(Orange o:oranges){
            System.out.println(o);
        }
    }

}
