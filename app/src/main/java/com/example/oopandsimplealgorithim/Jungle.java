package com.example.oopandsimplealgorithim;

import java.util.List;

public class Jungle
{
    private List<Animal> listOfAnimals;
    private  Food food;
    private Species type;
    private int numOfTigers;
    private  int numOfMonkey;
    private int numOfSnakes;

    void soundOff()
    {
        for(int i = 0; i < listOfAnimals.size(); i++)
        {
            listOfAnimals.get(i).soundOff();
        }
    }

    void createAnimal(Species type)
    {
        if(type == Species.TIGER)
        {
            Animal newAnimal = new Tiger(Species.TIGER);
            listOfAnimals.add(newAnimal);
            numOfTigers ++;
        }
        else if(type == Species.MONKEY)
        {
            Animal newAnimal = new Monkey(Species.MONKEY);
            listOfAnimals.add(newAnimal);
            numOfMonkey ++;
        }
        else if (type == Species.SNAKE)
        {
            Animal newAnimal = new Snake(Species.SNAKE);
            listOfAnimals.add(newAnimal);
            numOfSnakes ++;
        }
        for(int i = 0; i < listOfAnimals.size(); i++)
        {
            if(listOfAnimals.get(i).getmType() == Species.TIGER)
            {
                listOfAnimals.get(i).setNumberOfSpecies(numOfTigers);
            }
            if(listOfAnimals.get(i).getmType() == Species.MONKEY)
            {
                listOfAnimals.get(i).setNumberOfSpecies(numOfMonkey);
            }
            if(listOfAnimals.get(i).getmType() == Species.SNAKE)
            {
                listOfAnimals.get(i).setNumberOfSpecies(numOfSnakes);
            }
        }
    }

}
