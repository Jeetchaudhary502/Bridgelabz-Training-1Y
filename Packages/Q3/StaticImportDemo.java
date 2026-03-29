package com.gla.Packages.Q3;

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {

        double num1 = 16;
        double num2 = 25;

        // Using sqrt()
        System.out.println("Square root of 16: " + sqrt(num1));

        // Using pow()
        System.out.println("16 raised to power 2: " + pow(num1, 2));

        // Using max()
        System.out.println("Maximum of 16 and 25: " + max(num1, num2));

        // Using min()
        System.out.println("Minimum of 16 and 25: " + min(num1, num2));

        // Using abs()
        System.out.println("Absolute value of -25: " + abs(-num2));
    }
}