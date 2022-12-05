package fr.efrei.factory;
import fr.efrei.domain.EmployeeName;
import fr.efrei.util.Helper;
//Done

public class EmployeeNameFactory {
    public static EmployeeName createEmployeeName (String firstname, String surname){
        if (Helper.isNullOrEmpty(firstname) || Helper.isNullOrEmpty(surname)){
            return null;
        }
        EmployeeName employeeName = new EmployeeName.Builder().setfirstname(firstname)
                .setsurname(surname)
                .build();
        return employeeName;
    }
}