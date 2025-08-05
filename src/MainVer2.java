public class MainVer2 {
    public static void main (String [] args){
        // overloaded constructors = multiple constructors with a class with the same name
        //                           but have different parameters
        //                           name + parameters = signature

        Pizza pizza = new Pizza("Thick Crust", "Tomato","mozzarella", "pepperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        System.out.println(pizza.sources);

    }
}
