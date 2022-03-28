package mylearinings.factory.simplefactory;

public class SQLLiteDB implements Database{
    @Override
    public void getUrl() {
        System.out.println("SQLIte url");
    }

    @Override
    public void getdbName() {
        System.out.println("SQLIte");
    }

    @Override
    public Query executeQuery() {
        System.out.println("Executing SQLIte Query");
        return new SqlLiteQuery();
    }
}
