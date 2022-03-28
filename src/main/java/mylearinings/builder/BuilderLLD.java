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

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Student build(){
        return new Student(this);
    }

}

class Student{
    private String name;
    private String city;
    Student(BuilderLLD builderLLD){
        this.name = builderLLD.getName();
        this.city = builderLLD.getCity();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
