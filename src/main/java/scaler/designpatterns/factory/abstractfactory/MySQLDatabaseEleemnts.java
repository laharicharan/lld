package scaler.designpatterns.factory.abstractfactory;

public class MySQLDatabaseEleemnts implements DatabaseElements {

    @Override
    public Connection getConnection() {
        return new MySQLConnection();
    }

    @Override
    public Query getQuery() {
        return new MySQLQuery();
    }

    @Override
    public Transaction getTransaction() {
        return new MySQLTransaction();
    }
}
