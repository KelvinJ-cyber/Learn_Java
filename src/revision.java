import java.util.Scanner;

public class revision {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Terms: ");
        int n = sc.nextInt();
        sc.close();


        if (n <= 0){
            System.out.println("Please a positive integer: ");
            return;
        }
        int a =1, b= 1, c = 1;
        if (n == 1){
            System.out.println(a);
            return;
        } else if (n == 2) {
            System.out.println(a + " " + b);
            return;
        } else if (n == 3) {
            System.out.println(a + " " + b + " " + c + " ");
            return;
        }
        System.out.println(a + " " + b + " " + c + " ");
        for (int i = 4; i<=n; i++) {
            int next = a + b + c;
            System.out.println(next + " ");
            a = b;
            b = c;
            c = next;
        }




    }
}
