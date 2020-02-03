package com.example.oopandsimplealgorithim;

import android.util.Log;

public class Monkey extends Animal
{

    private int energyGainFood = 2;
    private int energyLostinSound = 4;
    private int energyLostinPlay = 8;
    private String monkeySay = "";

    Monkey(Species type)
    {
        super(type);
        setmType(type);
    }

    @Override
    public void eatFood(Food meal)
    {
        setEnergy(getEnergy()+ energyGainFood);
        super.eatFood(meal);
    }

    @Override
    public void speak()
    {
        setEnergy(getEnergy() - energyLostinSound);
        super.speak();
    }

    public void play()
    {
        if(getEnergy() < energyLostinPlay)
        {
            monkeySay = "Monkey is too tired";
            Log.d("TAG", monkeySay);
        }
        else
        {
            monkeySay = "Ooo Ooo Ooo";
            setEnergy((getEnergy() - energyLostinPlay));
        }
    }
}
