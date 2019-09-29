
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
public class Paint {
  public static void main(String[] args){
   
    Scanner keyboard = new Scanner(System.in);
    int numRooms;
    int roomSize;
    float   totPrice = 0;
    float   paintPrice;
   
//ask for job's # of rooms
    System.out.println("How many...\n" + "Rooms need paint: ");
    numRooms = keyboard.nextInt();
 
//ask for each room size, send to method, and return price per room
    for(int i=0;i <= numRooms; ++i){
      System.out.println("Room size (sq ft): ");
      roomSize = keyboard.nextInt();
      System.out.println("Paint Price: ");
      paintPrice = keyboard.nextFloat();
      totPrice += paintPrice;
    }
//add sum of each returned room price and output total
    System.out.println("Total Price: $" + totPrice);
    
  }
  
  
    public static float roomCalc(int feet, float paint){
        int gal = feet/115;
        return ((gal*26)+(paint*gal));
}
  
  }
