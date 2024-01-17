package arrays;/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 5: Working with Java arrays
Topic: Arrays
Sub-Topic: Out of Ordinary
*/

import java.util.Arrays;

public class ArrayExtras {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        // You can assign an int variable to a long
        long myLong = a;
        System.out.println("myLong = " + myLong);

        // And you can do this:
        long[] longArray = {0, 1, 2, 3, 4};
        System.out.println("longArray = " +
                Arrays.toString(longArray));

        // And this:
        long[] myLongArray = new long[2];
        myLongArray[0] = a;
        myLongArray[1] = b;
        System.out.println("myLongArray = " +
                Arrays.toString(myLongArray));

        // And you know you can do this.  Java autoboxes
        Integer aInteger = a;
        Integer bInteger = b;
        System.out.println("aInteger = " + aInteger);

        Integer[] integerArray = {0, 1, 2, 3, 4};
        System.out.println("integerArray = " +
                Arrays.toString(integerArray));

        Integer[] myIntegerArray = new Integer[2];
        // You can mix and match Integer, int here
        myIntegerArray[0] = aInteger;
        myIntegerArray[1] = b; //Java autoboxes b to Integer object
        System.out.println("myIntegerArray = " +
                Arrays.toString(myIntegerArray));



        //Long[] newLongArray = new int[2];//not compiles lang and int
        //Integer[] newIntegerArray = new int[2]; //not compiles


        int[] intArray = {0, 1, 2, 3, 4};
//        int misMatchedIndex = Arrays.mismatch(intArray, integerArray); //not compiles
//        boolean theSame = Arrays.equals(intArray, integerArray); //cannot compare different types
//        int compared = Arrays.compare(intArray, integerArray);


        //ingeger extends a number class, integer is a number
        System.out.println("\n---- Test methods with common super class");
        Number[] myNumberArray = {0, 1, 2, 4, 5};
        System.out.println("Arrays.mismatch(myNumberArray, integerArray) = "
                + Arrays.mismatch(myNumberArray, integerArray));
        System.out.println("Arrays.equals(myNumberArray, integerArray) = "
                + Arrays.equals(myNumberArray, integerArray));


        //int compare = Arrays.compare(myNumberArray, integerArray);
        // java.lang.Number doesn't implement comparable interface


    }
}