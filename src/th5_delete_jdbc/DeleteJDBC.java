package th5_delete_jdbc;

import th1_ketnoi_jdbc.ConnectJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteJDBC {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();

        String query = "DELETE FROM users WHERE id = 5";
        PreparedStatement pstm =  null;
        pstm = conn.prepareStatement(query);
        int row = pstm.executeUpdate();
        if (row != 0){
            System.out.println("DELETE thành công !");
        }
        conn.close();
    }

}
