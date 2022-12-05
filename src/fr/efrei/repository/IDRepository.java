package fr.efrei.repository;

import fr.efrei.domain.ID;

import java.util.ArrayList;
import java.util.List;

public class IDRepository implements IIDRepository {
    private static IDRepository repository = null;
    private List<ID> idDB = null;

    private IDRepository() {
        idDB = new ArrayList<ID>();
    }

    public static IDRepository getRepository() {
        if (repository == null){
            return new IDRepository();
        }
        return repository;
    }


    @Override
    public ID create(ID id) {
        boolean success = idDB.add(id); //indeed, add method returns a boolean
        if (success){
            return id;
        }
        else {
            return null;
        }
    }


    @Override
    public ID read(String s) {
        for (ID i : idDB){
            if (i.getValueID().equals(s)){
                return i;
            }

        }
        return null; //return null if we don't find the object in the list
    }

    @Override
    public ID update(ID id) {
        ID oldID = read(id.getValueID());
        if (id != null){
            idDB.remove(oldID); //take the object away from the data structure
            idDB.add(id);
            return id;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        ID idToDelete = read(s);
        if (idToDelete == null) {
            return false;
        }
        idDB.remove(idToDelete);
        return true;
    }

    @Override
    public List<ID> getAll() {
        return idDB;
    }

}