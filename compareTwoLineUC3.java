package com.bridgelabz.lineComparison;

import java.util.Scanner;
public class compareTwoLineUC3 {
    int x1,x2,x3,x4; // Declare the instance variable for the X coordinates
    int y1,y2,y3,y4; // Declare the instance variable for the Y coordinates

    // Method to getting line co-ordinates
    public void enterCoordinatesValues() {
        // Creating object of Scanner class for User Input
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter Coordinates of Line 1 - x1,y1,x2,y2 : ");
        x1 = Input.nextInt(); y1 = Input.nextInt(); x2 = Input.nextInt(); y2 = Input.nextInt();
        System.out.println("Enter Coordinates of Line 2 - x3,y3,x4,y4 : ");
        x3 = Input.nextInt(); y3 = Input.nextInt(); x4 = Input.nextInt(); y4 = Input.nextInt();
    }
    public int calculateLength1() {
        int length1 = (int) Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        return length1;
    }
    public int calculateLength2(){
        int length2 = (int) Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
        return length2;
    }
    // Method to check equality of two lines
    public void compareTwoLines(Integer length1,Integer length2) {
        if (length1.compareTo(length2) == 0) {
            System.out.println("Both lines are equal");
        } else if (length1.compareTo(length2) < 0) {
            System.out.println("Line1 is smaller than line2");
        } else if (length1.compareTo(length2) > 0) {
            System.out.println("Line1 is greater than line2");
        }
    }
    public static void main(String[] args) {
        // Showing Welcome message to console
        System.out.println("Welcome to Line Comparison Computation Program");
        // Creating Object of LineComparison class
        compareTwoLineUC3 lineComparison1 = new compareTwoLineUC3();
        System.out.println("Enter co-ordinates of line1 and Line2: ");
        lineComparison1.enterCoordinatesValues();
        int length1 = lineComparison1.calculateLength1();
        System.out.println("Length of Line1: " + length1);
        int length2 = lineComparison1.calculateLength2();
        System.out.println("Length of Line2: " + length2);
        compareTwoLineUC3 lineComparison2 = new compareTwoLineUC3();
        lineComparison2.compareTwoLines(length1, length2);
    }
}

