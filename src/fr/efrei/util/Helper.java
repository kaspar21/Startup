package fr.efrei.util;

import java.util.UUID;

public class Helper {

    public static boolean isNullOrEmpty(String s) {
        if ((s == null) || (s.isEmpty())){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isNullOrEmpty(int x) {
        if (x <= 0 || x > 0){return false;}
        else {return true;}
    }
    public static boolean isNullOrEmpty(double x) {
        if (x <= 0 || x > 0){return false;}
        else {return true;}
    }

    public static String generateId() {
        return UUID.randomUUID().toString();
    }

}
