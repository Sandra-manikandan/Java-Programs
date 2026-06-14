package Collections;

import java.util.*;

public class EmployeServiceMangement implements EmployeeService {
    Scanner sc= new Scanner(System.in);
    public void EmployeAddDetails(ArrayList<Employee> employe){
        System.out.print("Enter Employee id:");
        int emp_id= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter Salary:");
        double salary = sc.nextDouble();
        System.out.println("Inserted Successfully");
        Employee emp=new Employee(emp_id,name,salary);
        employe.add(emp);
    }

    public void HighestSalary(ArrayList<Employee> employee){
        double highSalary=employee.get(0).salary;
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
