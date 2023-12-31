/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import Shapes.Rectangle;
import Shapes.Triangle;

/**
 *
 * @author sande
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle();
        Triangle tri3 = new Triangle();
        Triangle tri4 = new Triangle();
        Triangle tri5 = new Triangle();
        Triangle tri6 = new Triangle();
        
        int[] sideLengths = new int[18];//3 sides each triangle, 18 total for 6 triangles (length is 18), but the last index is 17
        // The lengths of tril's sides will be first, then the lengths of tri2's sides etc
        sideLengths[0] = 5;
        sideLengths[1] = 8;
        sideLengths[2] = 9;
        
        //tri5 (4,7,2)
        sideLengths[12] = 4;
        sideLengths[13] = 7;
        sideLengths[14] = 2;
        
        //We want to set the middle side of each triangle to be 3
        sideLengths[1] = 3;
        sideLengths[4] = 3;
        sideLengths[7] = 3;
        sideLengths[10] = 3;
        sideLengths[13] = 3;
        sideLengths[16] = 3;
        
        
        Rectangle rect1 = new Rectangle();  
        double area = rect1.getArea();
        System.out.println(area);
        
        
    }
    
}
