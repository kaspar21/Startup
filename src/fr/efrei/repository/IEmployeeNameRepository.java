package fr.efrei.repository;
import fr.efrei.domain.EmployeeName;
import java.util.List;

public interface IEmployeeNameRepository extends IRepository <EmployeeName, String>{
    //create, read, update, delete: override these 4 methods
    public List<EmployeeName> getAll();
}
