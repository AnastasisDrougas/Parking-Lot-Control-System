package gr.hua.dit.it2024023;
import java.time.LocalDateTime;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class Vehicles 
{
    //All the attributes for the Vehicles.
    private String licencePlate;
    private int space;
    private int type;
    private int ip;
    private LocalDateTime entryTime;
    private int parkingSpotNumber;
    
    
    public Vehicles(String licencePlate, int space, int type, int ip, LocalDateTime entryTime, int parkingSpotNumber) {
        this.licencePlate = licencePlate;
        this.space = space;
        this.type = type;
        this.ip = ip;
        this.entryTime = entryTime;
        this.parkingSpotNumber = parkingSpotNumber;
    }
    
    public String getLicencePlate() {
        return licencePlate;
    }

    public int getSpace() {
        return space;
    }

    public int getType() {
        return type;
    }
    public int getIp() {
        return ip;
    }

    public int getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(int parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setType(int type) {
        this.type = type;
    }
}
