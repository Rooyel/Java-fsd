package practice_project.assisted_practice2;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread extended from Thread class is running.");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread implemented from Runnable interface is running.");
    }
}

public class P01 {
    public static void main(String[] args) {
        // Creating thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Creating thread by implementing Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}
