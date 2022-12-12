package fr.efrei.views;
import fr.efrei.factory.*;
import fr.efrei.domain.*;
import fr.efrei.repository.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Employee> employeedb=new ArrayList<>();

    private static RaceRepository raceRepository = RaceRepository.getRepository();
    private static Race race1 = RaceFactory.createRace("Indian");
    private static Race race2 = RaceFactory.createRace("White");
    private static Race race3 = RaceFactory.createRace("Spaceman");


    public static void main(String[] args) {
        //Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();
        NameRepository myName = NameRepository.getRepository();
        RaceRepository myRace = RaceRepository.getRepository();
        GenderRepository myGender = GenderRepository.getRepository();
        AddressRepository myAddress = AddressRepository.getRepository();
        ContactRepository myContact = ContactRepository.getRepository();
        IDRepository myID = IDRepository.getRepository();


        boolean choices=true;
        while (choices!=false){
            System.out.println("Enter a number to select a command :");
            System.out.println("0. Create an employee");
            System.out.println("1. Show all employees");
            System.out.println("2. Modify an employee");
            System.out.println("3. Delete an employee");
            System.out.println("4. Look for an employee");
            System.out.println("5. Exit the program");
            Scanner in = new Scanner(System.in);

            String  choice, surname, firstname,
                    raceChoice, raceDescription,
                    email, postalAdress,
                    genderChoice, genderDescription, streetAddress, postalAddress,city,country,streetNumber;

            double postalCode;

            int homeNumber,employeeID,cellPhoneNumber;
            Name name;
            Gender gender;
            Race race;
            Contact contact;
            Address address;
            ID ident;


            int number=in.nextInt();
            switch(number) {
                case 0:
                    System.out.println("Enter your firstname : ");
                    firstname = in.next();
                    System.out.println("Enter your surname : ");
                    surname = in.next();

                    System.out.println("Choose Race 1-Indian 2-White 3-Spaceman");

                    raceChoice = in.next();
                    if (raceChoice.equals("1"))
                        raceDescription = "Indian";
                    else if (raceChoice.equals("2"))
                        raceDescription = "White";
                    else if (raceChoice.equals("3"))
                        raceDescription = "Spaceman";
                    else
                        raceDescription = "Invalid";
                    System.out.println("Choose Gender 1-Male 2-Female 3-Other");

                    genderChoice = in.next();
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
                    cellPhoneNumber = in.nextInt();

                    System.out.println("Enter your email : ");
                    email = in.next();
                    System.out.println("Enter your home number:");
                    homeNumber = in.nextInt();
                    System.out.println("Enter the adress informations: ");
                    System.out.println("Enter your street number : ");
                    streetNumber = in.next();


                    System.out.println("Enter your street address : ");
                    streetAddress = in.next();

                    System.out.println("Enter your postal adress : ");
                    postalAdress = in.next();
                    System.out.println("Enter your postal code : ");
                    postalCode = Double.parseDouble(in.next());
                    System.out.println("Enter your city : ");
                    city = in.next();
                    System.out.println("Enter your country : ");
                    country = in.next();


                    System.out.println("Enter the ID informations: ");
                    System.out.println("Enter your type of ID : ");
                    String typeID = in.next();
                    System.out.println("Enter your ID number : ");
                    String valueID = in.next();


                    name = NameFactory.createEmployeeName(surname,firstname);
                    race = RaceFactory.createRace(raceDescription);
                    gender = GenderFactory.createGender(genderDescription);
                    contact = ContactFactory.createContact(cellPhoneNumber, email, homeNumber);
                    address= AddressFactory.createAddress(streetAddress,postalAdress, city,country,streetNumber, postalCode);
                    ident= IDFactory.createID(typeID, valueID);

                    myName.create(name);
                    myRace.create(race);
                    myContact.create(contact);
                    myAddress.create(address);
                    myID.create(ident);
                    myGender.create(gender);

                    System.out.println(myName.getAll());
                    System.out.println(myAddress.getAll());
                    System.out.println(myContact.getAll());
                    System.out.println(myRace.getAll());
                    System.out.println(myID.getAll());
                    System.out.println(myGender.getAll());

                    Employee employee= EmployeeFactory.createEmployee(ident,gender,race,address,contact,name);
                    System.out.println(employee);
                    Main.employeedb.add(employee);

                    break;

                case 1:
                    for (Employee e:Main.employeedb) {
                        System.out.println(e);
                    }
                    break;

                case 2:



                    System.out.println("Which information to update :");
                    System.out.println("1-Name 2-Race 3-Gender 4-Contact details 5-Address details");
                    choice = in.next();
                    if (choice.equals("1")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("First name: ");
                        firstname = in.next();
                        System.out.println("Last name");
                        surname = in.next();
                        Name newName = NameFactory.createEmployeeName(firstname, surname);
                        myName.update(newName);
                        System.out.println(myName.getAll());

                    } else if (choice.equals("2")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("Race: ");
                        raceDescription = in.next();
                        Race newRace= RaceFactory.createRace(raceDescription);
                        myRace.update(newRace);
                        System.out.println(myID.getAll());
                    }
                    else if (choice.equals("3")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("Gender: ");
                        genderDescription = in.next();
                        Gender newGender = GenderFactory.createGender( genderDescription);
                        myGender.update(newGender);
                        System.out.println(myGender.getAll());
                    }

                    else if (choice.equals("4")){
                        System.out.println("Give me your contact informations: ");
                        System.out.println("phone number : ");
                        cellPhoneNumber = in.nextInt();

                        System.out.println("email : ");
                        email = in.next();
                        System.out.println("Enter your home number:");
                        homeNumber = in.nextInt();

                        Contact newContact =  ContactFactory.createContact(cellPhoneNumber, email,homeNumber );
                        myContact.update(newContact);
                        System.out.println(myContact.getAll());
                    }


                    else if (choice.equals("5")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("Email: ");
                        streetAddress = in.next();
                        System.out.println("Postal Address: ");
                        postalAddress = in.next();
                        System.out.println("Home number");
                        homeNumber = in.nextInt();
                        System.out.println("City");
                        city = in.next();
                        System.out.println("Country");
                        country = in.next();
                        System.out.println("Street Number");
                        streetNumber = in.next();
                        System.out.println("Postal Code");
                        postalCode = Double.parseDouble(in.next());
                        Address newAddress = AddressFactory.createAddress(streetAddress, postalAddress, city,country,streetNumber,postalCode);
                        myAddress.update(newAddress);
                        System.out.println(myAddress.getAll());
                    }

                    break;
                case 3:
                    System.out.println("Which information to delete :");
                    System.out.println("1-Name 2-Race 3-Gender 4-Contact details 5-Address details");
                    choice = in.next();
                    if (choice.equals("1")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("First name: ");
                        firstname = in.next();
                        System.out.println("Last name");
                        surname = in.next();
                        Name newName = NameFactory.createEmployeeName(firstname, surname);
                    } else if (choice.equals("2")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("Race: ");
                        raceDescription = in.next();
                        Race newRace= RaceFactory.createRace( raceDescription);

                    }
                    else if (choice.equals("3")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("Gender: ");
                        genderDescription = in.next();
                        Gender newGender = GenderFactory.createGender( genderDescription);
                    }
                    else if (choice.equals("5")) {
                        System.out.println("Give me your: ");
                        System.out.println("ID: ");
                        employeeID = in.nextInt();
                        System.out.println("Email: ");
                        streetAddress = in.next();
                        System.out.println("Postal Address: ");
                        postalAddress = in.next();
                        System.out.println("Home number");
                        homeNumber = in.nextInt();
                        System.out.println("City");
                        city = in.next();
                        System.out.println("Country");
                        country = in.next();
                        System.out.println("Street Number");
                        streetNumber = in.next();
                        System.out.println("Postal Code");
                        postalCode = Double.parseDouble(in.next());
                        Address newAddress = AddressFactory.createAddress(streetAddress, postalAddress, city,country,streetNumber,postalCode);

                    }



                    break;
                case 4:
                    System.out.println("ID of employee :");
                    employeeID = in.nextInt();



                    break;
                case 5:
                    System.out.println("Goodbye !");
                    choices= false;
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