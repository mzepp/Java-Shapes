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
public class Square {
    private double side;
    
    public Square (double sideLength) {
        side = sideLength;
    }
    
    public Square () {
        side = 0;
    }
    
    public double calcualteArea () {
        return Math.pow(side, 2);
    }
}
