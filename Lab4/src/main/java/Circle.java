/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpbig
 */
public class Circle {
    private double radius;
    private double PI = 3.14159;
    
    public Circle(){
        radius = 0;
    }
    public Circle(double rad){
        radius = rad;
    }
    
    public void setRadius(double rad){
        radius = rad;
    }
    public double getRadius(){
        return radius;
    }
    
    public double area(){
        return (PI* radius * radius);
    }
    public double diameter(){
        return (radius * 2);
    }
    public double circumference(){
        return (2 * radius * PI);
    }
    
}


