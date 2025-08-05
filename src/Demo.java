interface Computer {

     void code();

}


class  Laptop implements Computer{

    public void code(){
        System.out.println("compile, run, debug");
    }
}

class Developer {
    public void code(Computer com){
        com.code();
        System.out.println("Write code");
    }
}

class  Desktop implements Computer{

    public void code(){
        System.out.println("compile, run, debug : Faster than laptop! ");
    }
}

public  class Demo {

    public static void main(String[] args) {

        Computer  desk = new Desktop();
        Computer macbook = new Laptop();
        Developer kelvin = new Developer();
        kelvin.code(macbook);

    }

}
