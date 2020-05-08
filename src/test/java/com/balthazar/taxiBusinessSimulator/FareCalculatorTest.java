package com.balthazar.taxiBusinessSimulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FareCalculatorTest {

    @Test
    void calculateFare_shortDistance() {
        FareCalculator fareCalculator= new FareCalculator();
        Assertions.assertEquals(16, fareCalculator.calculateFare(20), 0.01, "kurze Fahrt üer 20km (20*0.8= 16)");
    }
    @Test
    void calculateFare_mediumDistance() {
        FareCalculator fareCalculator= new FareCalculator();
        Assertions.assertEquals(59, fareCalculator.calculateFare(80), 0.01, "Fahrt üer 80 km (30*0.8+ 50*0.7= 59)");
    }
    @Test
    void calculateFare_longDistance() {
        FareCalculator fareCalculator= new FareCalculator();
        Assertions.assertEquals(79, fareCalculator.calculateFare(110), 0.01, "Fahrt über 110 km (30*0.8+ 70*0.7 + 10*0.6= 79)");
    }

}