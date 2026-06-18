package JDBC;
import java.util.*;
import java.sql.*;


public class StudentService implements Service {
    Scanner sc = new Scanner(System.in);

    public void addDetails() {

        try {
            Connection con = DBConnection.getConnection();

            System.out.print("Enter Roll No: ");
            int roll_no = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Total Mark: ");
            int total_mark = sc.nextInt();

            String sql = "INSERT INTO student VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll_no);
            ps.setString(2, name);
            ps.setInt(3, total_mark);

            ps.executeUpdate();

            System.out.println("Inserted Successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {

        try {
            Connection con = DBConnection.getConnection();

            System.out.print("Enter Roll No: ");
            int roll_no = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter new Name: ");
            String name = sc.nextLine();

            System.out.print("Enter updated Mark: ");
            int mark = sc.nextInt();

            String sql = "UPDATE student SET name=?, total_mark=? WHERE roll_no=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, mark);
            ps.setInt(3, roll_no);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Updated Successfully");
            else
                System.out.println("Student not found");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {

        try {
            Connection con = DBConnection.getConnection();

            System.out.print("Enter Roll No: ");
            int roll_no = sc.nextInt();

            String sql = "DELETE FROM student WHERE roll_no=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll_no);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Deleted Successfully");
            else
                System.out.println("Student not found");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void display() {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM student";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        "Roll_no: " + rs.getInt(1) +
                                " Name: " + rs.getString(2) +
                                " TotalMark: " + rs.getInt(3)
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }



