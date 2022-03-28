package mylearinings.builder;

public class BuilderLLD {
    private String name;
    private String city;
    BuilderLLD(){
    }

    public BuilderLLD setName(String name){
        this.name = name;
        return this;
    }

    public BuilderLLD setCity(String city){
        this.city = city;
        return this;
    }

    public void printCity(){
        System.out.println("City is "+this.city);
    }

    public void printName(){
        System.out.println("Name is "+this.name);
    }
}
