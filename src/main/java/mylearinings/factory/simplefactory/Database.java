package mylearinings.factory.simplefactory;

public interface Database {
    public void getUrl();
    public void getdbName();
    public Query executeQuery();
}
