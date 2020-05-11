package com.balthazar.taxiBusinessSimulator;

/**
 * Fahrpreismodell:
 * die ersten 30 Kilometer je 80 Cent pro km
 * von Kilometer 30-100 je 70 Cent pro km
 * von Kilometer 100 weg je 60 Cent pro Kilometer
 */
public class FareCalculator {

    private double shortRangeLimit=30.0;
    private double mediumRangeLimit=100.0;

    public double calculateFare(double drivingDistance){
       if (drivingDistance<shortRangeLimit){
           return drivingDistance*0.8;
       }
       if (drivingDistance<mediumRangeLimit){
           return 30*0.8 +(drivingDistance-shortRangeLimit)*0.7;
       }
       return 30*0.8 + 70*0.7+(drivingDistance-mediumRangeLimit)*0.6;

    }



}
