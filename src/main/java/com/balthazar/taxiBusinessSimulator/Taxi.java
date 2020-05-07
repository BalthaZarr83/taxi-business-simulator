package com.balthazar.taxiBusinessSimulator;

/**
 * Klasse Taxi: Zur Erzeugung eines Taxi Objekts
 */
public class Taxi {
    private int sitzplaetze;
    private double maxTankinhalt;
    private double aktTankinhalt;
    private double verbrPro100km;
    private double kmStand;

    public Taxi(int sitzplaetze, double maxTankinhalt, double aktTankinhalt, double verbrPro100km,
                double kmStand){

        this.sitzplaetze=sitzplaetze;
        this.maxTankinhalt=maxTankinhalt;
        this.aktTankinhalt=aktTankinhalt;
        this.verbrPro100km=verbrPro100km;
        this.kmStand=kmStand;
    }

    public double getMaxTankinhalt() {
        return maxTankinhalt;
    }

    public double getAktTankinhalt() {
        return aktTankinhalt;
    }

    public double getVerbrPro100km() {
        return verbrPro100km;
    }

    public double getKmStand() {
        return kmStand;
    }

    public int getSitzplaetze() {
        return sitzplaetze;
    }
}
