package fr.efrei.factory;
import fr.efrei.domain.Employee;
import fr.efrei.domain.Gender;
import fr.efrei.domain.Race;
import fr.efrei.util.Helper;

public class EmployeeFactory {
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
