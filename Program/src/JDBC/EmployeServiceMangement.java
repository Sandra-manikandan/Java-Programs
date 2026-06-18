package JDBC;

import java.sql.*;
import java.util.*;

public class EmployeServiceMangement implements EmployeeService {
    Scanner sc= new Scanner(System.in);
    try{

            public void EmployeAddDetails(){
            Connection con=EmployeeDBConnection.getConnection();
            System.out.print("Enter Employee id:");
            int emp_id= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name:");
            String name = sc.nextLine();
            System.out.print("Enter Salary:");
            int salary = sc.nextInt();

            String sql="INSERT INTO EMPLOYEEDB VALUES (?,?,?)";

            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, emp_id);
            ps.setString(2, name);
            ps.setInt(3, salary);

            ps.executeUpdate();

            System.out.println("Inserted Successfully");


        }
    }

    public void HighestSalary(){

        try{
            int highSalary=employee.get(0).salary;
        Employee tempemp;
        tempemp=employee.get(0);
        for(Employee emp:employee){
            if(emp.salary>highSalary){
                highSalary=emp.salary;
                tempemp=emp;
            }
        }
        System.out.println(tempemp.name + "has Highest Salary:"+highSalary);
    }

    public void EmployeeSearch(ArrayList<Employee> employee){
        System.out.print("Enter Employee id:");
        int empId=sc.nextInt();
        for(Employee emp:employee){
            if(emp.id==empId){
                System.out.println("Name:"+ emp.name+"Salary:"+emp.salary);
                return;
            }
        }
        System.out.println("Employee not Found");

    }

    public void EmployeeDisplay(ArrayList<Employee> employe){
        for(Employee emp:employe){
                System.out.println("Id:"+emp.id+" Name:"+ emp.name+" Salary:"+emp.salary);
        }

    }
}
