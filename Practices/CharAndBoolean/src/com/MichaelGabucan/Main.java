package com.MichaelGabucan;

public class Main {

    public static void main(String[] args) {
	    //width of 16 (2 bytes)
        char myChar = '\u02A3';
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = true; //true or false
        boolean isMale = true;
        System.out.println("Is Bob a male? " + isMale);

        //e.x. challenge
        //1. find the code for the registered symbol on the same line as copyright symbol.
        //2. create a variable of type char and assign it the unicode value for that symbol.
        //3. display in on screen.


        char unicodeSign = '\u00A9';
        System.out.println("unicode symbol: " + unicodeSign);

    }
}
