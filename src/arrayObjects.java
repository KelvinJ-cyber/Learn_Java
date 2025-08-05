public class arrayObjects {
    public  static void main (String [] args){

        int[] numbers = new int[4];
        char[] characters = new char[3];
        String[] string = new String[5];

//        arrayFood [] refrigerator = new arrayFood[3];

        arrayFood food1 = new arrayFood("Yam","LaCasera");
        arrayFood food2 = new arrayFood("Chicken","Sprite");
        arrayFood food3 = new arrayFood("Rice","Water");

        arrayFood [] refrigerator = {food1,food2,food3};

//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;

        System.out.println(refrigerator[0].food);
        System.out.println(refrigerator[1].drink);
        System.out.println(refrigerator[2].food);





    }
}
