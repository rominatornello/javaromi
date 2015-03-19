package examples.connectionDataBase;


import java.sql.*;

/**
 * Created by Romina.Tornello on 3/17/2015.
 */
public class MysqlAccess {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/example";

    //  Database credentials
    static final String USER = "javaexample";
    static final String PASS = "javaexample";

    private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public void readDataBase()throws Exception{
        try {
            //REGISTER JDBC DRIVER
            Class.forName(JDBC_DRIVER);

            //OPEN THE CONNECTION
            connect = DriverManager.getConnection(DB_URL,USER,PASS);

            //EXECUTE QUERY
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT name,email FROM example.person");

            //SETEO DATOS
            preparedStatement = connect.prepareStatement("INSERT into example.person VALUES (DEFAULT ,?,?)");
            preparedStatement.setString(1, "pepito");
            preparedStatement.setString(2, "pepito@mail.com");
            preparedStatement.executeUpdate();

            resultSet = statement.executeQuery("SELECT * FROM example.person");
            writeMeData(resultSet);
        }catch (Exception e){
            throw e;
        }finally {
            close();
        }
    }

    private void  writeMeData(ResultSet resultSet) throws SQLException{
        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }
}
