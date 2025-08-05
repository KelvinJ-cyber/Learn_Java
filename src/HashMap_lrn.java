import java.util.*;


public class HashMap_lrn {



    public static void main(String[] args) {

        HashMap<String, Integer> personAge = new HashMap<>();

        // Adding key-value pairs to the HashMap
        personAge.put("Kelvin", 16);
        personAge.put("John", 20);
        personAge.putAll( Map.of("Jane", 18, "Doe", 22,"Dan",38)); // Adding multiple entries
        personAge.put("Alice", 25);



        for (Map.Entry<String, Integer> person : personAge.entrySet()){
            System.out.println(person);
        }

        Map<String, List<String>> userDetails = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);



        System.out.println("How many users do you want to add?: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.print("Enter User ID: ");
            String userId = sc.nextLine();

            System.out.println("Enter your first name: ");
            String f_name = sc.nextLine();

            System.out.println("Enter your last name: ");
            String l_name = sc.nextLine();

            System.out.println("Enter your email: ");
            String email = sc.nextLine();

            System.out.println("Enter your password: ");
            String password = sc.nextLine();


            List<String> userInfo = new ArrayList<>();
            userInfo.add(f_name);
            userInfo.add(l_name);
            userInfo.add(email);
            userInfo.add(password);

            userDetails.put(userId, userInfo);
            System.out.println("User " + userId + " added successfully! ✅");
            for (String info : userInfo){
                System.out.println(info);
            }

        }
    }
}
