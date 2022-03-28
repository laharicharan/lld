package mylearinings.factory.abstractfactory;

import mylearinings.factory.simplefactory.Query;

public class SqlLiteQuery implements Query {

    @Override
    public void printQuery() {
        System.out.println("https://sqlite/select * from sqlite db");
    }
}
