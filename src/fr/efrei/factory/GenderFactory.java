package fr.efrei.factory;
import fr.efrei.domain.Gender;
import fr.efrei.util.Helper;
//Done

public class GenderFactory {
    public static Gender createGender (String genderDescription){
        if (Helper.isNullOrEmpty(genderDescription)){
            return null;
        }
        Gender gender = new Gender.Builder().setgenderDescription(genderDescription)
                .build();
        return gender;
    }
}
