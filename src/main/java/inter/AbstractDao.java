package inter;

import java.sql.Connection;
import java.sql.DriverManager;

public class AbstractDao {

    public Connection connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/restaurant?serverTimezone = UTC&useSSL=false";
        String username = "root";
        String password = "112358";
        Connection c = DriverManager.getConnection(url, username, password);
        return c;
    }
}
