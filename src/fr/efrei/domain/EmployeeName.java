package fr.efrei.util;

import fr.efrei.domain.Contact;

public class EmployeeName {
    private String firstname;
    private String surname;

    private EmployeeName() {}

    //add another constructor later
    private EmployeeName(EmployeeName.Builder builder){
        this.firstname = builder.firstname;
        this.surname = builder.surname;
    }
    public  String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Race{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static class Builder{
        private String firstname;
        private String surname;

        public Builder setfirstname(String firstname){
            this.firstname = firstname;
            return this;
        }
        public Builder setsurname(String surname){
            this.surname = surname;
            return this;
        }
        public Builder copy(EmployeeName empy){
            this.firstname = empy.firstname;
            this.surname = empy.surname;
            return this;
        }
        public EmployeeName build() {
            return new EmployeeName(this);
        }
    }
}
