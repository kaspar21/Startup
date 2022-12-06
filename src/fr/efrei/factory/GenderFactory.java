package fr.efrei.factory;
import fr.efrei.domain.Gender;
import fr.efrei.util.Helper;
//Done

public class GenderFactory {
    public static Gender createGender (String genderID, String genderDescription){
        if (Helper.isNullOrEmpty(genderID) || Helper.isNullOrEmpty(genderDescription)){
            return null;
        }
        Gender gender = new Gender.Builder().setGenderID(genderID)
                .setgenderDescription(genderDescription)
                .build();
        return gender;
    }
}
