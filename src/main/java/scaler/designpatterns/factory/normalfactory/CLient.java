package scaler.designpatterns.factory.normalfactory;

public class CLient {
    public static void main(String[] args) {
        String databaseConfig = "postgre";
        Database db = DatabaseFactory.getDatabaseForConfigValue(
                databaseConfig
        );
//
//        if (databaseConfig == "postgre") {
//            db = new PostgreSQLDatabase();
//        } else if (databaseConfig == "mysql") {
//
//        }
    }
}
