/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public abstract class Database {

    private String databaseName;

    public Database(){

    }

    public Database(String databaseName){
        this.databaseName = databaseName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void update(){
        /* ... */
        /* ... */
    }

    public abstract void open();

    public abstract void close();

}
