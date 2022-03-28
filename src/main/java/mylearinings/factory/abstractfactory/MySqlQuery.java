package mylearinings.factory.abstractfactory;

import mylearinings.factory.simplefactory.Query;

public class MySqlQuery implements Query {

    @Override
    public void printQuery() {
        System.out.println("https://mysql/select * from sql db");
    }
}
