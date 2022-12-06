package fr.efrei.domain;
//Done

public class Gender {
    private String genderID;
    private String genderDescription;

    //default constructor
    private Gender() {}

    //add another constructor later
    private Gender(Builder builder){
        this.genderID = builder.genderID;
        this.genderDescription = builder.genderDescription;
    }

    //getters but no setters, to have protected classes
    public String getgenderID() {
        return genderID;
    }

    public String getgenderDescription() {
        return genderDescription;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderID='" + genderID + '\'' +
                ", genderDescription='" + genderDescription + '\'' +
                '}';
    }

    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        private String genderID;
        private String genderDescription;

        //setters, not getters
        public Builder setGenderID(String genderID) {
            this.genderID = genderID;
            return this; //return the Builder object
        }

        public Builder setgenderDescription(String genderDescription) {
            this.genderDescription = genderDescription;
            return this; //return the Builder object
        }

        public Builder copy(Gender gender){
            this.genderID = gender.genderID;
            this.genderDescription = gender.genderDescription;
            return this; //return the Builder object
        }

        //build a gender object -- like copy constructor in C++
        public Gender build() {
            return new Gender(this);
        }
    }

}
