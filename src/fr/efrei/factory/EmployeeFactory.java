package fr.efrei.factory;
import fr.efrei.domain.Employee;
import fr.efrei.util.Helper;
//Done

public class EmployeeFactory {
    public static Employee createEmployee(String employeeGender, String employeeRace){
        String employeeID = Helper.generateId();
        if (Helper.isNullOrEmpty(employeeGender) ||Helper.isNullOrEmpty(employeeRace)){
            return null;
        }
        Employee employee = new Employee.Builder().setEmployeeID(Integer.valueOf(employeeID))
                .setEmployeeGender(employeeGender)
                .setEmployeeRace(employeeRace)
                .build();
        return employee;
    }
    
    public static Employee createEmployee(String employeeRace){
        if (Helper.isNullOrEmpty(employeeRace)){
            return null;
        }
        Employee employee = new Employee.Builder().setEmployeeRace(employeeRace)
                .build();
        return employee;
    }
}
