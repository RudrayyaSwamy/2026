package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {

      //  Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String user = "root";
        String password = "root";

        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connected successfully");
        con.close();
    }
}