package Collections;
import JDBC.Employee;

import java.util.ArrayList;

public interface EmployeeService {

    public void EmployeAddDetails(ArrayList<JDBC.Employee> employe);

    public void HighestSalary(ArrayList<JDBC.Employee> employee);

    public void EmployeeSearch(ArrayList<JDBC.Employee> employee);

    public void EmployeeDisplay(ArrayList<Employee> employe);

}
