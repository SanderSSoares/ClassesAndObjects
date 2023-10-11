/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author sande
 */
public class Rectangle extends Shape{
    

    private double height = 5.0;
    private double width = 6.2;


    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    
    @Override//has to be override in order to use the abstract getarea from shapes
      public double getArea(){
        return height*width;
    }
    
    
    
    
    
}
