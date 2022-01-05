package com.mycompany.poly.app.helpers;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHelper {
    public static Connection openconConnection() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://localhost;database=PolyApp";
        String dbusername = "demo";
        String password = "demo";
        Connection con = DriverManager.getConnection(connectionUrl, dbusername, password);
        return con;
    }
}
