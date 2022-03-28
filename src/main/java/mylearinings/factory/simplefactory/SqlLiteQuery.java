package mylearinings.factory.simplefactory;

public class SqlLiteQuery implements Query{

    @Override
    public void printQuery() {
        System.out.println("https://sqlite/select * from sqlite db");
    }
}
