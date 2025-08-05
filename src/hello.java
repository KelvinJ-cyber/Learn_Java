

import java.util.Scanner;

public class hello {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur Age: ");
        int age = scanner.nextInt();
        if (age >= 18){
            System.out.println("You can vote!!");
        } else if (age < 17 ) {
            System.out.println("You are not able to vote!!,You are just "+ age +"years old for God sake");

        }else{
            System.out.println("Invalid Input!!");
        }
        // ! Logical operators = used to connect two or more expression
        // !                   && = (AND) Both condition must be true
        // !                   || = (OR) either condition must be true
        // !                   ! (NOT) reverses boolean value of condition

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner1.next();
        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game ");
        }else {
            System.out.println("You are still playing the game");
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the Temperature outside ");
        int temp ;
        temp = scanner2.nextInt();

        if (temp > 30){
            System.out.println("It is hot outside!!");

        } else if (temp < 25) {
            System.out.println("It is cold Outside");


        } else if (temp >= 20 && temp <= 27) {
            System.out.println("It warm outside");
        }

     //  !  switch in Java is a statement that allows a variables to be treated for equality against a value
        String day = "Monday";
        switch (day){
            case "Sunday" ->  System.out.println("It is Sunday Go to Church");

            case "Monday" ->  System.out.println("It is Monday Get to Walk!!");

            case "Tuesday" ->  System.out.println("It tuesday Do your thing!!");

            case "Wednesday" ->  System.out.println("It is Wednesday, Midweek!!");

            default -> {
                System.out.println("It is not a valid day of the week!!");


            }

        }
    }

}
