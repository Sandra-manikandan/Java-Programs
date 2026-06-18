package JDBC;

import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");

            Connection con =
                    DBConnection.getConnection();

            System.out.println(
                    "Connected Successfully!"
            );

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}