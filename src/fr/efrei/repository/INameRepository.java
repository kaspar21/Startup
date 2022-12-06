package fr.efrei.repository;
import fr.efrei.domain.Name;
import java.util.List;

public interface INameRepository extends IRepository <Name, String>{
    //create, read, update, delete: override these 4 methods
    public List<Name> getAll();
}
