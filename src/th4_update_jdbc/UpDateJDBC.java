package th4_update_jdbc;

import th1_ketnoi_jdbc.ConnectJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpDateJDBC {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();

        String query = "UPDATE users SET username = ? , password = ? , email = ? WHERE id = 4";
        PreparedStatement pstm = null;
        pstm = conn.prepareStatement(query);
        pstm.setString(1,"Giang dz");
        pstm.setString(2,"2004");
        pstm.setString(3,"ng19072004@gmail.com");
        int row = pstm.executeUpdate();
        if (row != 0){
            System.out.println("UPDATE thành công !");
        }
        conn.close();
    }
}
