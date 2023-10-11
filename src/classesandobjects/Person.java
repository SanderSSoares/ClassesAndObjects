/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjects;

import Shapes.Triangle;

/**
 *
 * @author sande
 */
public class Person {
    private int age;
    private String name;
    double Height;
    double weight;
    boolean isProgrammer;
    Triangle favTriangle;
    
    public Person(){
        age = 20;
        name = "Michael";
        System.out.println("Constructor 1");
    }
    
    public Person (int age){
        this.age = age;
        System.out.println("Constructor 2");
    }
    
    public Person (int age, String name){
        this.age = age;
        this.name = name;
        System.out.println("Constructor 3");
    }
    
    public Person (String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Constructor 4");
    }
}
