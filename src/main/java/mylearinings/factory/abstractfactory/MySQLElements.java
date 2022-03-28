package mylearinings.factory.abstractfactory;

public class MySQLElements implements DbElements{

    @Override
    public Transaction getTranaction() {
        return new MySQLTranaction();
    }

    @Override
    public Monitor getMonitor() {
        return new MySQLMonitor();
    }
}
