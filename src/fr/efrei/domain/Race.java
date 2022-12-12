package fr.efrei.domain;
//Done

public class Race extends Employee{

    public String description;

    //default constructor
    public Race(int employeeID, String raceDescription) {}

    //add another constructor later
    public Race(Builder builder){
        this.description = builder.description;
    }

    //getters but no setters, to have protected classes

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Race{" +
                ", description='" + description + '\'' +
                '}';
    }

    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        public String description;

        //setters, not getters
        public Builder setDescription(String description) {
            this.description = description;
            return this; //return the Builder object
        }

        public Builder copy(Race race){
            this.description = race.description;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public Race build() {
            return new Race(this);
        }
    }

}
