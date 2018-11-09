//This is a roulette simulator, note the current numbers I'm betting on are arbitrary,
//you can change them to whatever you want as long as they're not duplicated and between 0-36.
package roulette;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sam
 */
public class Roulette {

   
    public static void main(String[] args) {
       
        
        Scanner reader = new Scanner(System.in);
        
        
        Random roulette = new Random();
        int outcome;
        
        for (int counter=1; counter<=1;counter++){
            outcome=roulette.nextInt(37);
            System.out.println(outcome + " is the outcome ");
        
        
   
        
        double bet1;
        double bet2;
        double bet3;
        
        bet1 = 156;
        bet2 = 169;
        bet3 = 161;
        
        int[] mynumbers1 = {1}; 
        int[] mynumbers2 = {2,32,36};
        int[] mynumbers3 = {3,6,33};
        
        
        double odds1 =(float) (mynumbers1.length)/36;
        double odds2 =(float) (mynumbers2.length)/36;
        double odds3 =(float) (mynumbers3.length)/36;
        
        
        double winnings1;
        double winnings2;
        double winnings3;
        
        int foundIndex1 = Arrays.binarySearch(mynumbers1, outcome);
        int foundIndex2 = Arrays.binarySearch(mynumbers2, outcome);
        int foundIndex3 = Arrays.binarySearch(mynumbers3, outcome);
        
        
        
        
         
         if (foundIndex1>=0){
         
           winnings1=bet1/odds1;}else{ 
          
        
        winnings1 =0;
        }
        
          if (foundIndex2>=0){
         
           winnings2=bet2/odds2;}else{ 
          
        
        winnings2 =0;
        }
        
          if (foundIndex3>=0){
         
           winnings3=bet3/odds3;}else{ 
          
        
        winnings3 =0;
        }
        
        double totalwinnings = winnings1 +winnings2 +winnings3;
        double totalbet = bet1 +bet2 +bet3;
        double profitorloss= Math.round((totalwinnings-totalbet))*100/100;
        
        
        
        System.out.println(profitorloss + " is your net profit or loss");
        
        
        
        }
        
        
        
        
        
        
        
    }
    
}
