
import java.util.Random;
/**
 *
 * @author tpbig
 */
public class oddCounter {
public static void main(String[] args){
    Random rand = new Random();
    int i;
    int num;
    int odd = 0;
    int even = 0;
    
    for(i=0;i < 100; ++i){
        num = rand.nextInt(1000)+1;
        if (oddCheck(num) == true){
        System.out.println(num +" is odd.");
        ++odd;
         }
         else {
        System.out.println(num + " is even.");
            ++even;
        }
    
    }
    System.out.println("Odd: " + odd + "\n" + "Even: " + even);
    
}

public static boolean oddCheck(int number) {
    return number%2 != 0;
}
}
