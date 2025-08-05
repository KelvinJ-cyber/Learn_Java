public class Pizza {
    String bread;
    String sources;
    String cheese;
    String topping;

    Pizza(String bread){
        this.bread = bread;
    }

    Pizza(String bread, String sources, String cheese){
        this.bread = bread;
        this.sources = sources;
        this.cheese = cheese;
    }

    Pizza(String bread, String sources){
        this.bread = bread;
        this.sources = sources;

    }

    Pizza(String bread, String sources, String cheese, String topping){
        this.bread = bread;
        this.sources = sources;
        this.topping = topping;
        this.cheese = cheese;

    }

}
