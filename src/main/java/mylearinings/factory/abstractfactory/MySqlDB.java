package mylearinings.factory.abstractfactory;

public class MySqlDB implements Database {
    @Override
    public void getUrl() {
        System.out.println("my sql url");
    }

    @Override
    public void getdbName() {
        System.out.println("my sql");
    }

    @Override
    public Query executeQuery() {
        System.out.println("Executing sql Query");
        return (Query) new MySqlQuery();
    }

    @Override
    public DbElements getDBElements() {
        return new MySQLElements();
    }
}
