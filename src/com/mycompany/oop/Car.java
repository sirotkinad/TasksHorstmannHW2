package com.mycompany.oop;

public class Car { //part2, ex9

    private final int tankVolume;  //in gallons
    private final int fuelEfficiency;  //miles/gallons
    private int curDistance = 0;
    private int fuelLevel = 0;

    public Car(int tankVolume, int fuelEfficiency) {
        this.tankVolume = tankVolume;
        this.fuelEfficiency = fuelEfficiency;
    }

    public int getTankVolume() {
        return tankVolume;
    }


    public int getFuelEfficiency() {
        return fuelEfficiency;
    }


    public void drive(int miles){
        int wastedFuel = miles / fuelEfficiency;
        if(wastedFuel <= fuelLevel){
            curDistance += miles;
            fuelLevel -= wastedFuel;
        }
        else{
            curDistance += fuelEfficiency * fuelLevel;
            fuelLevel = 0;
        }
    }

    public void addGallons(int gallons){
        int emptyVolume = tankVolume - fuelLevel;
        if(gallons > emptyVolume)
            fuelLevel += emptyVolume;
        else
            fuelLevel += gallons;
    }

    public int getCurrentDistance(){
        return curDistance;
    }

    public int getFuelLevel(){
        return fuelLevel;
    }
}
