package JDBC;

import java.sql.*;

public class EmployeeDBConnection {
    public static final String URL ="jdbc:mysql://localhost:3306/employeedb";
    private static final String USER = "root";
    private static final String PASSWORD = "Mmk@2006";

    public static void main(String[] args){
        try{
            private static final String USER = "root";
            private static final String PASSWORD = "Mmk@2006";
            Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("Connected!");
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
