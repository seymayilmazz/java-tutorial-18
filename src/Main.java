import javax.xml.crypto.Data;

/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        MySqlDatabase mySqlDatabase = new MySqlDatabase();
        mySqlDatabase.open();
        mySqlDatabase.close();

        SqliteDatabase sqliteDatabase = new SqliteDatabase();
        sqliteDatabase.open();
        sqliteDatabase.close();

    }

}
