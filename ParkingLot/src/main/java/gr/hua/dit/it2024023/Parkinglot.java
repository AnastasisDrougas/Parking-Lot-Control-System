package gr.hua.dit.it2024023;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class Parkinglot 
{
    boolean[] parkingICE=new boolean[80];
    boolean[] parkingEL=new boolean[20];

    public void parkingLotICE()//Setting all the parking slots for ICE at true.
    {
        for (int i=0;i<80;i++)
        {
            parkingICE[i]=true;
        }
    }
    
    public boolean[] getParkingLotICE()
    {
        return parkingICE;
    }
  
    
    public void parkingLotEL()//Setting all the parking slots for Electric vehicles at true.
    {
        for (int i=0;i<20;i++)
        {
            parkingEL[i]=true;
        }
    }
    
    public boolean[] getParkingLotEL()
    {
        return parkingEL;
    }
    
    //Returns the parking spot of the vehicle.
    public int isParkingSpotICE(int space) 
    {
        for (int i = 0; i < 80; i++) 
        {
            if (space == 2 && i < 79) 
            { 
                if (parkingICE[i] && parkingICE[i + 1]) 
                {
                    parkingICE[i] = false;  
                    parkingICE[i + 1] = false;
                    return i;
                }
            } else if (space == 1) 
            { 
                if (parkingICE[i]) 
                {
                    parkingICE[i] = false;  
                    return i;
                }
            }
        }
        return -1; 
    }
    
    //Returns the parking spot of the vehicle.
    public int isParkingSpotEL(int space) 
    {
        for (int i = 0; i < 20; i++) 
        {
            if (space == 2 && i < 19) 
            { 
                if (parkingEL[i] && parkingEL[i + 1]) 
                {
                    parkingEL[i] = false;  
                    parkingEL[i + 1] = false;
                    return i;
                }
            } else if (space == 1) 
            { 
                if (parkingEL[i]) 
                {
                    parkingEL[i] = false;  
                    return i;
                }
            }
        }
        return -1;
    }
   
    
    //Frees the position spot of the ICE vehicle.
    public void FreeSpaceICE(int position, int space)
    {
        if (space == 2) // Truck occupies two spots
        {
            parkingICE[position] = true;
            parkingICE[position + 1] = true;
        }
        else // Car or motorcycle
        {
            parkingICE[position] = true;
        }
    }
    
    //Frees the position spot of the Electric vehicle.
    public void FreeSpaceEL(int position, int space)
    {
        if (space == 2) // Truck occupies two spots
        {
            parkingEL[position] = true;
            parkingEL[position + 1] = true;
        }
        else
        {
            parkingEL[position] = true;
        }
    }
    
    public void printAvailableParkingSpots()
    {
        int availableICE=0;
        int availableEL=0;
        System.out.println("---Diesel/Gasoline Vehicles Parking Spots---");
        for(int i=0;i<80;i++)
        {
            if(parkingICE[i]==true)
            {
                availableICE++;
            }
        }
        System.out.println("    Available: "+availableICE+"/80");
        
        System.out.println("---Electric Vehicles Parking Spots---");
        for(int i=0;i<20;i++)
        {
            if(parkingEL[i]==true)
            {
                availableEL++;
            }
        }
        System.out.println("    Available: "+availableEL+"/20");
        System.out.print("\n\nPress [enter] to return to the main menu");
    }
}
