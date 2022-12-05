package fr.efrei.repository;
import fr.efrei.domain.ID;
import java.util.List;

public interface IIDRepository extends IRepository <ID, String>{
    //create, read, update, delete: override these 4 methods
    public List<ID> getAll();
}
