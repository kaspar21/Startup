package fr.efrei.repository;

import fr.efrei.domain.Name;

import java.util.ArrayList;
import java.util.List;

public class NameRepository implements INameRepository {
    private static NameRepository repository = null;
    private List<Name> employeeNameDB = null;

    private NameRepository() {
        employeeNameDB = new ArrayList<Name>();
    }

    public static NameRepository getRepository() {
        if (repository == null){
            return new NameRepository();
        }
        return repository;
    }


    @Override
    public Name create(Name employeeName) {
        boolean success = employeeNameDB.add(employeeName); //indeed, add method returns a boolean
        if (success){
            return employeeName;
        }
        else {
            return null;
        }
    }


    @Override
    public Name read(String s) {
        for (Name e : employeeNameDB){
            if (e.getSurname().equals(s)){
                return e;
            }

        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public Name update(Name employeeName) {
        Name oldEmployeeName = read(employeeName.getSurname());
        if (employeeName != null){
            employeeNameDB.remove(oldEmployeeName); //take the object away from the data structure
            employeeNameDB.add(employeeName);
            return employeeName;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Name employeeNameToDelete = read(s);
        if (employeeNameToDelete == null) {
            return false;
        }
        employeeNameDB.remove(employeeNameToDelete);
        return true;
    }

    @Override
    public List<Name> getAll() {
        return employeeNameDB;
    }

}