package org.example;

import java.sql.*;

public class PreparedExample {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "root";
        Connection con=null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            String sql =
                    "INSERT INTO users (username, email, password_hash) VALUES (?, ?, ?)";

            ps = con.prepareStatement(sql);
            ps.setString(1, "darshan");
            ps.setString(2, "darshan@gmail.com");
            ps.setString(3, "hashed_password_123");

            int count=ps.executeUpdate();
            System.out.println("User inserted");
        } finally {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        }


    }
}
