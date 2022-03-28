package mylearinings.builder;

public class Client {
    public static void main(String[] args) {
        BuilderLLD builderLLD1 = new BuilderLLD()
                .setName("charan")
                .setCity("hyd");

        BuilderLLD builderLLD2 = new BuilderLLD()
                .setName("blc")
                .setCity("blr");

        builderLLD1.printName();
        builderLLD1.printCity();

        builderLLD2.printName();
        builderLLD2.printCity();

    }
}
