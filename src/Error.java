public class Error {

    public static void main(String[] args) {
        int i = 2;
        int j = 0;

        int[] numbers = new int[4];
        numbers[3] =10;

        try
        {
            j= 10/i;
            System.out.println(numbers[5]);
        }
        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
        System.out.println(j);

    }
}
