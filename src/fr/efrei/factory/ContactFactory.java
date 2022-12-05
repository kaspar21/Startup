package fr.efrei.factory;
import fr.efrei.domain.Contact;
import fr.efrei.util.Helper;

//Done


public class ContactFactory {
    public static Contact createContact (int cellPhoneNumber, String email, int homeNumber){
        if (Helper.isNullOrEmpty(cellPhoneNumber) || Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(homeNumber)){
            return null;
        }
        Contact contact = new Contact.Builder().setcellPhoneNumber(cellPhoneNumber)
                .setemail(email)
                .sethomeNumber(homeNumber)
                .build();
        return contact;
    }
}