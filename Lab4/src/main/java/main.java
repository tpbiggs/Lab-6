
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tpbig
 */
public class main {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
//car section start
        Car myCar = new Car(1987, "Toyota Speedster AE86");
        
        for (int i = 0; i < 5; ++i){
            myCar.gas();
            System.out.println("Speed: " + myCar.getSpeed());
        }
        
        for (int i = 0; i < 5; ++i){
            myCar.brake();
            System.out.println("Speed: " + myCar.getSpeed());
        }
//car section end

//circle section start
        System.out.println("Radius: ");
        double rad = keyboard.nextDouble();
        
        Circle myCircle = new Circle(rad);
         
        System.out.println("Area: " + myCircle.area());
        System.out.println("Diameter: " + myCircle.diameter());
        System.out.println("Circumference: " + myCircle.circumference());
    }
}
