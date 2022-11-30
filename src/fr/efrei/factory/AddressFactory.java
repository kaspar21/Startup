package fr.efrei.factory;

import fr.efrei.domain.Address;
import fr.efrei.util.Helper;

public class AddressFactory {
    public static Address createAddress(String city, String postalAddress, String streetAddress, String country, String streetNumber){
        

        if (Helper.isNullOrEmpty(country) || Helper.isNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetAddress)
                                          || Helper.isNullOrEmpty(postalAddress) || Helper.isNullOrEmpty(city)){
            return null;
        }

        Address address = new Address.Builder().setCity(city)
                        .setCountry(country)
                        .setPostalAddress(postalAddress)
                        .setStreetAddress(streetAddress)
                        .setStreetNumber(streetNumber)
                .build();

        return address;
    }
}