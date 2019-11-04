
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
public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Length 1: ");
        int length1 = keyboard.nextInt();
        System.out.println("Width 1: ");
        int width1 = keyboard.nextInt();
        System.out.println("Length 2: ");
        int length2 = keyboard.nextInt();
        System.out.println("Width 2: ");
        int width2 = keyboard.nextInt();
        
        LandTract plot1 = new LandTract(length1, width1);
        LandTract plot2 = new LandTract(length2, width2);
        
        if (plot1.equalArea(plot2) == true){
           System.out.println("The two LandTracts are equal.");
        }
        else{
            System.out.println("The two LandTracts are not equal.");
        }
        
    }
}
