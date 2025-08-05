enum Status {
     Running,  Failed,  Success,  Pending, Started ;
}


class Testing{

    public static void main(String[] args) {
        Status stats = Status.Success;
        System.out.println("Status: " + stats);

//        for (Status stat : Status.values()){
//            System.out.println(stat);}

        switch (stats){
            case Running -> System.out.println("The process is currently running.");

            case Failed -> System.out.println("The process has failed. Try again! ");

            case Success -> System.out.println("The process was successful. You are all set!");

            case Pending -> System.out.println("The process is pending. Please wait.");

            default -> System.out.println("Unknown status. Go check your code!");
        }

    }

}