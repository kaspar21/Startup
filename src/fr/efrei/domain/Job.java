package fr.efrei.domain;

public class Job {
    private int positionCode;
    private String title;

    //default constructor
    private Job() {}

    //add another constructor later
    private Job(Builder builder){
        this.positionCode = builder.positionCode;
        this.title = builder.title;
    }

    //getters but no setters, to have protected classes
    public int getpositionCode() {
        return positionCode;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Job{" +
                "positionCode='" + positionCode + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    //builder class = static inner class, copy the same attributes at the top
    public static class Builder {
        private int positionCode;
        private String title;

        //setters, not getters
        public Builder setpositionCode(int positionCode) {
            this.positionCode = positionCode;
            return this; //return the Builder object
        }

        public Builder settitle(String title) {
            this.title = title;
            return this; //return the Builder object
        }

        public Builder copy(Job job){
            this.positionCode = job.positionCode;
            this.title = job.title;
            return this; //return the Builder object
        }

        //build a job object -- like copy constructor in C++
        public Job build() {
            return new Job(this);
        }
    }

}

