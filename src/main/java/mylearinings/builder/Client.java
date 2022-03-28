package mylearinings.builder;

public class Client {
    public static void main(String[] args) {
        Student s = new BuilderLLD()
                .setName("charan")
                .setCity("hyd")
                .build();

        System.out.println(s.getCity());
        System.out.println(s.getName());



    }
}
