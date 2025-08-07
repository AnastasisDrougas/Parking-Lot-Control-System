package gr.hua.dit.it2024023;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class Function3 
{
    protected final ArrayList<ParkingHistory> history;//ArrayList to store vehicle & driver data after departure.
    Scanner scanner = new Scanner(System.in);

    public Function3() {
        history = new ArrayList<>();
    }
    
    //method to add user data to history after departure
    public void addDriverInHistory(String licencePlate,String name,String phone,int payment,int space,int type,long totalHoursStayed,LocalDateTime entryTime)
    {
        ParkingHistory newDriverInHistory = new ParkingHistory(licencePlate,name,phone,payment,space,type,totalHoursStayed,entryTime);
        history.add(newDriverInHistory);
    }
    
    //History searching options.
    public int searchOptions()
    {
        int ans=0;
        System.out.println("Search Options:");
        System.out.println("(1) Search for a driver's information");
        System.out.println("(2) Available parking spots for Diesel/Gasoline vehicles & for Electric vehicles");
        System.out.println("(3) Search for a vehicle's information");
        
       boolean validAnswer;
       do{
            System.out.print("Please type your answer: ");
            try{
                ans = scanner.nextInt();
                if ((ans>=1)&&(ans<=3))
                {
                    validAnswer= true;
                }else
                {
                    System.out.println("This option does not exist, try again!");
                    validAnswer=false;
                }
            }catch (Exception e)
            {
                System.out.println("Invalid input, please enter answer (1-3)");
                scanner.nextLine();
                validAnswer=false;
            }
       }while(!validAnswer);
       return ans;//Return answer
    }
    
    
    public void printDriverHistory(String phone)
    {
        System.out.println("----------------Driver's Parking History---------------");
        System.out.println("| Licence Plate | Entry Date | Hours Parked | Payment | ");
         System.out.println("------------------------------------------------------");
        boolean flag=false;
        for (ParkingHistory h : history)
        {
            if(h.getPhone().equals(phone))
            {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String formattedEntryTime = h.getEntryTime().format(formatter);
                System.out.printf("|%-15s|%-12s|h%-13d|$%-8d|\n",h.getLicencePlate(),formattedEntryTime,h.getTotalHoursStayed(),h.getPayment());
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println();
             System.out.println("-------------------------------------------------------");
            System.out.print("\n\nSorry but the phone you provided does not belong to anyone!\nPress [enter] to continue:");
            
        }else{
            System.out.println("-------------------------------------------------------");
            System.out.print("\n\nPress [enter] to continue:");
        }
    }
    
    
    public void printVehicleHistory(String licencePlate)
    {
        System.out.println("----------------Vehicle's Parking History--------------");
        System.out.println("| Driver's Name | Entry Date | Hours Parked | Payment | ");
        System.out.println("------------------------------------------------------");
        boolean flag=false;
        for (ParkingHistory h : history)
        {
            if(h.getLicencePlate().equals(licencePlate))
            {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String formattedEntryTime = h.getEntryTime().format(formatter);
                System.out.printf("|%-15s|%-12s|h%-13d|$%-8d|\n",h.getName(),formattedEntryTime,h.getTotalHoursStayed(),h.getPayment());
                flag=true;
            }
        }
        if(flag==false)
        {
            System.out.println();
             System.out.println("-------------------------------------------------------");
            System.out.print("\n\nSorry but the licence plate you provided does not belong to any vehicle!\nPress [enter] to continue:");
            
        }else{
             System.out.println("-------------------------------------------------------");
            System.out.print("\n\nPress [enter] to continue:");
        }
    }
}
