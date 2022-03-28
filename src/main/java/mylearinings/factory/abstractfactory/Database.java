package mylearinings.factory.abstractfactory;

public interface Database {
    public void getUrl();
    public void getdbName();
    public Query executeQuery();
    public DbElements getDBElements();
}
