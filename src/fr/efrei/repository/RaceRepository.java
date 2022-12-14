package fr.efrei.repository;
import fr.efrei.domain.Race;
import java.util.ArrayList;
import java.util.List;

public class RaceRepository implements IRaceRepository {
    public static RaceRepository repository = null;
    public List<Race> raceDB = null;

    public RaceRepository() {
        raceDB = new ArrayList<Race>();
    }

    public static RaceRepository getRepository() {
        if (repository == null){
            return new RaceRepository();
        }
        return repository;
    }


    @Override
    public Race create(Race race) {
        boolean success = raceDB.add(race); //indeed, add method returns a boolean
        if (success){
            return race;
        }
        else {
            return null;
        }
    }


    @Override
    public Race read(String s) {
        for (Race r : raceDB){
            if (r.getDescription().equals(s)){
                return r;
            }

        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public Race update(Race race) {
        Race oldRace = read(race.getDescription());
        if (race != null){
            raceDB.remove(oldRace); //take the object away from the data structure
            raceDB.add(race);
            return race;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Race raceToDelete = read(s);
        if (raceToDelete == null) {
            return false;
        }
        raceDB.remove(raceToDelete);
        return true;
    }

    @Override
    public List<Race> getAll() {
        return raceDB;
    }

}