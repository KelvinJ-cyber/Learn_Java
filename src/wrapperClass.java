import java.util.ArrayList;
import java.util.Scanner;

public class wrapperClass {
    public static void main (String [] args) {
//    // wrapper class = provides a way to use primitive data types as reference data type
//    //                 reference data types contains useful methods   can be used with collection (ex. ArrayList)
//
//    // Wrapper class
//    //-------------
//    // Boolean
//    // Character
//    // Integer
//    // Double
//
//        //* Autoboxing
//        Boolean a = true;
//        Character b = '@';
//        Integer c = 123;
//        Double e = 3.14;
//        String f = "Kelvin";
//
        double totalCLxGP = 0;
        int totalCL = 0;
        int count = 0;
        String sClass;
        double grading;
        ArrayList<String> course = new ArrayList<>();

        ArrayList <Integer> creditLoad = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many courses: ");
        int amountCuz = sc.nextInt();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the Name of Course: ");
            String course1 = scanner.next();
            course.add(course1);
            System.out.println("Enter Credit Unit: ");
            int creditLoadValue = scanner.nextInt();
            creditLoad.add(creditLoadValue);

            count++;

            if (count == amountCuz) {
                break;
            }
            if (count == creditLoadValue) {
                break;
            }
        }


         Scanner sc1 = new Scanner(System.in);
        for (int i = 0; i < course.size(); i++) {
            System.out.println("Enter score for " + course.get(i) + " : ");
            int score = sc1.nextInt();
            double gradePoints = getGradePoints(score);
            totalCLxGP += creditLoad.get(i) * gradePoints;
            totalCL += creditLoad.get(i);

            }
        double cgpa = totalCLxGP / totalCL;

        if(cgpa >= 4.5 && cgpa <=5.0) {
            sClass = "First Class";
            grading = cgpa;
            System.out.println("Your Grading for This Section is " + sClass + "  with  " + grading + "  cgpa ");

        } else if (cgpa >= 3.50){
            sClass = "Second Class Upper";
            grading = cgpa;
            System.out.println("Your Grading for This Section is " + sClass + "  with  " + grading + "  cgpa ");
        } else if (cgpa >= 2.40){
            sClass = "Second Class Lower";
            grading = cgpa;
            System.out.println("Your Grading for This Section is " + sClass + "  with  " + grading + "  cgpa ");
        } else if (cgpa >= 1.50){
            sClass = "Third Class";
            grading = cgpa;
            System.out.println("Your Grading for This Section is " + sClass + "  with  " + grading + "  cgpa ");
        } else {
            System.out.println("You Failed !!");
        }





    }

       private static double getGradePoints(int score) {
        if (score >= 70) {
            return  5.0;
        }
        else if (score >= 60) {
            return 3.0;
        } else if (score >= 50) {
            return 2.0;

        } else if (score >=45) {
            return 2.0;
        } else if (score >= 40) {
            return 1.0;
        }
        else
            return 0.0;
    }

}
