package fr.efrei.repository;

import fr.efrei.domain.EmployeeName;

import java.util.ArrayList;
import java.util.List;

public class EmployeeNameRepository implements IEmployeeNameRepository {
    private static EmployeeNameRepository repository = null;
    private List<EmployeeName> employeeNameDB = null;

    private EmployeeNameRepository() {
        employeeNameDB = new ArrayList<EmployeeName>();
    }

    public static EmployeeNameRepository getRepository() {
        if (repository == null){
            return new EmployeeNameRepository();
        }
        return repository;
    }


    @Override
    public EmployeeName create(EmployeeName employeeName) {
        boolean success = employeeNameDB.add(employeeName); //indeed, add method returns a boolean
        if (success){
            return employeeName;
        }
        else {
            return null;
        }
    }


    @Override
    public EmployeeName read(String s) {
        for (EmployeeName e : employeeNameDB){
            if (e.getSurname().equals(s)){
                return e;
            }

        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public EmployeeName update(EmployeeName employeeName) {
        EmployeeName oldEmployeeName = read(employeeName.getSurname());
        if (employeeName != null){
            employeeNameDB.remove(oldEmployeeName); //take the object away from the data structure
            employeeNameDB.add(employeeName);
            return employeeName;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        EmployeeName employeeNameToDelete = read(s);
        if (employeeNameToDelete == null) {
            return false;
        }
        employeeNameDB.remove(employeeNameToDelete);
        return true;
    }

    @Override
    public List<EmployeeName> getAll() {
        return employeeNameDB;
    }

}