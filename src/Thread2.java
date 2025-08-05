class Number extends Thread{

    public void run(){
        for (int i = 1; i <5 ; i++) {
            System.out.println("Number: " + i);

            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class Alphabet extends Thread{

    public void run(){
        for (char i = 'A'; i < 'E'; i++) {
            System.out.println("Letter: " + i);

            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}




public class Thread2 {

    public static void main(String[] args) {
        Number numThread = new Number();
        Alphabet alphaThread = new Alphabet();

//       !  numThread.setPriority(Thread.MAX_PRIORITY);
         alphaThread.setPriority(Thread.MIN_PRIORITY);

        numThread.start();
        alphaThread.start();

        System.out.println("Both threads have completed execution.");
    }
}
