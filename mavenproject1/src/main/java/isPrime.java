
import java.util.Random;
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
public class isPrime {
     public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int userNum = keyboard.nextInt();
        if(checkPrime(userNum)==true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
        
    }
 public static boolean checkPrime(int checkNum){
    for(int i=2;i<=checkNum/2;i++)
	{
        int temp = checkNum%i;
	   if(temp==0)
	   {
            return false;
	   }
	}
    return true;
}

}

