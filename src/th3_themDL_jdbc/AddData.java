package th3_themDL_jdbc;

import th1_ketnoi_jdbc.ConnectJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddData {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection conn = connectJDBC.connect();

        String query = "INSERT INTO users(username,password,email)"+" VALUES(?,?,?)";
        PreparedStatement pstm = null;
        pstm = conn.prepareStatement(query);

                pstm.setString(1,"Duy dz");
                pstm.setString(2,"2004 ");
                pstm.setString(3,"nguyenhuugiang1907@gmail.com ");
        int row = pstm.executeUpdate();
                if (row != 0){
                    System.out.println("Add thành công !");
                }
                conn.close();
    }
}
