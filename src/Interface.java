interface A{

    String name = "Kelvin";
    int age = 25;

    void show();
    void display();
}

class B implements A {

    public void show(){
        System.out.println("Show method from interface A implemented in class B");
    }

    public void display(){
        System.out.println("Display method from interface A implemented in class B");
    }
}


public class Interface {

    public static void main(String[] args ){
        B obj = new B();
        obj.show();
        obj.display();
        System.out.println("Name: " + A.name);
        System.out.println("Age: " + A.age);
    }
}