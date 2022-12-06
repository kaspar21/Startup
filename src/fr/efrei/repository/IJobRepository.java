package fr.efrei.repository;
import fr.efrei.domain.Job;
import java.util.List;

public interface IJobRepository extends IRepository <Job, String> {
    //create, read, update, delete: override these 4 methods
    public List<Job> getAll();
}
