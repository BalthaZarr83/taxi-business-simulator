package com.balthazar.taxiBusinessSimulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class FareCalculatorTest {

    public static DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Test
    void calculateFare_shortDistance() {
        FareCalculator fareCalculator= new FareCalculator();
        Assertions.assertEquals(16, fareCalculator.calculateFare(LocalDateTime.parse("2020-05-09 12:15", dateTimeFormatter),
                20), 0.01, "kurze Fahrt unter 30km");
    }
    @Test
    void calculateFare_mediumDistance() {
        FareCalculator fareCalculator= new FareCalculator();
        Assertions.assertEquals(59, fareCalculator.calculateFare(LocalDateTime.parse("2020-05-09 12:15", dateTimeFormatter),
                80), 0.01, "Fahrt zwischen 30 und 100km");
    }
    @Test
    void calculateFare_longDistance() {
        FareCalculator fareCalculator= new FareCalculator();
        Assertions.assertEquals(16, fareCalculator.calculateFare(LocalDateTime.parse("2020-05-09 12:15", dateTimeFormatter),
                20), 0.01, "Fahrt über 100 km");
        Assertions.assertEquals(16, fareCalculator.calculateFare(LocalDateTime.parse("2020-05-09 12:15", dateTimeFormatter),
                20), 0.01, "kurze Fahrt unter 30km");
    }

    @Test
    void calculateFare_longDistance_night() {

    }

}