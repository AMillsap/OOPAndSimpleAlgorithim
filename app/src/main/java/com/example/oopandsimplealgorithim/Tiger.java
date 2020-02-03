package com.example.oopandsimplealgorithim;

public class Tiger extends Animal
{
    private int energyGainFood = 5;
    private int energyGainSleep = 5;
    Tiger(Species type)
    {
        super(type);
        setmType(type);
    }

    @Override
    public void eatFood(Food meal)
    {
        if(meal != Food.GRAIN)
        {
            setEnergy(getEnergy()+ energyGainFood);
        }
        super.eatFood(meal);
    }

    @Override
    public void sleep()
    {
        setEnergy(getEnergy() + energyGainSleep);
        super.sleep();
    }

}
