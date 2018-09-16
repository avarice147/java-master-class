package com.MichaelGabucan;

public class Main {

    public static void main(String[] args) {
        String car = "TOYOTA";

        switch(car.toLowerCase()) {
            case "toyota":
                System.out.println("This is a corolla");
                break;

            case "honda":
                System.out.println("This is a civic");
                break;

            case "chevrolet":
                System.out.println("This is a impala");
                break;

            case "kia":
                System.out.println("This is a optima");
                break;

            default:
                System.out.println("unkown car");
                break;
        }
    }// end of main
}//end of class
