package fr.efrei.factory;
import fr.efrei.domain.Position;
import fr.efrei.util.Helper;
//Done

public class PositionFactory {
    public static Position createPosition (String positionCode){
        if ( Helper.isNullOrEmpty(positionCode)){
            return null;
        }
        Position position = new Position.Builder().setPositionCode(positionCode)
                .build();
        return position;
    }
}
