import java.util.Date;

public class Main {
    public static void main (String[] args){
     // DATA TYPES
        // Primitive Types
//       byte age = 16;
//       int viewsCount = 123_456_789;
//       long viewCount = 3_123_456_789L;
//       float price = 10.99f;
//       char letter = 'A';
//       boolean If_else = true;
//        System.out.println(age);
//        // Non_Primitive or Reference
//        Date now = new Date();
//        System.out.println(now);
//        String letter_new = "Hello World";

        // ! String a reference data type that can store one or more characters
        // !  reference data types hava access to useful methods

        String names = "Kelvin";
       // boolean result = names.equals("Juice"); // .equals it compares two strings if they are the same
        int result = names.length(); // use to check the length of the string
        char result1 = names.charAt(4); // use to check the character of a string at a specified index
        int result2 = names.indexOf("v");
        boolean result3 = names.isEmpty(); // false
        String result4 = names.toUpperCase();
        String result5 = names.replace("K", "D");

        System.out.println(result5);

        //* 


    }
}
