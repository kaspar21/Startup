package fr.efrei.domain;


//Done

public class Employee {
    private int employeeID;
    private String employeeGender;
    private String employeeRace;

    public Employee(Builder builder) {}

    public Employee(int employeeID, String employeeGender, String employeeRace) {
        this.employeeID = employeeID;
        this.employeeGender = employeeGender;
        this.employeeRace = employeeRace;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public String getEmployeeRace() {
        return employeeRace;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", employeeGender='" + employeeGender + '\'' +
                ", employeeRace='" + employeeRace + '\'' +
                '}';
    }



    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        private int employeeID;
        private String employeeGender;
        private String employeeRace;

        public Builder setEmployeeID(int employeeID) {
            this.employeeID = employeeID;
            return this; //return the Builder object
        }

        public Builder setEmployeeGender(String employeeGender) {
            this.employeeGender = employeeGender;
            return this; //return the Builder object
        }

        public Builder setEmployeeRace(String employeeRace) {
            this.employeeRace = employeeRace;
            return this; //return the Builder object
        }

        public Builder copy(Employee employee){
            this.employeeID = employee.employeeID;
            this.employeeGender = employee.employeeGender;
            this.employeeRace = employee.employeeRace;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public Employee build() {
            return new Employee(this);
        }
    }
}