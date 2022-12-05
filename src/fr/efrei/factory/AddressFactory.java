package fr.efrei.factory;
//Done

import fr.efrei.domain.Address;
import fr.efrei.util.Helper;

public class AddressFactory {
    public static Address createAddress(String city, String postalAddress, String streetAddress, String country, String streetNumber, Double postalCode){
        if (Helper.isNullOrEmpty(country) || Helper.isNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetAddress)
                                          || Helper.isNullOrEmpty(postalAddress) || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(String.valueOf((postalCode)))){
            return null;
        }
        Address address = new Address.Builder().setCity(city)
                        .setCountry(country)
                        .setPostalAddress(postalAddress)
                        .setStreetAddress(streetAddress)
                        .setStreetNumber(streetNumber)
                        .setPostalCode(postalCode)
                        .build();
        return address;
    }
    
     public static Address createAddress(String city, String country, Double postalCode){
        if (Helper.isNullOrEmpty(country) || Helper.isNullOrEmpty(String.valueOf((postalCode))) || Helper.isNullOrEmpty(city)){
            return null;
        }
        Address address = new Address.Builder().setCity(city)
                        .setCountry(country)
                        .setPostalCode(postalCode)
                        .build();
        return address;
    }
    
    public static Address createAddress(String streetAddress, String streetNumber){
        if  (Helper.isNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetAddress)){
            return null;
        }
        Address address = new Address.Builder().setStreetNumber(streetNumber)
                        .setStreetAddress(streetAddress)
                        .build();
        return address;
    }
    
    
     public static Address createAddress(String city, String streetAddress, String country, String streetNumber, Double postalCode){
        if (Helper.isNullOrEmpty(country) || Helper.isNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetAddress)
                                          || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(String.valueOf((postalCode)))){
            return null;
        }
        Address address = new Address.Builder().setCity(city)
                        .setCountry(country)
                        .setStreetAddress(streetAddress)
                        .setStreetNumber(streetNumber)
                        .setPostalCode(postalCode)
                        .build();
        return address;
    }
    
}