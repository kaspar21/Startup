package fr.efrei.views;
import fr.efrei.factory.*;
import fr.efrei.domain.*;
import fr.efrei.repository.*;
import fr.efrei.util.Helper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();

        boolean choice=true;
        while (choice!=false){
            System.out.println("Enter a number to select a command :");
            System.out.println("0. Create an employee");
            System.out.println("1. Create and add an employee to the list");
            System.out.println("2. Modify an employee");
            System.out.println("3. Delete an employee");
            System.out.println("4. Look for an employee");
            System.out.println("5. Exit the program");
            Scanner in = new Scanner(System.in);
            int number=in.nextInt();
            switch(number) {
                case 0:
                    System.out.println("Enter your firstname : ");
                    String firstname = in.nextLine();
                    System.out.println("Enter your middle name :");
                    String middleName = in.nextLine();
                    System.out.println("Enter your surname : ");
                    String surname = in.nextLine();
                    System.out.println("Enter your gender description : ");
                    String genderDescription = in.nextLine();
                    System.out.println("Enter your race description:");
                    String raceDescription = in.nextLine();
                    System.out.println("Enter your phone number : ");
                    int cellPhoneNumber = in.nextInt();
                    System.out.println("Enter your email : ");
                    String email = in.nextLine();
                    System.out.println("Enter your home number:");
                    int homeNumber = in.nextInt();
                    System.out.println("Enter your street adress : ");
                    String streetAddress = in.nextLine();
                    System.out.println("Enter your postal adress : ");
                    String  postalAdress = in.nextLine();
                    System.out.println("Enter your city : ");
                    String city = in.nextLine();
                    System.out.println("Enter your country : ");
                    String country = in.nextLine();
                    System.out.println("Enter your street number : ");
                    int streetNumber = in.nextInt();
                    System.out.println("Enter your postal code : ");
                    double postalCode = Double.parseDouble(in.nextLine());
                    System.out.println("Enter your type of ID : ");
                    String typeID = in.nextLine();
                    System.out.println("Enter your ID number : ");
                    String valueID = in.nextLine();
                    System.out.println("Enter your position : ");




                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    choice=false;
                    break;
                default:
                    System.out.println("Enter a number between 0 and 5 !\n");
                    break;
            }


        }
    }

    //domain = put all the classes and entities
    //factory = objects that you create for your 'entities
    //repository = where you keep your data stored
    //util = helper classes as if an email @ is valid
}