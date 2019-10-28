
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
        ///5.
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Starting Question 5. \n");
        int[] numFive = { 1, 12, 13, 5, 39};
        System.out.println("Enter test number: ");
        int userNum = keyboard.nextInt();
        
        numTest(numFive, userNum);
        
        ///11.
        System.out.println("Starting Question 11. \n");
        int[] testData = { 50, 28, 77, 100, 67, 89, 92};
        
        System.out.println("Total: " + getTotal(testData));
        System.out.println("Average: " + getAverage(testData));
        System.out.println("Highest: " + getHighest(testData));
        System.out.println("Lowest: " + getLowest(testData));
        
        
    }
    ///5.
    public static void numTest(int[] numbers, int Unumber){
       for(int i = 1; i < 5; i++){
            if (numbers[i] > Unumber) {
                System.out.println(numbers[i] + " is greater than " + Unumber);
            }
        } 
    }
    
    ///11.
    public static int getTotal(int[] tests){
        int total = 0;
        for (int i = 1; i < tests.length; i++){
            total =+ tests[i];
        }
    return total;
    }
    public static int getAverage(int[] tests){
        int average = 0;
        for (int i = 1; i < tests.length; i++){
            average =+ tests[i];
        }
        average = average / ((tests.length) - 1);
    return average;    
    }
    public static int getHighest(int[] tests){
        int highest = tests[0];
        for (int i = 1; i < tests.length; i++){
            if (tests[i] > highest){
                highest = tests[i];
            }
        }
    return highest;
    }
    public static int getLowest(int[] tests){
       int lowest = tests[0];
       for (int i = 1; i < tests.length; i++){
                if (tests[i] < lowest){
                    lowest = tests[0];
                }
        
       }
    return lowest;
    }
}

