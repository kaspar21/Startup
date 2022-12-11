package fr.efrei.factory;
import fr.efrei.domain.Race;
import fr.efrei.util.Helper;

public class RaceFactory {
    public static Race createRace(String description){
        if (Helper.isNullOrEmpty(description)){
            return null;
        }
        Race race = new Race.Builder().setDescription(description)
                .build();
        return race;
    }
}
