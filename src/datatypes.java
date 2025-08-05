import java.util.ArrayList;
import java.util.List;

public class datatypes {
    public static void main(String[] args) {
        // Data types (old)
      /*float length =34.7f;
        double breath = 56.6d;
        long width = 2345;
        String name = "Kelvin"; //new data types
        char single = 'k';
       */
        // loop

        /*for (int i = 2; i <= 50; i++) {
            if (i % 2 == 0) {  // using modulus

                System.out.println(i);
            }
        }

         */
        // for each loop
       /* String [] names={"kelvin", "daniel", "Dickson", "Mary","samson"};
        for(String i:names){
            System.out.println(i);
        }

        */
        //list
        System.out.println("--------------------------------------------------");
        List<String> name = new ArrayList<>();
        name.add("Kelvin");
        name.add("Daniel");
        name.remove(1);
        for (String a: name){
            System.out.println(a);
        }
        System.out.println("New List");
        name.add("James");
        for (String a: name){
            System.out.println(a);
        }
        System.out.println("Delete Array");




    }


}