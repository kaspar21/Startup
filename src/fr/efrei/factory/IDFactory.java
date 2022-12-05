package fr.efrei.factory;
import fr.efrei.domain.ID;
import fr.efrei.util.Helper;
//Done

public class IDFactory {
    public static ID createID (String typeID, String valueID){
        if (Helper.isNullOrEmpty(typeID) || Helper.isNullOrEmpty(valueID)){
            return null;
        }
        ID id = new ID.Builder().setTypeID(typeID)
                .setValueID(valueID)
                .build();
        return id;
    }
}