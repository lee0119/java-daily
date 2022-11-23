package thread;

public class ThreadExample2 {
    public static void main(String[] args) {

        ThreadTask2 thread2 = new ThreadTask2();
        thread2.start();

        for (int i = 0; i < 100; i++) {
            System.out.print("@");

        }
    }
}

class ThreadTask2 extends Thread {
    public void run(){
        for (int i = 0; i <100; i++) {
            System.out.print("#");
        }
}
}
