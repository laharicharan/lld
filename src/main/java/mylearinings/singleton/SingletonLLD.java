package mylearinings.singleton;

import java.util.Random;

public class SingletonLLD {
    static SingletonLLD singletonLLD = null;
    private SingletonLLD(){
        System.out.println("Created an Object of SingletonLLD Class");
    }

    public static SingletonLLD getInstance(){
        if(singletonLLD != null){
            System.out.println("Returning already created Object");
            return singletonLLD;
        }
        singletonLLD = new SingletonLLD();

        return singletonLLD;
    }

    public void printRandomString(){
        Random random = new Random();
        System.out.println("this is random string"+random.nextInt(1000));
    }
}
