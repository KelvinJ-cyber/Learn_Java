// ! This is polymorphism example in Java

public class Vehicle {

    public void start() {
        System.out.println("Vehicle is starting");
    }
}


class Car1 extends  Vehicle{
    @Override
    public void start() {
        System.out.println("Car is started");
    }
}


class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is started");
    }
}


class Garage{

    public static void main(String[] args){
        Bike obj = new Bike();
        obj.start();
    }
}

