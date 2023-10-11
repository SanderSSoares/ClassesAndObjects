/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shapes;

/**
 *
 * @author sande
 */
public abstract class Shape {//Abstrict because we can not make objects out of this. WE CAN NOT MAKE SHAPES!!!
    
    private boolean isFilled;
    protected String colour = "Yellow";
    
    public Shape(){
        System.out.println("Shape 1");
    }
    
    public Shape (boolean isFilled, String colour){
        this.isFilled = isFilled;
        this.colour = colour;
        System.out.println("Shape 2");
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public abstract double getArea();//All classes will have areas, but will get form different methods    
}
