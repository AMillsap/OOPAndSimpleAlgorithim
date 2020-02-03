package com.example.oopandsimplealgorithim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Problem 1
    void findOccurrence(int intArray[])
    {
        int num1 = 0;
        int num2 = 0;
        int counterNum1 = 0;
        int mostOccurrence = 0;
        int counterMostOccurrence = 0;
        for(int i = 0; i < intArray.length; i++)
        {
            num1 = intArray[i];
            for(int j = 0; j < intArray.length; j++)
            {
                num2 = intArray[j];
                if(num1 == num2)
                {
                    counterNum1++;
                }
            }
            if(counterNum1 > counterMostOccurrence)
            {
                counterMostOccurrence = counterNum1;
                mostOccurrence = num1;
                counterNum1 = 0;
            }
            else
            {
                counterNum1 = 0;
            }
        }
    }


    //Problem 2
    boolean checkIfArmstrong(int num)
    {
        String numAsString = Integer.toString(num);
        int numArray[] = new int[numAsString.length()];
        int armstrongArray[] = new int[numArray.length];
        int answer = 0;
        for(int i = 0; i < numArray.length; i++)
        {
            numArray[i] = numAsString.toCharArray()[i] - '0';
        }
        for(int i = 0; i < numArray.length; i++)
        {
            armstrongArray[i] = (int) Math.pow(numArray[i],numArray.length);
        }

        for(int i = 0; i < numArray.length; i++)
        {
            answer += armstrongArray[i];
        }
        if(answer == num)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}


