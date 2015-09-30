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
public class Triangle {

    private double base;
    private double height;
    
    public Triangle (double baseLength, double heightLength) {
        base = baseLength;
        height = heightLength;
    }
    
    public Triangle () {
        base = 0;
        height = 0;
    }
    
    public double calculateArea () {
        return .5 * base * height;
    }
}
