package gr.hua.dit.it2024023;
import java.time.LocalDateTime;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class Truck extends Vehicles 
{
    //Extras for truck
    private int size;
    private int purpose;
    private int parkingSpotNumber2;

    public Truck(int size, int purpose, int parkingSpotNumber2, String licencePlate, int space, int type, int ip, LocalDateTime entryTime, int parkingSpotNumber) {
        super(licencePlate, space, type, ip, entryTime, parkingSpotNumber);
        this.size = size;
        this.purpose = purpose;
        this.parkingSpotNumber2 = parkingSpotNumber2;
    }

    public int getSize() {
        return size;
    }

    public int getPurpose() {
        return purpose;
    }

    public int getParkingSpotNumber2() {
        return parkingSpotNumber2;
    }
}
