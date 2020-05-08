package com.balthazar.taxiBusinessSimulator;

import java.time.LocalDateTime;

/**
 * Fahrpreismodell:
 * die ersten 30 Kilometer je 80 Cent pro km
 * von Kilometer 30-100 je 70 Cent pro km
 * von Kilometer 100 weg je 60 Cent pro Kilometer
 * wenn der Fahrtantritt nach 20 Uhr und vor 6 Uhr erfolgt soll pauschal 5 € hinzugerechnet werden
 * wenn der Fahrtantritt nach 22 Uhr und vor 5 Uhr erfolgt soll der Kilometer bezogene Tarif um 10% erhöht werden.
 */
public class FareCalculator {

    public double calculateFare(LocalDateTime startTime, double drivingDistance){
        return drivingDistance*0.80;
        // TODO: 06.05.2020  write a method that passes the tests
        //return 0.0;
    }

}
