
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
    public static void Main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        
        int[] numFive = { 1, 12, 13, 5, 39};
        int userNum = keyboard.nextInt();
        
        for(int i = 1; i < 5; i++){
            if (numFive[i] > userNum) {
                System.out.println(numFive[i] + " is greater than " + userNum);
            }
        }
        
    }
    
    
}
