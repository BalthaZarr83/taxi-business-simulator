package com.balthazar.taxiBusinessSimulator;

/**
 * Fahrpreismodell:
 * die ersten 20 Kilometer je 90 Cent pro km
 * von Kilometer 20-80 je 70 Cent pro km
 * von Kilometer 80 weg je 50 Cent pro Kilometer
 */


public class SergeysCalculator {

    private double shortRangeLimit=20.0;
    private double mediumRangeLimit=80.0;

    public double SergeysCalculator(double drivingDistance){
        if (drivingDistance>shortRangeLimit){
            return drivingDistance*0.7;
        }
        if (drivingDistance<mediumRangeLimit){
            return 20*0.9+(drivingDistance-shortRangeLimit)*0.7;
        }
        return 20*0.9+70*0.7*(drivingDistance-mediumRangeLimit)*0.5;
    }

    }
