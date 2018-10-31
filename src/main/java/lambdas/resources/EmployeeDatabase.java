package lambdas.resources;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase implements Database<Employee>{
    List<Employee> employees = new ArrayList<>();


    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    public Employee findById(int id) {
        Employee employee = null;
        for (Employee e: employees) {
            if( e.getId() == id ) {
                employee = e;
                break;
            }
        }
        return  employee;
    }
}
