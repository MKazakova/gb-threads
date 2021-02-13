public class ThreadTest2 {
    public static void main(String ... args) {
        System.out.println(Thread.currentThread().getName());
        Runnable r1 = () -> System.out.println("Running from "+Thread.currentThread());
        for(int i= 0; i <100; i++) {
            //Thread thread = new Thread(new MyThreadRunnable());
           // Thread thread = new Thread(r1);
            //Thread thread = new Thread(() -> System.out.println("Running from "+Thread.currentThread().getName()));
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread());
                Thread innerThread = new Thread(r1);
                innerThread.start();
            });
            thread.start();
        }
    }
}
/*
class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Running from "+Thread.currentThread().getName());
    }
}*/
