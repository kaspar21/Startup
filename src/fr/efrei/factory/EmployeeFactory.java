package fr.efrei.factory;
import fr.efrei.domain.*;
import fr.efrei.util.Helper;

public class EmployeeFactory {
    //Tous les attributs
    public static Employee createEmployee(int employeeID, Gender employeeGender, Race employeeRace, double salary, Address employeeAdress, Contact employeeContact){
        if (Helper.isNullOrEmpty(employeeID) || employeeGender == null  || employeeRace == null || Helper.isNullOrEmpty(salary) || employeeAdress == null || employeeContact == null ){
            return null;
        }
        Employee employee = new Employee.Builder().setEmployeeID(employeeID)
                .setEmployeeGender(employeeGender)
                .setEmployeeRace(employeeRace)
                .setSalary(salary)
                .setEmployeeAdress(employeeAdress)
                .setEmployeeContact(employeeContact)
                .build();
        return employee;
    }
    //Que gender et race
    public static Employee createEmployee(Gender employeeGender, Race employeeRace){
        String employeeID = Helper.generateId();
        if (employeeGender == null  || employeeRace == null){
            return null;
        }
        Employee employee = new Employee.Builder().setEmployeeID(Integer.valueOf(employeeID))
                .setEmployeeGender(employeeGender)
                .setEmployeeRace(employeeRace)
                .build();
        return employee;
    }

    public static Employee createEmployee(Race employeeRace){
        if (employeeRace == null){
            return null;
        }
        Employee employee = new Employee.Builder().setEmployeeRace(employeeRace)
                .build();
        return employee;
    }
}
