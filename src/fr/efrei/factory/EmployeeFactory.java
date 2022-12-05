package fr.efrei.factory;
import fr.efrei.domain.Employee;
import fr.efrei.util.Helper;
//Done

public class EmployeeFactory {
    public static Employee createEmployee(int employeeID, String employeeGender, String employeeRace){
        if (Helper.isNullOrEmpty(employeeID) || Helper.isNullOrEmpty(employeeGender) ||Helper.isNullOrEmpty(employeeRace)){
            return null;
        }
        Employee employee = new Employee.Builder().setEmployeeID(employeeID)
                .setEmployeeGender(employeeGender)
                .setEmployeeRace(employeeRace)
                .build();
        return employee;
    }
}