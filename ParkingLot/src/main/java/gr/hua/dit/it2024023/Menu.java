package gr.hua.dit.it2024023;
import java.util.Scanner;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class Menu 
{
   int ans=0;
   public int printMenuGetAnswer()
   {
       //Making the option menu.
       System.out.println("");
       System.out.println("          |===================|");
       System.out.println("          |Welcome to ParkSelf|");
       System.out.println("          |===================|\n\n");
       System.out.println(" Choose one of the following options (1-5).\n");
       System.out.println(" (1) Enter our parking.");
       System.out.println(" (2) Leave our parking (Proceed with the payment).");
       System.out.println(" (3) Search something related to our parking services.");
       System.out.println(" (4) Detailed description of parking spots and save to file.");
       System.out.println(" (5) Exit application.\n");
       
       Scanner scanner = new Scanner(System.in);
       boolean validAnswer;
       do{
            System.out.print("Please type your answer: ");
            try{
                ans = scanner.nextInt();
                if ((ans>=1)&&(ans<=5))
                {
                    validAnswer= true;
                }else
                {
                    System.out.println("This option does not exist, try again!");
                    validAnswer=false;
                }
            }catch (Exception e)
            {
                System.out.println("Invalid input, please enter answer (1-5)");
                scanner.nextLine();
                validAnswer=false;
            }
       }while(!validAnswer);
       return ans;//Return answer
    }
}
