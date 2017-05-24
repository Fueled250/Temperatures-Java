/*S.McDonald 11/2/2016
Temperatures.java
Temperatures: display the message based on user's input
*/


import java.util.Scanner; //import Scanner class

public class Temperatures
{
   public static void main(String[] args)
   {
      //define constants
      final int HIGH = 90;
      final int LOW = 32;
      final int DIFF = 40;
      //placeholders/variables for user's entry
      int high;
      int low;
      //int diff;
      
      //input
      //define a new object from Scanner class
      Scanner my_input = new Scanner(System.in);
      System.out.println("Enter the day's high temperature: ");
      high = my_input.nextInt(); //captures user's entered value
      System.out.println("Enter the day's low temperature: ");
      low = my_input.nextInt(); //captures user's entered value
      
      //processing/output
      if (high >= HIGH)
         System.out.println("Heat warning!");
      if (low <= LOW)
         System.out.println("Freeze warning!"); //single alternative clause
         
      //diff = high - low;
      if ((high - low) > DIFF)
         System.out.println("Large temperature swing!");
      
      
      
   
   }//main method

}//class