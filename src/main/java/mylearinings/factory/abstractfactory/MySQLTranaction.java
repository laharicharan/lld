package mylearinings.factory.abstractfactory;

public class MySQLTranaction implements Transaction{

    @Override
    public void getTractionId() {
        System.out.println("325896");
    }

    @Override
    public void getValue() {
        System.out.println("852852987");
    }
}
