/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author mzepp
 */

public class Rectangle {

private double side1;
private double side2;

    public Rectangle () {
        side1 = 0;
        side2 = 0;
    }
    
    public Rectangle (double sideLength1, double sideLength2) {
        side1 = sideLength1;
        side2 = sideLength2;
    }
    
    public double calculateArea () {
        return side1 * side2;
    }

}
