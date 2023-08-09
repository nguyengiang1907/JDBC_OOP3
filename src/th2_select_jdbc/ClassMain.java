package th2_select_jdbc;

import th1_ketnoi_jdbc.ConnectJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassMain {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();
        // Tạo yêu cầu xử lí với CSDL
        String query = "SELECT * FROM users";

        // Statement cung cấp các phương thức tạo ra ResultSet
        Statement stm = null;
        try {
            stm = conn.createStatement();

            // Resultset được dùng để lưu lại data của csdl
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                //  show ra nhưngx query đã xử lí
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                System.out.println(id + " - " + username + " - " + password + " - " + email);
            }
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
