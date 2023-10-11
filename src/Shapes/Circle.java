/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author sande
 */
public class Circle extends Shape{
    
    private double radius = 7.0;
    
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
