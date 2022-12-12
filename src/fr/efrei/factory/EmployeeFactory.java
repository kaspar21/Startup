package fr.efrei.factory;
import fr.efrei.domain.*;
import fr.efrei.util.Helper;

public class EmployeeFactory {
    //Tous les attributs
    public static Employee createEmployee( ID employeeIdent, Gender employeeGender, Race employeeRace, Address employeeAdress, Contact employeeContact, Name employeeName){
        String employeeID = Helper.generateId();

        if (Helper.isNullOrEmpty(employeeID) || employeeIdent == null || employeeGender == null  || employeeRace == null || employeeAdress == null || employeeContact == null ){
            return null;
        }
        Employee employee = new Employee.Builder().setEmployeeID(employeeID)

                .setEmployeeGender(employeeGender)
                .setEmployeeRace(employeeRace)
                .setEmployeeAdress(employeeAdress)
                .setEmployeeContact(employeeContact).setEmployeeName(employeeName)
                .build();
        return employee;
    }
    //Que gender et race
    public static Employee createEmployee(Gender employeeGender, Race employeeRace){
        String employeeID = Helper.generateId();
        if (employeeGender == null  || employeeRace == null){
            return null;
        }
        Employee employee = new Employee.Builder().setEmployeeID(employeeID)
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
