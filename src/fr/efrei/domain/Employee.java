package fr.efrei.domain;
//Done

public class Employee {
    private int employeeID;
    private Gender employeeGender;
    private Race employeeRace;
    private double salary;
    private Address employeeAdress;
    private Contact employeeContact;

    public Employee(Builder builder) {}

    public Employee(int employeeID, Gender employeeGender, Race employeeRace, double salary, Address employeeAdress, Contact employeeContact) {
        this.employeeID = employeeID;
        this.employeeGender = employeeGender;
        this.employeeRace = employeeRace;
        this.salary = salary;
        this.employeeAdress = employeeAdress;
        this.employeeContact = employeeContact;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public Gender getEmployeeGender() {
        return employeeGender;
    }

    public Race getEmployeeRace() {
        return employeeRace;
    }

    public double getSalary() {
        return salary;
    }

    public Address getEmployeeAdress() {
        return employeeAdress;
    }

    public Contact getEmployeeContact() {
        return employeeContact;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeGender=" + employeeGender +
                ", employeeRace=" + employeeRace +
                ", salary=" + salary +
                ", employeeAdress=" + employeeAdress +
                ", employeeContact=" + employeeContact +
                '}';
    }


    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        public int employeeID;
        public Gender employeeGender;
        public Race employeeRace;
        public double salary;
        public Address employeeAdress;
        public Contact employeeContact;

        public Builder setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
            return this; //return the Builder object
        }

        public Builder setEmployeeGender(Gender employeeGender) {
            this.employeeGender = employeeGender;
            return this; //return the Builder object
        }

        public Builder setEmployeeRace(Race employeeRace) {
            this.employeeRace = employeeRace;
            return this; //return the Builder object
        }

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this; //return the Builder object
        }

        public Builder setEmployeeAdress(Address employeeAdress) {
            this.employeeAdress = employeeAdress;
            return this; //return the Builder object
        }

        public Builder setEmployeeContact(Contact employeeContact) {
            this.employeeContact = employeeContact;
            return this; //return the Builder object
        }

        public Builder copy(Employee employee){
            this.employeeID = employee.employeeID;
            this.employeeGender = employee.employeeGender;
            this.employeeRace = employee.employeeRace;
            this.salary = employee.salary;
            this.employeeAdress = employee.employeeAdress;
            this.employeeContact = employee.employeeContact;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public Employee build() {
            return new Employee(this);
        }
    }
}