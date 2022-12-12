package fr.efrei.domain;
//Done

public class Gender extends Employee{
    private String genderDescription;

    //default constructor
    public Gender(int employeeID, String genderDescription) {}

    //add another constructor later
    private Gender(Builder builder){
        this.genderDescription = builder.genderDescription;
    }

    //getters but no setters, to have protected classes


    public String getgenderDescription() {
        return genderDescription;
    }

    @Override
    public String toString() {
        return "Gender{" +
                ", genderDescription='" + genderDescription + '\'' +
                '}';
    }

    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {

        private String genderDescription;

        //setters, not getters


        public Builder setgenderDescription(String genderDescription) {
            this.genderDescription = genderDescription;
            return this; //return the Builder object
        }

        public Builder copy(Gender gender){
            this.genderDescription = gender.genderDescription;
            return this; //return the Builder object
        }

        //build a gender object -- like copy constructor in C++
        public Gender build() {
            return new Gender(this);
        }
    }

}
