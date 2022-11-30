package fr.efrei.domain;

public class Contact {
    private int cellPhoneNumber;
    private String email;
    private int homeNumber;

    //default constructor
    private Contact() {}

    //add another constructor later
    private Contact(Builder builder){
        this.cellPhoneNumber = builder.cellPhoneNumber;
        this.email = builder.email;
        this.homeNumber = builder.homeNumber;
    }

    //getters but no setters, to have protected classes
    public int getcellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getemail() {
        return email;
    }

    public int gethomeNumber() {
        return homeNumber;
    }

    @Override
    public String toString() {
        return "Race{" +
                "cellPhoneNumber='" + cellPhoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", homeNumber='" + homeNumber + '\'' +
                '}';
    }

    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {

        private int cellPhoneNumber;
        private String email;
        private int homeNumber;

        //setters, not getters
        public Builder setcellPhoneNumber(int cellPhoneNumber) {
            this.cellPhoneNumber = cellPhoneNumber;
            return this; //return the Builder object
        }

        public Builder setemail(String email) {
            this.email = email;
            return this; //return the Builder object
        }

        public Builder sethomeNumber(int homeNumber) {
            this.homeNumber = homeNumber;
            return this; //return the Builder object
        }

        public Builder copy(Contact cont){
            this.cellPhoneNumber = cont.cellPhoneNumber;
            this.email = cont.email;
            this.homeNumber = cont.homeNumber;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public Contact build() {
            return new Contact(this);
        }
    }

}
