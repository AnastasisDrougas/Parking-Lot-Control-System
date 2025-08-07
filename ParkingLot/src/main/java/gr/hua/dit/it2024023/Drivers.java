package gr.hua.dit.it2024023;
import java.time.LocalDateTime;
/**
 *
 * @author AnastasisDrougas it2024023
 */
public class Drivers 
{
    //All the attributes of the drivers class
    private String name;
    private String phone;
    private LocalDateTime entryTime;
    private int ip;
    private int parkingSpotNumber;
  
    public Drivers(String name, String phone, LocalDateTime entryTime,int ip,int parkingSpotNumber) {
        this.name = name;
        this.phone = phone;
        this.entryTime= entryTime;
        this.ip=ip;
        this.parkingSpotNumber=parkingSpotNumber;
    }

    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public LocalDateTime getEntryTime() {
        return entryTime;
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
}
