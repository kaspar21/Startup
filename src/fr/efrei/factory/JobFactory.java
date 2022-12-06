package fr.efrei.factory;
import fr.efrei.domain.Job;
import fr.efrei.util.Helper;
//Done

public class JobFactory {
    public static Job createJob (int positionCode, String title){
        if (Helper.isNullOrEmpty(positionCode) || Helper.isNullOrEmpty(title)){
            return null;
        }
        Job job = new Job.Builder().setpositionCode(positionCode)
                .settitle(title)
                .build();
        return job;
    }
}
