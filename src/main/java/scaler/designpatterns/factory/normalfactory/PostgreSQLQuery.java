package scaler.designpatterns.factory.normalfactory;

public class PostgreSQLQuery implements Query {
    @Override
    public String getQueryString() {
        return null;
    }

    @Override
    public void execute() {
        System.out.println("Postgre query is getting" +
                "executed");
    }
}
