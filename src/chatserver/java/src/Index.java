package chatserver.java.src;

import java.security.SecureRandom;
import java.util.Scanner;

public class Index {
    public static  void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Number  ");
//        long num = sc.nextInt();
//        long fact = 1;
//        for(long i = 1; i<= num; i++){
//            fact *= i ;
//        }
//        System.out.println(fact);
//        String a = "5";
//        String b = "7";
//        System.out.println(Integer.parseInt(a) + Integer.parseInt(b)); // type casting
//        String[] cars = {"Mclaren","Tesla","Porsche","BMW"};
//        for ( int i = 0; i< cars.length; i++ ){
//            System.out.println(cars[i]);
//        }
//
//        for( String s : cars){
//            System.out.println(s);
//        } // for each loop
//        System.out.println("calculator program " +
//                "Addition(+)");


        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want use the calculate multiple times? ");
        String feedback = sc.next();
        String name = "yes";
        while (feedback.contains(name)) {
            System.out.println("input num1: ");
            int num1 = sc.nextInt();
            System.out.println("input num2: ");
            int num2 = sc.nextInt();
            System.out.println("Choose operator (+ , - , *, / )");
            String operators = sc.next();

            switch (operators) {
                case "+":
                    result = (num1 + num2);
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case "-":
                    result = (num1 - num2);
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case "*":
                    result = (num1 * num2);
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;
                case "/":
                    result = (num1 / num2);
                    System.out.println(num1 + " / " + num2 + "=" + result);
                    break;
                default:
                    System.out.println("Enter a invalid");

            }


        }


        System.out.println("Let's play a game!!");
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number " +
        "Note: if your number is odd your are out if even you are safe :  ");
        int number = scn.nextInt();

        if(number % 2 == 0){
            System.out.println("You are safe!!");
        }else {
            System.out.println("You are out!!");
            SecureRandom random = new SecureRandom();
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Your random number is: " + randomNumber);
            if (randomNumber % 2 == 0) {
                System.out.println("You are safe with the random number!");
            } else {
                System.out.println("You are out with the random number!");
            }
        }
        System.out.println("Enter a number to generate its multiplication table: ");
        int multi = scn.nextInt();;
        System.out.println("Multiplication Table of " + multi);
        for (int i = 1; i< 13; i++){
            System.out.println(multi + " * " + i + " = " + (multi * i) ) ;
        }

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers to store in an array: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scn.nextInt();
        }
        // 2. Print in reverse order
        System.out.println("\nNumbers in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\n\nMaximum number: " + max);
        System.out.println("Minimum number: " + min);

    }

}

