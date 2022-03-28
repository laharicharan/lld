package mylearinings.factory.abstractfactory;

public class DatabaseFactory {
    public static Database getInstance(String dbName){
        if(dbName.equalsIgnoreCase("mysql")){
            return new MySqlDB();
        }
        else if(dbName.equalsIgnoreCase("sqlite")){
            return new SQLLiteDB();
        }
        return null;
    }
}
