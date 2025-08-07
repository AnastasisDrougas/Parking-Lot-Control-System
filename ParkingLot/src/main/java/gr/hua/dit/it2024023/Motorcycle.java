package gr.hua.dit.it2024023;
import java.time.LocalDateTime;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class Motorcycle extends Vehicles 
{
    public Motorcycle(String licencePlate, int space, int type, int ip, LocalDateTime entryTime, int parkingSpotNumber) {
        super(licencePlate, space, type, ip, entryTime, parkingSpotNumber);
    }
}
