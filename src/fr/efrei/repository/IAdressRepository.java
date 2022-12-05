package fr.efrei.repository;
import fr.efrei.domain.Address;
import java.util.List;


public interface IAdressRepository extends IRepository<Adress, String>{
    //create, read, update, delete: override these 4 methods
    public List<Address> getAll();
}
