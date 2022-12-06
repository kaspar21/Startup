package fr.efrei.views;
import fr.efrei.factory.RaceFactory;
import fr.efrei.domain.*;
import fr.efrei.repository.*;
import fr.efrei.util.Helper;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Employee employee = new Employee.EmployeeBuilder("Vikram", "ABC").setHasBike(false).setHasBike(true).build();
        System.out.println("Enter a number to select a command : /n");
        System.out.println("0. Create an employee /n");
        System.out.println("1. Create and add an employee to the list /n");
        System.out.println("2. Modify an employee /n");
        System.out.println("3. Delete an employee /n");
        System.out.println("4. Look for an employee /n");
        System.out.println("5. Exit the program /n");
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        while (number!=5){
            switch(number) {
                case 0:
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
                    break;
                default:
                    System.out.println("Enter a number to select a command : /n");
                    System.out.println("0. Create an employee /n");
                    System.out.println("1. Create and add an employee to the list /n");
                    System.out.println("2. Modify an employee /n");
                    System.out.println("3. Delete an employee /n");
                    System.out.println("4. Look for an employee /n");
                    System.out.println("5. Exit the program /n");
            }

            //System.out.println("Enter your firstname :  /n");
            //String firstname = in.nextLine();
            //System.out.println("Enter your middle name : /n");
            //String middleName = in.nextLine();
            //System.out.println("Enter your surname :  /n");
            //String surname = in.nextLine();
            //System.out.println("Name is: " + name);
        }
    }

    //domain = put all the classes and entities
    //factory = objects that you create for your 'entities
    //repository = where you keep your data stored
    //util = helper classes as if an email @ is valid
}