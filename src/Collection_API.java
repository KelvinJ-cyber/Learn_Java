import java.util.*;

public class Collection_API {

    public static void main(String[] args) {

        Collection<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

        for (int n : num){
            System.out.println(n);
        }

        List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jane");
        names.add("David");

        System.out.println(names.get(2));

        for (String name : names){
            System.out.println(name);
        }
        System.out.println();

        // Set only allows unique elements
        Set<String> name = new TreeSet<>();
        name.add("John");
        name.add("Jane");
        name.add("Kelvin");
        name.add("John"); // Duplicate, will not be added
        name.add("Kelvin"); // Duplicate, will not be added
        name.add("Bobby");

        for (String n : name ){
            System.out.println(n);
        }
        // Output will not be in the order of insertion
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(5);
        numbers.add(56);

        for (int n : numbers ){
            System.out.println(n);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Kelvin", 18);
        map.put("David", 20);

        System.out.println(map);
    }

}
