package org.example;

import java.sql.*;

public class CallableExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";

        Connection con = null;
        CallableStatement csInsert = null;
        CallableStatement csSelect = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

//            csInsert = con.prepareCall("{call insert_user(?, ?)}");
//            csInsert.setString(1, "Darshan");
//            csInsert.setString(2, "pass123");
//            csInsert.execute();
//
//            System.out.println("User inserted");

            // =========================
            // SELECT PROCEDURE
            // =========================
            csSelect = con.prepareCall("{call get_all_users()}");
            rs = csSelect.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("password")
                );
            }

        } finally {

            // CLOSE RESULTSET
                if (rs != null) rs.close();
                if (csSelect != null) csSelect.close();
                if (csInsert != null) csInsert.close();
                if (con != null) con.close();
        }
    }
}
