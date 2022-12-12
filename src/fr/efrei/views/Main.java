package fr.efrei.views;
import fr.efrei.factory.*;
import fr.efrei.domain.*;
import fr.efrei.repository.*;

import java.util.Scanner;

public class Main {

    private static RaceRepository raceRepository = RaceRepository.getRepository();
    private static Race race1 = RaceFactory.createRace("Indian");
    private static Race race2 = RaceFactory.createRace("White");
    private static Race race3 = RaceFactory.createRace("Spaceman");


    public static void main(String[] args) {
        //Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();

        boolean choices=true;
        while (choices!=false){
            System.out.println("Enter a number to select a command :");
            System.out.println("1. Create an employee");
            System.out.println("2. Modify an employee");
            System.out.println("3. Delete an employee");
            System.out.println("4. Look for an employee");
            System.out.println("5. Exit the program");
            Scanner in = new Scanner(System.in);

            String id, choice, choice2, choice3, surname, firstname,
                    raceChoice, raceDescription,
                    email, cellNumber,postalAdress,
                    genderChoice, genderDescription, streetAddress, postalAddress,city,country,streetNumber;

            double postalCode;

            int homeNumber,employeeID;
            Name name;
            Gender gender;
            Race race;
            Contact contact;
            Address address;
            ID ident;


            int number=in.nextInt();
            switch(number) {
                case 1:
                    System.out.println("Enter your firstname : ");
                    firstname = in.nextLine();
                    System.out.println("Enter your surname : ");
                    surname = in.nextLine();

                    System.out.println("Choose Race 1-Indian 2-White 3-Spaceman");

                    raceChoice = in.nextLine();
                    if (raceChoice.equals("1"))
                        raceDescription = "Indian";
                    else if (raceChoice.equals("2"))
                        raceDescription = "White";
                    else if (raceChoice.equals("3"))
                        raceDescription = "Spaceman";
                    else
                        raceDescription = "Invalid";
                    System.out.println("Choose Gender 1-Male 2-Female 3-Other");

                    genderChoice = in.nextLine();
                    if (genderChoice.equals("1"))
                        genderDescription = "Male";
                    else if (genderChoice.equals("2"))
                        genderDescription = "Female";
                    else if (genderChoice.equals("3"))
                        genderDescription = "Other";
                    else
                        genderDescription = "Invalid";

                    System.out.println("Enter the contact informations: ");
                    System.out.println("Enter your phone number : ");
                    int cellPhoneNumber = in.nextInt();
                    in.nextLine();
                    System.out.println("Enter your email : ");
                    email = in.nextLine();
                    System.out.println("Enter your home number:");
                    homeNumber = in.nextInt();
                    System.out.println("Enter the adress informations: ");
                    System.out.println("Enter your street number : ");
                    streetNumber = in.nextLine();

                    in.nextInt();
                    System.out.println("Enter your street adress : ");
                    streetAddress = in.nextLine();

                    System.out.println("Enter your postal adress : ");
                    postalAdress = in.nextLine();
                    System.out.println("Enter your postal code : ");
                    postalCode = Double.parseDouble(in.nextLine());
                    System.out.println("Enter your city : ");
                    city = in.nextLine();
                    System.out.println("Enter your country : ");
                    country = in.nextLine();


                    System.out.println("Enter the ID informations: ");
                    System.out.println("Enter your type of ID : ");
                    String typeID = in.nextLine();
                    System.out.println("Enter your ID number : ");
                    String valueID = in.nextLine();


                    name = NameFactory.createEmployeeName(surname,firstname);
                    race = RaceFactory.createRace(raceDescription);
                    gender = GenderFactory.createGender(genderDescription);
                    contact = ContactFactory.createContact(cellPhoneNumber, email, homeNumber);
                    address= AddressFactory.createAddress(streetAddress,postalAdress, city,country,streetNumber, postalCode);
                    ident= IDFactory.createID(typeID, valueID);


                    System.out.println(gender);

                    System.out.println(race);
                    System.out.println(contact);
                    System.out.println(address);
                    System.out.println(ident);
                    System.out.println(name);





                    break;
                case 2:



                    System.out.println("Which information to update :");
                    System.out.println("1-Name 2-Race 3-Gender 4-Contact details 5-Address details");
                    choice = in.nextLine();
                    if (choice.equals("1")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("First name: ");
                        firstname = in.nextLine();
                        System.out.println("Last name");
                        surname = in.nextLine();
                        Name newName = new Name(firstname, surname);
                        NameRepository.getRepository().update(newName);
                    } else if (choice.equals("2")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("Race: ");
                        raceDescription = in.nextLine();
                        Race newRace= new Race(employeeID, raceDescription);
                        RaceRepository.getRepository().update(newRace);
                    }
                    else if (choice.equals("3")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("Gender: ");
                        genderDescription = in.nextLine();
                        Gender newGender = new Gender(employeeID, genderDescription);
                        GenderRepository.getRepository().update(newGender);
                    }
                    else if (choice.equals("5")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("Email: ");
                        streetAddress = in.nextLine();
                        System.out.println("Postal Address: ");
                        postalAddress = in.nextLine();
                        System.out.println("Home number");
                        homeNumber = in.nextInt();
                        System.out.println("City");
                        city = in.nextLine();
                        System.out.println("Country");
                        country = in.nextLine();
                        System.out.println("Street Number");
                        streetNumber = in.nextLine();
                        System.out.println("Postal Code");
                        postalCode = Double.parseDouble(in.nextLine());
                        Address newAddress = new Address(employeeID,streetAddress, postalAddress, city,country,streetNumber,postalCode);
                        AddressRepository.getRepository().update(newAddress);
                    }

                    break;
                case 3:



                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Enter a number between 0 and 5 !\n");
                    break;
                     }
        }

        //domain = put all the classes and entities
        //factory = objects that you create for your 'entities
        //repository = where you keep your data stored
        //util = helper classes as if an email @ is valid
    }}