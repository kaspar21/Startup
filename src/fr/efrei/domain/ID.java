package fr.efrei.domain;
//Done

public class ID {
    private String typeID;
    private String valueID;

    private ID() {}

    private ID(Builder builder) {
        this.typeID = builder.typeID;
        this.valueID = builder.valueID;
    }

    public String getTypeID() {
        return typeID;
    }

    public String getValueID() {
        return valueID;
    }

    @Override
    public String toString() {
        return "ID{" +
                "typeID='" + typeID + '\'' +
                ", valueID='" + valueID + '\'' +
                '}';
    }

    public static class Builder {
        private String typeID;
        private String valueID;

        public Builder setTypeID(String typeID) {
            this.typeID = typeID;
            return this; //return the Builder object
        }

        public Builder setValueID(String valueID) {
            this.valueID = valueID;
            return this; //return the Builder object
        }

        public Builder copy(ID id){
            this.typeID = id.typeID;
            this.valueID = id.valueID;
            return this; //return the Builder object
        }
        public ID build() {
            return new ID(this);
        }
    }
}
