package scaler.designpatterns.factory.abstractfactory;

public interface Database {

    String getUrl();
    int getConnectionLimit();
    String getDescriptor();
    DatabaseElements getDatabaseElements();
}
