package Collections;
import JDBC.EmployeServiceMangement;
import JDBC.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeMangement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<JDBC.Employee> employe= new ArrayList<Employee>();
        EmployeServiceMangement service=new EmployeServiceMangement();
        while(true) {
            System.out.print("1.Add Employee \n2.Highest Salary\n3.Search\n4.Display\n5.exit \nEnter a Option:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.EmployeAddDetails(employe);
                    break;
                case 2:
                    service.HighestSalary(employe);
                    break;
                case 3:
                    service.EmployeeSearch(employe);
                    break;
                case 4:
                    service.EmployeeDisplay(employe);
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Invalid choice");
            }
        }
    }
}
