package com.kayx.javalearning;

public class Loops {

    public static void main(String[] args) {

        // for loop

        int[] myNumbers = {12, 15, 18, 21, 24};

        for (int i = 0; i < myNumbers.length; i++) {
            int x = myNumbers[i] / 3 * 5;
            //System.out.println(x);
        }

        for (int number : myNumbers) {        // burada myNumbers'in herbir degerini number'a atadi.

            //System.out.println(number/3*5);
        }

        for (int a = 0; a < 10; a++) {
            int b = a * 10;
            //System.out.println(b);
        }

        // While

        int j = 0;

        while (j < 10) {
            int m=j*10;
            System.out.println(m);
            j++;
        }


    }
}
