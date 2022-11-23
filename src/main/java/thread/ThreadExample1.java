package thread;

public class ThreadExample1 {
    public static void main(String[] args) {
//
//     Runnable task1 = new ThreadTask1();
//     Thread thread1 = new Thread(task1);
//
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        thread1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
