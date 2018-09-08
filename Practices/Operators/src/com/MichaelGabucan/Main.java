package com.MichaelGabucan;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; //has two operators
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result -= 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result *= 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result /= 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result %= 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result += 1;
        System.out.println(previousResult + " + 1 = " + result);
        result++;
        System.out.println("Result now is " + result);
        result--;
        System.out.println("Result now is " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore != 100)
            System.out.println("You got the high score!");

        // you can use < , > , >= , <= operators as well!

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true " );

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("This should not show");

        boolean isTruck = true;
        if(isTruck)
            System.out.println("This should will show");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        //1. create a double var. with value 20
        double doubleValueFirst = 20d;
        //2. create a second var of type of double w/ value of 80
        double doubleValueSecond = 80d;
        //3.add both numbers up and multiply by 25
        double answer = (doubleValueFirst + doubleValueSecond) * 25;
        System.out.println("My answer = " + answer);
        //4. use the remainder operator to figure our the remainder from sum of 3 divided by 40
        double remainder = answer % 40;
        System.out.println("Remainer is " + remainder);
        //5. write if statement that displays a msg "Total was over the limit"
        if(remainder <= 20)
            System.out.println("Total was over the limit");
        //if the remaining total (#4) is equal to 20 or less.
    }
}
