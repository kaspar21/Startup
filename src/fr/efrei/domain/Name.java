package fr.efrei.domain;
//Done

public class Name {
    private String firstname;
    private String surname;

    private Name() {}

    //add another constructor later
    private Name(Name.Builder builder){
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
        public Builder copy(Name empy){
            this.firstname = empy.firstname;
            this.surname = empy.surname;
            return this;
        }
        public Name build() {
            return new Name(this);
        }
    }
}
