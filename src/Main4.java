public class Main4 {
    // These are the class attributes

    String make = "Mclaren";
    String model = "Senna GTR";
    int year = 2022;
    String color = "Black";
    double price = 5000000.00;

    String name2;
    String processor;
    int RAM;
    int ROM;
    boolean isNew;
    String colour;

    Main4(String name2, String processor, int RAM, int ROM, boolean isNew, String colour){
        this.name2 =name2;
        this.colour = colour;
        this.processor =processor;
        this.RAM = RAM;
        this.ROM = ROM;
        this.isNew = isNew;

    }

    //These are the class methods

    public void refreshRate1(){
        System.out.println("90HZ Display Refresh Rate");
    }
    public void refreshRate2(){
        System.out.println("240HZ Display Refresh Rate");
    }


     void batteryLife1(){
        System.out.println("The battery Life is 80%");
    }
    void batteryLife2(){
        System.out.println("The battery Life is 100%");
    }

    // constructor
//    String name;
//    int age;
//    double weight;
//
//    Main4(String name, int age, double weight){
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//
//
//    }



    void drive(){
        System.out.println("You drive the car");
    }

    void brake (){
        System.out.println("You match the brake fool!!");
    }
}
