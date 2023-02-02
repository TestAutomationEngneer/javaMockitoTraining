package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private final List<Employee> employeeList = new ArrayList<>();

    public List<Employee> findAll() {
        List<Employee> copy;
        if (employeeList.size() > 0) {
             copy = List.copyOf(employeeList);
             return copy;
        }
       return null;
    }

    public void save() {
        if(this.employeeList.size()==0) {
            employeeList.add(new Employee(1, "Angelina", "Jolie", 10000.00));
            employeeList.add(new Employee(2, "Salma", "Hayek", 12000.00));
            employeeList.add(new Employee(3, "Brad", "Pitt", 14000.00));
            employeeList.add(new Employee(4, "Tom", "Hanks", 16000.00));
            employeeList.add(new Employee(4, "Tom", "Cruise", 18000.00));
            employeeList.add(new Employee(4, "Camila", "Cabeho", 20000.00));
        }
    }
}
