package fr.efrei.factory;
import fr.efrei.domain.Name;
import fr.efrei.util.Helper;
//Done

public class NameFactory {
    public static Name createEmployeeName (String firstname, String surname){
        if (Helper.isNullOrEmpty(firstname) || Helper.isNullOrEmpty(surname)){
            return null;
        }
        Name employeeName = new Name.Builder().setfirstname(firstname)
                .setsurname(surname)
                .build();
        return employeeName;
    }
}