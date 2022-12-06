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


    @Override
    public Employee read(Integer i) {
        for (Employee e : employeeDB){
            if (e.getEmployeeID() == i){
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

    @Override
    public boolean delete(Integer i) {
        Employee raceToDelete = read(i);
        if (raceToDelete == null) {
            return false;
        }
        employeeDB.remove(raceToDelete);
        return true;
    }

    @Override
    public List<Employee> getAll() {
        return employeeDB;
    }

}