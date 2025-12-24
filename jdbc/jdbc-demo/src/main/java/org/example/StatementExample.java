package org.example;

import java.sql.*;

public class StatementExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "root";
        Connection con=null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from users");
             /*int count = stmt.executeUpdate("INSERT INTO users (username, email, password_hash) VALUES ('a1', 'b1', 'c1')");
            System.out.println(count+"Rows are inserted/updated");*/
            while (rs.next()) {;

                System.out.println(
                        rs.getString("id") + " | " +
                                rs.getString("username") + " | " +
                                rs.getString("email")
                );
            }
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if(con!=null) con.close();
        }


    }
}
