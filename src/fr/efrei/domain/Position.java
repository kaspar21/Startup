package fr.efrei.domain;

public class Position {
    private String PositionCode;

    public Position(Builder builder){}

    public Position(String PositionCode){
        this.PositionCode = PositionCode;
    }

    public String getPositionCode() {
        return PositionCode;
    }

    @Override
    public String toString() {
        return "Position{" +
                "PositionCode='" + PositionCode + '\'' +
                '}';
    }

    public static class Builder {
        private String PositionCode;

        public Builder setPositionCode(String positionCode) {
            this.PositionCode = positionCode;
            return this;
        }

        public Builder copy(Position position){
            this.PositionCode = position.PositionCode;
            return this; //return the Builder object
        }

        //build a race object -- like copy constructor in C++
        public Position build() {
            return new Position(this);
        }
    }
}
