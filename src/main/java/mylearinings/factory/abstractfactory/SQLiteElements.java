package mylearinings.factory.abstractfactory;

public class SQLiteElements implements DbElements{

    @Override
    public Transaction getTranaction() {
        return new SQLiteTransaction();
    }

    @Override
    public Monitor getMonitor() {
        return new SQLiteMonitor();
    }
}
