package chatserver.java.src;

import java.util.ArrayList;

// arrays are used to store multiple value in a single variable
public class arrays {
    public static void main (String [] agrs){
        String[] cars = {"Mclaren","Tesla","Porsche","BMW"}; // Note: The data type of the array must be the same with values.
        cars [0] = "Lamborghini";
        System.out.println(cars[0]);
        System.out.println();


        String [] brands = new String[4]; // another way of writing an array ... we can first declare the number of array to be stored in the variable
        brands[0] = "Gucci";
        brands[1] = "Louis Vuitton";
        brands[2] = "Nike";
        brands[3] = "Adidas";
        for (int i = 0; i<brands.length; i++){  // We can iterate tru all the elements of the arrays
            System.out.println(brands[i]);
            System.out.println();
        }

        int [] scores  = {78, 86, 59, 92, 61};
        System.out.println(scores[2]);
       // 2D array is an array of arrays
        String[][] cars1 = {
                            {"Porsche","Rolls Roles","Mustang"},
                            {"Ranger","Mclaren","Mercedes"},
                            {"Lambo","Ferrari","F-150"}
                            };
        cars1[0][0] = "Porsche";
        cars1[0][1] = "Rolls Royes";
        cars1[0][2] = "Mustang";
        cars1[1][0] = "Ranger";
        cars1[1][1] = "Mclaren";
        cars1[1][2] = "Mercedes";
        cars1[2][0] = "Lambo";
        cars1[2][1] = "Ferrari";
        cars1[2][2] = "F-150";
        //! Another method

        for (int i=0; i<cars1.length; i++ ) {
            System.out.println();
            for(int j =0; j<cars1[i].length; j++){
                System.out.print(cars1[i][j]+ " ");
                System.out.println();
            }
        }

    // ArrayList = A resizable array. Elements can be added and removed after compilation phase . Stores reference data types

        ArrayList<String> food = new ArrayList<>();

        food.add("Rice");
        food.add("Yam");
        food.add("Beans");
        food.add("Salad");
        food.set(1,"Pizza");
        food.remove(2);
        food.clear();

        for(int i =0; i<food.size(); i++) {
            System.out.println(food.get(i));
            System.out.println();
        }
            // 2D ArrayList is a dynamic list of lists  .  You can change the size of these lists during runtime

           ArrayList<ArrayList<String>> groceryList = new ArrayList<>();  // ! 2D List initialization

            ArrayList<String> bakeryList = new ArrayList<>();
            bakeryList.add("Pasta");
            bakeryList.add("donuts");
            bakeryList.add("garlicBread");
            bakeryList.add("Chicken");

            ArrayList<String> produceList = new ArrayList<>();
            produceList.add("paprika");
            produceList.add("tomatoes");
            produceList.add("pepper");

            ArrayList<String> drinkList = new ArrayList<>();
            drinkList.add("Coke");
            drinkList.add("Coffee");
            drinkList.add("soda");

            groceryList.add(bakeryList);
            groceryList.add(produceList);
            groceryList.add(drinkList);
        //System.out.println(groceryList.get(1).get(2));

        for (int i = 0; i <groceryList.size() ; i++) {
            System.out.println(groceryList.get(i));
        }

//        for (int i = 0; i <bakeryList.size(); i++) {
//            System.out.println(bakeryList.get(i)); // using for loop to print out each elements in the arrayList
//        }
//            System.out.println(bakeryList.get(2));  // get(). elements at a specified index

        // For each loop in Java!!
        // for-each traversing technique to iterate through the elements in an array/collection. Less steps, more readable and less readable

        String [] animals = {"Cat", "dog","cheetah", "Lion"};

        ArrayList<String> animals1 = new ArrayList<>();
        animals1.add("Cat");
        animals1.add("Lion");
        animals1.add("Goat");
        for(String i : animals1){
            System.out.println(i);
        }



     }
}
