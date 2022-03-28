package mylearinings.factory.abstractfactory;

public class SQLiteMonitor implements Monitor{

    @Override
    public void getStats() {
        System.out.println("SQLite Stats");
    }
}
