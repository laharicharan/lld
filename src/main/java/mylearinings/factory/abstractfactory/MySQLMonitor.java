package mylearinings.factory.abstractfactory;

public class MySQLMonitor implements Monitor{

    @Override
    public void getStats() {
        System.out.println("MySQL Monitor");
    }
}
