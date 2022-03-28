package mylearinings.singleton;

public class Client {
    public static void main(String[] args) {
        SingletonLLD singletonLLD1 = SingletonLLD.getInstance();
        SingletonLLD singletonLLD2 = SingletonLLD.getInstance();
        SingletonLLD singletonLLD3 = SingletonLLD.getInstance();

    }
}
