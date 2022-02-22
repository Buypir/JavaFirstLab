package ua.lvit.iot.labs.first;

public record Helicopter(String name,
                         int numberOfPassengers,
                         int maxSpeed,
                         String helicopterCondition,
                         int numberOfSeats,
                         float weight) {
    static String companyName = "Helios-Copter";

    public static String CompanyName() {
        return companyName;
    }

    public Helicopter() {
        this("Storm", 5, 120);
    }

    public Helicopter(String name, int numberOfPassengers, int maxSpeed) {
        this(name, numberOfPassengers, maxSpeed, "Normal", 8, 1.4f);
    }
    @Override
    public String toString() {
        return  "------------------\nName: " + name + "\nNumber of passengers : " + numberOfPassengers + "\nMax speed: "
                + maxSpeed +" Km/h\nHelicopter condition is: " + helicopterCondition + "\nNumber of seats: "
                + numberOfSeats + "\nWeight: " + weight + " tons";
    }
}

