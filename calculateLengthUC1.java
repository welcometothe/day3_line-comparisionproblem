
    package com.bridgelabz.lineComparison;
import java.util.Scanner;
    public class calculateLengthUC1 {
        int x1;
        int y1;
        int x2;
        int y2;

        // Method to getting line co-ordinates
        public void enterCoordinatesValues() {
            // Creating object of Scanner class for User Input
            Scanner Input = new Scanner(System.in);
            System.out.println("Enter Coordinates of Line x1,y1: ");
            x1 = Input.nextInt();
            y1 = Input.nextInt();
            System.out.println("Enter Coordinates of Line x2,y2: ");
            x2 = Input.nextInt();
            y2 = Input.nextInt();
        }
        public double calculateLength() {
            double length = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
            return length;
        }
        public static void main(String[] args) {
            // Showing Welcome message to console
            System.out.println("Welcome to line Comparison Problem");
            // Creating Object of LineComparison class
            calculateLengthUC1 lineComparison1 = new calculateLengthUC1();
            lineComparison1.enterCoordinatesValues();
            System.out.print("Length of the Line: " + lineComparison1.calculateLength());
        }
    }


