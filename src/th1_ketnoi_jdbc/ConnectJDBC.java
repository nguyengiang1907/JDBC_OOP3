package th1_ketnoi_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    // Tạo tài khoản hostName lấy mã từ mysql muốn truy vấn trong đó localhost hoặc 127.0.0.1
    private String hostName = "localhost:3306";
    // Khai báo biến chứa tên DataBase
    private String dbName = "demo_jdbc";
        // Khai báo biến chứa tên tài khoản
    private String userName = "root";
    // Khai báo biến chứa mật khẩu tài khoản
    private String password = "giang";
    // Khai báo biến chứa kết đến mysql có qua hostName và tên database
    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;


    public Connection connect () throws SQLException {
        // dùng connection để kết kết nối Database
        Connection conn = null;
            // liên kết thông qua url và tài khoản và mật khẩu của cơ sở dử liệu
            // DriverManager được dùng để kết nối với CSDL
            conn = DriverManager.getConnection(connectionURL,userName,password);
            System.out.println("Kết nối thành công");

        // trả về đối tượng connection
        return conn;
    }
}
