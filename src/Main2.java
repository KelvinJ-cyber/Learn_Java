public class Main2 {
    public static void main (String [] args){
        int x =3;
        int y = 4;

       int z =  number(x,y);
        System.out.println(z);

        String name = "Hope";
        int age = 17;
        hello(name, age);
    }

    static void hello(String name , int age){
        System.out.println("Hello Bitch "+ name);
        System.out.println("You are "+ age);

    }
    static int number(int x, int y){
        int z = x + y;
        return z;

    }
}
