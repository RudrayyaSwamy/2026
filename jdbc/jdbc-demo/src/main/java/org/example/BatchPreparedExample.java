package org.example;

import java.sql.*;

public class BatchPreparedExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "root";
        Connection con=null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql =
                    "INSERT INTO users (username, email, password_hash) VALUES (?, ?, ?)";

            ps = con.prepareStatement(sql);

            for (int i = 1; i <= 10; i++) {
                ps.setString(1, "user" + i);
                ps.setString(2, "user" + i + "@gmail.com");
                ps.setString(3, "hash" + i);
                ps.addBatch();
            }

            ps.executeBatch();
            System.out.println("Batch insert completed");
        }  finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        }


    }
}
