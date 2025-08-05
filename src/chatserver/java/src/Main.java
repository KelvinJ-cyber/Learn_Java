package chatserver.java.src;

import java.util.Scanner;

class example {
    public static void main(String[] args) {
        System.out.println("Input your Attendance rate");
        Scanner sc = new Scanner(System.in);
        int att = sc.nextInt();
        System.out.println("Input Your CGPA");
        float CGPA = sc.nextFloat();
        if (att >100  || CGPA > 5.0) {
            System.out.println("Invalid Data");
        } else if (att >= 70 && CGPA >= 4.0) {
            System.out.println("you have All fees and all books");
        } else if( att >=70 && CGPA>=3.5){
            System.out.println("You have no fees and half books");
        } else if (att < 70 && CGPA< 3.5){
            System.out.println("You have no fees and no books");
        }else {
            System.out.println("Not Eligible");
        }

        }
    }

