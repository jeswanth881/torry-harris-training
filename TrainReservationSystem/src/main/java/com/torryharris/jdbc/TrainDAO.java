package com.torryharris.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TrainDAO {
    public static Connection trainDAO(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://127.0.0.1:3306/trainBookingDB";
            String username="root";
            String password="Jeswanth@2000";
            Connection connection= DriverManager.getConnection(url,username,password);
            System.out.println("Connected to DB successfully");
            System.out.println();
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
