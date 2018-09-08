package com.MichaelGabucan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Michael!");

        //BYESHORTINT

        //int has a width of 64
        int myIntValueMin = -2_147_483_648;
        int myIntValueMax = 2_147_483_647;

        //byte has a width of 8
        byte myByteValueMin = -128;
        byte myByteValueMax = 127;

        //short has a width of 16
        short myShortValueMin = -32_768;
        short myShortValueMax = 32_767;

        //long has a width of 2^64
        long myLongValueMin  = -9_223_372_036_854_775_808L;
        long myLongValueMax  = 9_223_372_036_854_775_807L;

        //example run find longTotalValueMax
        long longTotalValueMax = 5000 + 10 * (myIntValueMax + myByteValueMax + myLongValueMax);
        System.out.println("Total of Max for ByteShortInt " + longTotalValueMax);
    }
}


