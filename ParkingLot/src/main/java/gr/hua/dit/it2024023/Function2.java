package gr.hua.dit.it2024023;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class Function2 
{
    public boolean isInTheSystemCheck(LocalDateTime entryTime)//heck if the vehicle is in the parking.
    {
        Scanner scanner = new Scanner(System.in);
        if(entryTime==null){
            System.out.print("The licence plate you provided does not belong to any vehicle! Press [enter] to continue: ");
            scanner.nextLine();
            return false;
        }else{return true;}
    }
    
    //Returns the total amount of money.
    public int paymentAfterDeparture(long totalHours)
    {
        if(totalHours<=3)
        {
            return 5;
        }else if (totalHours<=8)
        {
            return 8;
        }else if (totalHours<=23)
        {
            return 12;
        }else{return 15;}
    }
}
