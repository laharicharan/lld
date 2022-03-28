package mylearinings.factory.simplefactory;

public class MySqlDB implements Database{
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
        return new MySqlQuery();
    }
}
