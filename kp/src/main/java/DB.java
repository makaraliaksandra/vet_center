import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DB {//for commit
    String url = "jdbc:mysql://localhost:3306/vet";
    String login ="root";
    String password ="root";
    public DB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, login, password);
    }
}
