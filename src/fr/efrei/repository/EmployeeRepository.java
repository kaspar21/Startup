package fr.efrei.repository;
import fr.efrei.domain.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static EmployeeRepository repository = null;
    private List<Employee> employeeDB = null;

    private EmployeeRepository() {
        employeeDB = new ArrayList<Employee>();
    }

    public static EmployeeRepository getRepository() {
        if (repository == null){
            return new EmployeeRepository();
        }
        return repository;
    }


    @Override
    public Employee create(Employee employee) {
        boolean success = employeeDB.add(employee); //indeed, add method returns a boolean
        if (success){
            return employee;
        }
        else {
            return null;
        }
    }



    public Employee read(String s) {
        for (Employee e : employeeDB){
            if (e.getEmployeeID().equals(s)){
                return e;
            }
        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getEmployeeID());
        if (employee != null){
            employeeDB.remove(oldEmployee); //take the object away from the data structure
            employeeDB.add(employee);
            return employee;
        }
        return null;
    }


    public boolean delete(String s) {
        Employee employeeToDelete = read(s);
        if (employeeToDelete == null) {
            return false;
        }
        employeeDB.remove(employeeToDelete);
        return true;
    }

    @Override
    public List<Employee> getAll() {
        return employeeDB;
    }

}