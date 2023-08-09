package bt1_addproducts_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Products_jdbc {
    private String hostName = "localhost:3306";
    private String dbname = "product_manager_database";
    private String username = "root";
    private String password = "giang";
    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbname;

    public Connection connection() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection(connectionURL,username,password);
        System.out.println("Kết nối thành công !");
        return conn;
    }
}
