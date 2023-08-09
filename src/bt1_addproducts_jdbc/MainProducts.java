package bt1_addproducts_jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainProducts {
    public static void main(String[] args) throws SQLException {
        Products_jdbc productsJdbc = new Products_jdbc();
        Connection coon = productsJdbc.connection();
        selectFromDatabase(coon);
//        addRecorFromDatabase(coon);
//        updateFromDatabase(coon);
//        deleteFromDatabase(coon);
    }

    private static void deleteFromDatabase(Connection coon) throws SQLException {
        String query = "DELETE FROM products WHERE id = 4";
        Statement sttm = null;
        sttm = coon.createStatement();
        int row = sttm.executeUpdate(query);
        if (row != 0){
            System.out.println("DELETE thành công !");
        }
        coon.close();
    }

    private static void updateFromDatabase(Connection coon) throws SQLException {
        String query = "UPDATE products SET number = 20 , status = false  WHERE id = 6";
        Statement sttm = null;
        sttm = coon.createStatement();
        int row = sttm.executeUpdate(query);
        if (row != 0) {
            System.out.println("Cập nhật thành công !");
        }
        coon.close();
    }

    private static void selectFromDatabase(Connection coon) throws SQLException {
        String query = "SELECT * FROM products WHERE status = 1 AND number = 100";
        Statement sttm = null;
        sttm = coon.createStatement();
        ResultSet rs = sttm.executeQuery(query);
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            Double price = rs.getDouble("price");
            String detail = rs.getString("detail");
            String manufacturer = rs.getString("manufacturer");
            int number = rs.getInt("number");
            boolean status = rs.getBoolean("status");
            System.out.println("mã sản phẩm : " + id + " - tên sản phẩm : " + name + " - giá sản phẩm : " + price + " - chi tiết sản phẩm : " + detail + " -  hãng sản xuất : " + manufacturer + " - số lượng sản phẩm : " + number + " - status : " + status);
        }
        coon.close();
    }

    private static void addRecorFromDatabase(Connection conn) throws SQLException {
        String query = "INSERT INTO products(name,price,detail,manufacturer,number,status) VALUES('kính',100000,'kính  chống ánh sáng xanh','tokio',100,true)";
        Statement sttm = conn.createStatement();
        int row = sttm.executeUpdate(query);
        if (row != 0) {
            System.out.println("Thêm thành công ! ");
        }
        conn.close();
    }

}
