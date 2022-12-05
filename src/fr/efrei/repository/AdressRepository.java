package fr.efrei.repository;
import fr.efrei.domain.Address;
import java.util.ArrayList;
import java.util.List;

public class AdressRepository implements IAdressRepository{
    private static AdressRepository repository = null;
    private List<Adress> adressDB = null;

    private AdressRepository(){adressDB = new ArrayList<Adress>();}

    public static AdressRepository getRepository() {
        if (repository == null){
            return new AdressRepository();
        }
        return repository;
    }
    @Override
    public Adress create(Adress adress){
        boolean success = adressDB.add(adress);
        if (success){
            return adress;
    }
        else {
            return null;
        }
    }


}