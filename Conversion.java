
package conversion;

import java.util.*;

public class Conversion {

   public static void main(String[] args)
   {
      String input;        // To hold keyboard input
      int selection;       // Menu selection
      double distance;     // Distance in meters
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get a distance.
      System.out.print("Enter a distance in meters: ");
      distance = keyboard.nextDouble();
      
      // Display the menu and process the user's
      // selection until 4 is selected.
      do
      {
         // Display the menu.
         menu();

         // Get the user's selection.
         System.out.print("\nEnter your choice: ");
         selection = keyboard.nextInt();

         // Validate the user's selection.
         while (selection < 1 || selection > 4)
         {
            System.out.print("Invalid selection. Enter your choice: ");
            selection = keyboard.nextInt();
         }
         
         // Process the user's selection.
         switch (selection)
         {
            case 1 : showKilometers(distance);
                     break;
            case 2 : showInches(distance);
                     break;
            case 3 : showFeet(distance);
                     break;
            case 4 : System.out.println("Bye!");
         }
         
         System.out.println();
         
      } while (selection != 4);
   }
   
   /**
      The menu method displays the program's menu.
   */
      
   public static void menu()
   {
      System.out.println("1. Convert to kilometers");
      System.out.println("2. Convert to inches");
      System.out.println("3. Convert to feet");
      System.out.println("4. Quit the program");
   }
   /**
    * This method converts meters to inches
    * @param distance
    * @return distance*39.3701 (the meter to inch ratio)
    */
   public static double showInches(double distance)
   {
      return distance*39.3701; 
   }

    public static void showFeet(double newDistance){
       
       System.out.println(newDistance*3.2808);
       
   }

}