package com.broome;

public class Main {

    public static void main(String[] args) {

        //int has a width of 32


        int myMinValue = -2_147_483_648;
	    int myMaxValue = 2_147_483_647;

	    //byte has a width of 8
	    byte myByteValue = -128;
	    byte myNewByteValue =  (byte) (myByteValue/2);

	    //short has a width of 16
	    short myShortValue = 32767;

	    //long has a width of 64  or 2^63
	    long myLongValue = 100L;


	    byte myTestByte = 18;
	    short myTestShort = 24252;
	    int myTestInt = 10_252_550;
	    long myTestLong = ((50000 + (myTestByte*10))+ myTestShort + myTestInt);
	    System.out.println("My output= " + myTestLong);

    }
}
