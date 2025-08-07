package gr.hua.dit.it2024023;
import java.util.Scanner;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class ParkingSpotControl 
{
    ClearScreen clear = new ClearScreen();
    Scanner scanner = new Scanner(System.in);
    Parkinglot parkingLotObj;
    public ParkingSpotControl(Parkinglot parkingLot) {
        this.parkingLotObj = parkingLot;
    }
    
    //Finds if there is parking spots free.
    public int findParkingSpot(int space, int type) 
    {
        int position; 
        if (type == 1) 
        { 
            position = parkingLotObj.isParkingSpotICE(space); 
            if (position==-1) 
            {
                System.out.println("\n\nSorry but there is not more parking spots left!");
                return -1;
            }
        }else 
        { 
            position = parkingLotObj.isParkingSpotEL(space); 
            if (position==-1) 
            {
                //If there is no more parking spots for electric vehicles, they go to the parking spots of the ICE vehicles.
                position = parkingLotObj.isParkingSpotICE(space);
                clear.clearScreen();
                System.out.print("There is no more parking spots left for electric vehicles! Your parking spot number: Diesel/Gasoline #"+(position+1));
                return -2;//The Electric Vehicle is in an ICE parking spot.
            }
        }
        return position; 
    }
    
    public void printVehicleParkingSpotPosition(int position,int fuelType)
    {
        clear.clearScreen();
        if(fuelType==1)
        {
            System.out.print("Your parking spot number: Diesel/Gasoline #"+(position)+"\nPress [enter] to continue: ");
            scanner.nextLine();
        }else
        {
            System.out.print("Your parking spot number: ELectric #"+(position)+"\nPress [enter] to continue: ");
            scanner.nextLine();
        }
        
    }
}

