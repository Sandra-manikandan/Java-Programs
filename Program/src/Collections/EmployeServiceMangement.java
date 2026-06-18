package Collections;

import JDBC.Employee;
import JDBC.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeServiceMangement implements EmployeeService {
    Scanner sc= new Scanner(System.in);
    public void EmployeAddDetails(ArrayList<JDBC.Employee> employe){
        System.out.print("Enter Employee id:");
        int emp_id= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter Salary:");
        double salary = sc.nextDouble();
        System.out.println("Inserted Successfully");
        JDBC.Employee emp=new JDBC.Employee(emp_id,name,salary);
        employe.add(emp);
    }

    public void HighestSalary(ArrayList<JDBC.Employee> employee){
        double highSalary=employee.get(0).salary;
        JDBC.Employee tempemp;
        tempemp=employee.get(0);
        for(JDBC.Employee emp:employee){
            if(emp.salary>highSalary){
                highSalary=emp.salary;
                tempemp=emp;
            }
        }
        System.out.println(tempemp.name + "has Highest Salary:"+highSalary);
    }

    public void EmployeeSearch(ArrayList<JDBC.Employee> employee){
        System.out.print("Enter Employee id:");
        int empId=sc.nextInt();
        for(JDBC.Employee emp:employee){
            if(emp.id==empId){
                System.out.println("Name:"+ emp.name+"Salary:"+emp.salary);
                return;
            }
        }
        System.out.println("Employee not Found");

    }

    public void EmployeeDisplay(ArrayList<JDBC.Employee> employe){
        for(Employee emp:employe){
                System.out.println("Id:"+emp.id+" Name:"+ emp.name+" Salary:"+emp.salary);
        }

    }
}
