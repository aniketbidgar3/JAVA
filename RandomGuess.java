 import java.util.*;
public class RandomGuess { 
   public static void main(String[] args) { 
       //MINI PROJECT 
       Scanner sc = new Scanner(System.in); 
       int myNumber = (int)(Math.random()*100); 
       int userNumber ; 
 
       do { 
           System.out.println("Guess my number(1-100) : "); 
           userNumber = sc.nextInt(); 
 
           if(userNumber == myNumber) { 
               System.out.println("WOOHOO .. CORRECT NUMBER!!!"); 
               break; 
           } 
           else if(userNumber > myNumber) { 
               System.out.println("your number is too large"); 
           } 
           else { 
               System.out.println("your number is too small"); 
           } 
       } while(userNumber >= 0); 
 
       System.out.print("My number was : "); 
       System.out.println(myNumber); 

   }}