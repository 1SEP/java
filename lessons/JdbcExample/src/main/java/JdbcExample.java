import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by aspire on 03.07.2015.
 */

public class JdbcExample {
    public static void main(String[] args) {
        String user = "USER_Login";
        String password = "User_Password";
        String url = "jdbc:mysql://localhost:3306/MyDataBaseName";
        String driver = "mysql.jdbc.driver.MySqlDriver";

        try{
            Class.forName(driver);
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Connection connection = null;

        try{
            connection = DriverManager.getConnection(url, user, password);
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from Table_Name");
            while(rs.next()){
                System.out.println(rs.getString("Login"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if(connection != null)
                    connection.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
