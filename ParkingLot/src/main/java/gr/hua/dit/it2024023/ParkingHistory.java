package gr.hua.dit.it2024023;
import java.time.LocalDateTime;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class ParkingHistory 
{
    //Every attribute that we want to save to the history ArrayList.
    private String licencePlate;
    private String name;
    private String phone;
    private int payment;
    private int space;
    private int type;
    private long totalHoursStayed;
    private LocalDateTime entryTime;
    

    public ParkingHistory( String licencePlate, String name,String phone, int payment, int space, int type,long totalHoursStayed,LocalDateTime entryTime) {
        this.licencePlate = licencePlate;
        this.name = name;
        this.payment = payment;
        this.space = space;
        this.type = type;
        this.totalHoursStayed = totalHoursStayed;
        this.entryTime = entryTime;
        this.phone = phone;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPayment() {
        return payment;
    }

    public int getSpace() {
        return space;
    }

    public int getType() {
        return type;
    }

    public long getTotalHoursStayed() {
        return totalHoursStayed;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }
    
    
    
}
