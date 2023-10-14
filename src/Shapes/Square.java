/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author sande
 */
public class Square extends Rectangle implements Shape2D{

    public Square(boolean isFilled, String colour, int length) {
        super(isFilled, colour, length, length);
    }  
}
