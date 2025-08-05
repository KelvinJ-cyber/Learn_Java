public class overloadedMethods {


    public static void main (String [] args){
        // overloaded methods = methods that shares the same name but have difference parameter
        //                      method name + parameters = method signature
        int x = add(1,2, 4, 5);
        System.out.println(x);
    }
    static int add(int a, int b){
        System.out.println("This overloaded #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This overloaded #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This overloaded #3");
        return a + b + c - d;
    }
   public static final String name = "Kelvin";
}