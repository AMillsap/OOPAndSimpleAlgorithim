package com.example.oopandsimplealgorithim;

import android.util.Log;

class Animal
{
    private int energy = 50;
    private String sound;
    private int numberOfSpecies;
    private int energyGainFood = 5;
    private int energyLostSound = 3;
    private int energyGainSleep = 10;
    private  int knownAnimals = 0;
    private Species mType;

    Animal(Species type)
    {}

    public void soundOff()
    {
        speak();
        Log.d("TAG", "I have this much energy: " + getEnergy());
    }

    public void eatFood(Food meal)
    {
        setEnergy(getEnergy() + getEnergyGainFood());
    }

    public void speak()
    {
        setEnergy(getEnergy() - getEnergyLostSound());
    }

    public void sleep()
    {
        setEnergy(getEnergy() + getEnergyGainSleep());
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getNumberOfSpecies() {
        return numberOfSpecies;
    }

    public void setNumberOfSpecies(int numberOfSpecies) {
        this.numberOfSpecies = numberOfSpecies;
    }

    public int getEnergyGainFood() {
        return energyGainFood;
    }

    public void setEnergyGainFood(int energyGainFood) {
        this.energyGainFood = energyGainFood;
    }

    public int getEnergyLostSound() {
        return energyLostSound;
    }

    public void setEnergyLostSound(int energyLostSound) {
        this.energyLostSound = energyLostSound;
    }

    public int getEnergyGainSleep() {
        return energyGainSleep;
    }

    public void setEnergyGainSleep(int energyGainSleep) {
        this.energyGainSleep = energyGainSleep;
    }

    public int getKnownAnimals() {
        return knownAnimals;
    }

    public void setKnownAnimals(int knownAnimals) {
        this.knownAnimals = knownAnimals;
    }

    public Species getmType() {
        return mType;
    }

    public void setmType(Species mType) {
        this.mType = mType;
    }
}
