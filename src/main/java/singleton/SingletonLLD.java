package singleton;

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
}
