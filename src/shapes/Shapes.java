/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Matt Zepp
 * @date 9/30/15
 * @throws IOException
 * @throws NumberFormatException
 * This application calculates the area of a rectangle, square, and triangle using input from the command line.
 * Using the input from the user for the side lengths of the rectangle it will output the area.
 * Using the input from the user for the side length of the square it will output the area.
 * Using the input from the user for the height and base length of the triangle it will output the area.
 * The user will be prompted to run again at the end.
 * 
 */

import java.io.*;

public class Shapes {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          
            System.out.println("Welcome to the shapes program!");
            System.out.println("This program will calculate the area of a square, retangle, and triangel");
            
            boolean continueLoop = true;
            
            while(continueLoop) {
            //Rectangle sides input
            System.out.print("Enter length of side 1 of rectangle: ");
            double rectangleSide1 = Double.parseDouble(reader.readLine());
            
            System.out.print("Enter lenght of side 2 of rectangle: ");
            double rectangleSide2 = Double.parseDouble(reader.readLine());
            
            //Create new rectangle and print area
            Rectangle rectangle = new Rectangle(rectangleSide1, rectangleSide2);
            System.out.println ("Area of rectangle = " + rectangle.calculateArea());
            
            //Square side input
            System.out.print("Enter length of side of square: ");
            double squareSide = Double.parseDouble(reader.readLine());
            
            //Create new square and print area
            Square square = new Square(squareSide);
            System.out.println("Area of square = " + square.calcualteArea());
            
            //Triangle base and height input
            System.out.print("Enter length of base of triangle: ");
            double triangleBase = Double.parseDouble(reader.readLine());
            
            System.out.print("Enter height of triangle: ");
            double triangleHeight = Double.parseDouble(reader.readLine());
            
            Triangle triangle = new Triangle(triangleBase, triangleHeight);
            System.out.print("Area of triangle = " + triangle.calculateArea());
            
            System.out.println();
            
            //Ask user if they want to run again
            boolean badInput = true;
            while (badInput) { //run until user enters y or n
                System.out.print("Would you like to run again (y/n)? ");
                String yesno = reader.readLine();
                if(yesno.compareTo("n") == 0 || yesno.compareTo("N") == 0) {
                    continueLoop = false;
                    badInput = false;
                } else if (yesno.compareTo("y") == 0 || yesno.compareTo("Y") == 0) {
                    continueLoop = true;
                    badInput = false;
                } else {
                    System.out.println("Incorrect input.  Please try again.");
                }
            }
            
        }
            
            
        } catch (IOException e) {
             System.out.println("Error: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
      
        
    }
    
}
