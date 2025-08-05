class Demo1 extends Thread {

    public void run(){
        for (int i = 0; i<100; i++){
            System.out.println(" Thread is running ");
            try {
                Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Demo2 extends Thread {
    public void run(){
        for (int i = 0; i<100; i++){
            System.out.println("Second Thread is running ");
            try {
                Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Threads {


    public static void main(String[] args) {
        Demo1 thr = new Demo1();
        Demo2 thr2 = new Demo2();

        thr2.setPriority(Thread.MAX_PRIORITY-5);

        thr.start();
        thr2.start();


    }

}
