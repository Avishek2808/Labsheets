package ath;

public class Athlete {
    private String name;
    private double fastest_time;

    // Default constructor
    public Athlete() {
        this("No details provided!");
    }

    // Overloaded constructor
    public Athlete(String name) {
        this.name = name;
        this.fastest_time = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFastest_time() {
        return fastest_time;
    }

    public void setFastest_time(double fastest_time) {
        this.fastest_time = fastest_time;
    }

    public String toString() {

        System.out.print( this.name + ": " +this.fastest_time);
    }
}
