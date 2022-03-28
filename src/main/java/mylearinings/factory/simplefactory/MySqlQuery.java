package mylearinings.factory.simplefactory;

public class MySqlQuery implements Query{

    @Override
    public void printQuery() {
        System.out.println("https://mysql/select * from sql db");
    }
}
