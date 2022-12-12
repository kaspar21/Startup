package fr.efrei.domain;
//Done

public class Employee {
    public String employeeID;
    private Gender employeeGender;
    private Race employeeRace;
    private Address employeeAdress;
    private Contact employeeContact;
    private Name employeeName;

    private Employee(Builder builder) {}

    private Employee(String employeeID, Gender employeeGender, Race employeeRace, Address employeeAdress, Contact employeeContact,Name employeeName) {
        this.employeeID = employeeID;
        this.employeeGender = employeeGender;
        this.employeeRace = employeeRace;
        this.employeeAdress = employeeAdress;
        this.employeeContact = employeeContact;
        this.employeeName=employeeName;
    }

    private Employee() {}

    public String getEmployeeID() {
        return employeeID;
    }

    public Gender getEmployeeGender() {
        return employeeGender;
    }

    public Race getEmployeeRace() {
        return employeeRace;
    }

    public Name getEmployeeName() {        return employeeName;    }

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
                ", employeeAdress=" + employeeAdress +
                ", employeeContact=" + employeeContact +
                ", employeeName="+employeeName+
                '}';
    }


    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        public String employeeID;
        public Gender employeeGender;
        public Race employeeRace;
        public Address employeeAdress;
        public Contact employeeContact;
        public Name employeeName;

        public Builder setEmployeeID(String employeeID) {
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

        public Builder setEmployeeName(Name employeeName) {
            this.employeeName=employeeName;
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
            this.employeeAdress = employee.employeeAdress;
            this.employeeContact = employee.employeeContact;
            this.employeeName=employee.employeeName;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public Employee build() {
            return new Employee(this);
        }
    }
}