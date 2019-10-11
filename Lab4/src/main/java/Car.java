/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpbig
 */
public class Car {
    private int yearModel;
    private String make;
    private int speed;
    
    public Car(int year, String carMake){
        yearModel = year;
        make = carMake;
        speed = 0;
    }
    
    public void brake(){
        if (speed >= 5){
        speed -= 5;
        }
        
        System.out.println("Speed: " + speed);
    }
    public void gas(){
        speed += 5;
        
        System.out.println("Speed: " + speed);
    }
    
    public int getSpeed(){
        return speed;
    }
    public int getYearModel(){
        return yearModel;
    }
    public String getMake(){
        return make;
    }
    
}
