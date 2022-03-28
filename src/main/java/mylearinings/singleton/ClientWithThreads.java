package mylearinings.singleton;

public class ClientWithThreads {

    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
    }
}

class MyThread implements Runnable{

    @Override
    public void run() {
        runThreadNotSafeSingleton();
        System.out.println("$$$$$$$ Starting ThreadSafe Singleton Object Creation $$$$$$$");
        runThreadSafeSingleton();
    }

    private void runThreadSafeSingleton(){
        SingletonLLDThreadSafe s = SingletonLLDThreadSafe.getInstance();
        s.printRandomString();
    }

    private void runThreadNotSafeSingleton(){
        SingletonLLD s = SingletonLLD.getInstance();
        s.printRandomString();
    }
}
