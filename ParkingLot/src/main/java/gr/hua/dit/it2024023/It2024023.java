package gr.hua.dit.it2024023;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class It2024023 
{
    public static void main(String[] args) 
    {
        Parkinglot parkingLot = new Parkinglot();//ParkingLot object.
        
        parkingLot.parkingLotICE();//Generating the parking spots for ICE vehicles.
        parkingLot.parkingLotEL();//Generating the parking spots for Electric vehicles.
        
        Interface controlInterface = new Interface(parkingLot);
        controlInterface.addSamples();//Generates samples of drivers and vehicles.
        controlInterface.addSamplesToHistory();//Generates samples of drivers and vehicles on History.
        controlInterface.control();
    }
}
