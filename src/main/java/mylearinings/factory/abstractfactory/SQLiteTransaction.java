package mylearinings.factory.abstractfactory;

public class SQLiteTransaction implements Transaction{

    @Override
    public void getTractionId() {
        System.out.println("123");
    }

    @Override
    public void getValue() {
        System.out.println("123456789");
    }
}
