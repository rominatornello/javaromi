package examples.connectionDataBase;

/**
 * Created by Romina.Tornello on 3/17/2015.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MysqlAccess dao = new MysqlAccess();
        dao.readDataBase();
    }
}
