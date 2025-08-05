package chatserver.java.src;

import java.util.Scanner;

public class kelvin {
    //factorial method
    public int factorial(int num){
        int fact=1;
        for(int i =1; i<= num; i++){
            fact *= i;
            System.out.println("Fact =  " + fact);
            System.out.println("i= " + i);
        }
        return fact;
    }
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n:  ");
        int n = sc.nextInt();
        System.out.println("Enter value for r:   ");
        int r = sc.nextInt();
        kelvin m = new kelvin ();
        int result = m.factorial(n)/m.factorial(n-r);
        System.out.println(result);

        String day = "Monday";
        System.out.println();





    }


}
