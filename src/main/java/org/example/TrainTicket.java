package org.example;

public class TrainTicket {

    private int distance;
    private int age;
    private static final double price = 0.21;
    private static final double minDisc = 0.8;
    private static final double magDisc = 0.6;


    public TrainTicket(int distance, int age) throws IllegalArgumentException {
        this.distance = validateTravelDistance(distance);
        this.age = validatePassengerAge(age);
    }

    private int validatePassengerAge(int age) throws IllegalArgumentException {
        if (age <= 0) {
            throw new IllegalArgumentException("Passenger age must be a positive integer.");
        }
        return age;
    }

    private int validateTravelDistance(int distance) throws IllegalArgumentException {
        if (distance <= 0) {
            throw new IllegalArgumentException("Travel distance must be a positive integer.");
        }
        return distance;
    }





    public double findPrice() {
        double basePrice = price * distance;
        double finalPrice = basePrice;

        if (age < 18) {
            finalPrice = basePrice * minDisc;
        } else if (age >= 65) {
            finalPrice = basePrice * magDisc;
        }

        return finalPrice;
    }
}

