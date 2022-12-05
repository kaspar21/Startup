package fr.efrei.repository;
import fr.efrei.domain.Employee;
import java.util.List;

public interface IEmployeeRepository extends IRepository <Employee, String>{
    //create, read, update, delete: override these 4 methods
    public List<Employee> getAll();
}
