package com.MichaelGabucan;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
	    int myIntValue = 5 / 3;

	    //width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 3f;

	    //width of double = 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //example challenge
        //Convert given # of pounds to kilograms
        //1. create a var to store number of pounds
        //2. calculate # of kilograms for the number above and store in var
        //3. add total var for pounds * kilo for total
        //4. Print out the result
        //
        //NOTES: 1 pound is equal to 0.45359237 kilograms

        double numPounds = 200d;
        double convertedKilo = 0.45359237d;
        double poundIntoKiloTotal = numPounds * convertedKilo;
        System.out.println("For every " + numPounds + " pounds is equal to " + poundIntoKiloTotal + " kilograms!" );
        //result is 90.7185

    }
}




