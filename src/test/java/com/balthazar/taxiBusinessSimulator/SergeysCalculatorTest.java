package com.balthazar.taxiBusinessSimulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SergeysCalculator

@Test {
    void calculateFare_shortDistance() {
        FareCalculator fareCalculator= new FareCalculator();
        Assertions.assertEquals(16, fareCalculator.calculateFare(30), 0.01, "kurze Fahrt über 30km (30*0.9= 27)");
    }
    @Test
    void calculateFare_mediumDistance() {
        FareCalculator fareCalculator= new FareCalculator();
        Assertions.assertEquals(59, fareCalculator.calculateFare(80), 0.01, "Fahrt über 80 km (30*0.7+ 50*0.7= 59)");
    }
    @Test
    void calculateFare_longDistance() {
        FareCalculator fareCalculator= new FareCalculator();
        Assertions.assertEquals(79, fareCalculator.calculateFare(90), 0.01,


}