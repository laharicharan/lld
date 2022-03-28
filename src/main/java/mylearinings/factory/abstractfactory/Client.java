package mylearinings.factory.abstractfactory;

public class Client {
    public static void main(String[] args) {
        Database database = DatabaseFactory.getInstance("mysql");
        DbElements dbElements = database.getDBElements();
        Transaction transaction = dbElements.getTranaction();
        Monitor monitor = dbElements.getMonitor();

        transaction.getTractionId();
        transaction.getValue();

        monitor.getStats();
    }
}
