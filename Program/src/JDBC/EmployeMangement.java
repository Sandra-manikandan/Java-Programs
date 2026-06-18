package JDBC;
import java.sql.*;
import java.util.*;

public class EmployeMangement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        EmployeServiceMangement service=new EmployeServiceMangement();
        while(true) {
            System.out.print("1.Add Employee \n2.Highest Salary\n3.Search\n4.Display\n5.exit \nEnter a Option:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.EmployeAddDetails();
                    break;
                case 2:
                    service.HighestSalary();
                    break;
                case 3:
                    service.EmployeeSearch();
                    break;
                case 4:
                    service.EmployeeDisplay();
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Invalid choice");
            }
        }
    }
}
