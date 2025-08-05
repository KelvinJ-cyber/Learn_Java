package chatserver.java.src;

import java.util.Scanner;

public class Loops {
    public static void main (String [] args ) {
// While Loop executes a block of code as long as a conditions remains true
        Scanner scanner = new Scanner(System.in);
        String name = "";
      do{
          System.out.println("Enter your name: ");
          name = scanner.nextLine();
      }while (name.isBlank());
        System.out.println("Hello "+ name);

        // For Loop executes a block of code a limited amount of time
           //start   //end  //step
       for(int i = 10; i>=0; i-=2){
           System.out.println(i);
       }
        System.out.println("Happy New Year");

       // !  Nested Loops = loop inside of a loop
        Scanner scanner1 = new Scanner(System.in);
        int row;
        int colum;
        String symbols= "";
        System.out.println("Enter number of rows ");
        row = scanner1.nextInt();
        System.out.println("Enter number of columns ");
        colum = scanner1.nextInt();
        System.out.println("Enter symbol to use ");
        symbols = scanner.next();

        for (int i =1; i<=row; i++){
            System.out.println();
            for(int j = 1; j<= colum; j++){
             System.out.print(symbols);
            }
        }

        int i =1;

        while (true){
            System.out.println("Hi" + i);
            i++;
        }

    }

}
