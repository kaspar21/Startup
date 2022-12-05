package fr.efrei.repository;
import fr.efrei.domain.Address;
import java.util.ArrayList;
import java.util.List;

public class AddressRepository implements IAddressRepository {
    private static AddressRepository repository = null;
    private List<Address> addressDB = null;

    private AddressRepository() {
        addressDB = new ArrayList<Address>();
    }

    public static AddressRepository getRepository() {
        if (repository == null){
            return new AddressRepository();
        }
        return repository;
    }


    @Override
    public Address create(Address address) {
        boolean success = addressDB.add(address); //indeed, add method returns a boolean
        if (success){
            return address;
        }
        else {
            return null;
        }
    }


    @Override
    public Address read(String s) {
        for (Address a : addressDB){
            if (a.getPostalAddress().equals(s)){
                return a;
            }

        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public Address update(Address address) {
        Address oldAddress = read(address.getPostalAddress());
        if (address != null){
            addressDB.remove(oldAddress); //take the object away from the data structure
            addressDB.add(address);
            return address;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Address addressToDelete = read(s);
        if (addressToDelete == null) {
            return false;
        }
        addressDB.remove(addressToDelete);
        return true;
    }

    @Override
    public List<Address> getAll() {
        return addressDB;
    }

}