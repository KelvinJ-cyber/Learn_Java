
public class constructor {

    public static void main (String [] args){
        //  constructor = special method that is called when an object is instantiated(created)

//        Main4 human = new Main4("Kelvin", 17,40.0);
//        Main4 human2 = new Main4("Daniel",17,69.7);

        Main4 laptop1 = new Main4("Hp Elite-book","Intel core 17 11th Gen", 16,512,true,"Sliver");
        Main4 laptop2 = new Main4("Alien-ware","Intel core 19 13th Gen", 32,1000,true,"Black");

        System.out.println(laptop2.name2);
        System.out.println(laptop2.processor);
        System.out.println();
        laptop2.refreshRate2();
        laptop2.batteryLife2();

        System.out.println();

        System.out.println(laptop1.name2);
        System.out.println(laptop1.processor);
        System.out.println();
        laptop1.refreshRate1();
        laptop1.batteryLife1();

        int age = 19;

        if (age == 18) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }



    }
}
