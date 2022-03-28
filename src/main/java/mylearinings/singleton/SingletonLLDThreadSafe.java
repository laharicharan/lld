package mylearinings.singleton;

import java.util.Random;

public class SingletonLLDThreadSafe {
    static SingletonLLDThreadSafe singletonLLD = null;
    private SingletonLLDThreadSafe(){
        System.out.println("Created an Object of SingletonLLD Class");
    }

    public static SingletonLLDThreadSafe getInstance(){
        if(singletonLLD != null){
            System.out.println("Returning already created Object");
            return singletonLLD;
        }

        synchronized (SingletonLLDThreadSafe.class){
            if(singletonLLD == null) {
                singletonLLD = new SingletonLLDThreadSafe();
            }
        }
        return singletonLLD;
    }

    public void printRandomString(){
        Random random = new Random();
        System.out.println("this is random string"+random.nextInt(1000));
    }
}
