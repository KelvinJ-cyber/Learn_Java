import java.util.Scanner;

public class methods {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String [] course = {"MTH101","CHM101","PHY101","SEN181","GST101","GST102"};
        int [] creditLoad = {3,2,2,2,1,1 };
        double totalCLxGP = 0;
        int totalCL = 0;

        for (int i = 0; i < course.length; i++) {
            System.out.println("Enter score for " + course[i] + " : ");
            int score = sc.nextInt();
            double gradePoint = getGradePoint(score);
            totalCLxGP += creditLoad[i] * gradePoint;
            totalCL += creditLoad[i];
        }

        double cgpa = totalCLxGP / totalCL;
        System.out.println("CGPA:" + cgpa);
    }

    private static double getGradePoint(int score) {
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
