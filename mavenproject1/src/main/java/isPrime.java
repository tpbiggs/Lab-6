import java.util.Scanner;
/**
 *
 * @author tpbig
 */
public class isPrime {
     public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter #: ");
        int userNum = keyboard.nextInt();
        if(checkPrime(userNum)==true){
            System.out.print("Prime Number");
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

