
import java.util.Scanner;
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
    for(int i=0;i < numRooms; ++i){
      System.out.println("Room " + (i+1) + " size (sq ft): ");
      roomSize = keyboard.nextInt();
      System.out.println("Paint Price: ");
      paintPrice = keyboard.nextFloat();
      totPrice += roomCalc(roomSize, paintPrice);
    }
//add sum of each returned room price and output total
    
    System.out.println("Total Price: $" + totPrice);
    
  }
  
  
    public static float roomCalc(int feet, float paint){
        int gal = feet/115;
        if((feet/115) < 1){
            ++gal;
        }
        System.out.println("Gallons of Paint Used: " + gal);
        System.out.println("Hours of Labor Needed: " + (gal * 8) );
        System.out.println("Labor Charges: $" + (gal*26) );
        System.out.println("Cost of Paint: $" + (paint * gal) );
        
        return ((gal*26)+(paint*gal));
}
  
  }
