package mylearinings.factory.simplefactory;

public class Client {
    public static void main(String[] args) {
        Database database = DatabaseFactory.getInstance("sqlite");
        Query query = database.executeQuery();
        query.printQuery();
    }
}
