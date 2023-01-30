package com.kayx.javalearning;

public class Variables {

    public static void main(String[] args) {

        //Variables
        //integer
        int age = 20;
        System.out.println(10 * age);

        ///double - float
        double z = 5.0;
        double a = 11.0;
        float b = 10.0f;
        System.out.println(a / z);

        double pi = 3.14;
        int r = 6;
        System.out.println(2 * pi * r);

        //string
        String name = "James";
        String surname = "Hetfield";
        System.out.println(name);
        System.out.println(surname);

        //boolean
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        //final
        final int myInteger = 5;
        System.out.println("myInteger: " + myInteger);
        //myInteger = 4;
        System.out.println("myInteger: " + myInteger);
    }
}
