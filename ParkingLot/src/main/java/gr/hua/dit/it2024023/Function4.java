package gr.hua.dit.it2024023;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class Function4 
{
    private final ArrayList<Drivers> drivers;
    private final ArrayList<Vehicles> vehicle;

    
    public Function4(ArrayList<Drivers> drivers, ArrayList<Vehicles> vehicle) {
        this.drivers = drivers;
        this.vehicle = vehicle;
    }
    
    
    public void saveDataTofile(String filename)//Save data to file.
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        try(FileWriter writer = new FileWriter(filename))
        {
            writer.write("\n---------------------------Diesel/Gasoline Parking Spots-----------------------\n");
            writer.write("   Parking Spot      Licence Plate         Phone Number      Entry Date-Time   \n");
            for (int i = 0; i < 80; i++)//Save data for ICE vehicles.
            {
                boolean found = false;
                for (Vehicles v : vehicle) 
                {
                    if (v.getParkingSpotNumber() == i && v.getType() == 1) 
                    {
                        String phone = "NULL";
                        for (Drivers d : drivers) 
                        {
                            if (d.getIp() == v.getIp()) 
                            {
                                phone = d.getPhone();
                                break;
                            }
                        }
                        String format = v.getEntryTime().format(formatter);
                        writer.write(String.format("   #%-17s %-18s %-18s %-20s \n", i, v.getLicencePlate(), phone, format));
                        if (v.getSpace() == 2)//If the vehicle is a truck print the next spot as well.
                        {
                            i++;
                            writer.write(String.format("   #%-17s %-18s %-18s %-20s \n", i, v.getLicencePlate(), phone, format));
                        }
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    writer.write("   #" + i + "\n");
                }
            }

            writer.write("\n------------------------------Electric Parking Spots--------------------------\n");
            writer.write("   Parking Spot      Licence Plate       Phone Number      Entry Date-Time   \n");
            for (int i = 0; i < 20; i++)//Save data for Electric vehicles. 
            {
                boolean found = false;
                for (Vehicles v : vehicle) 
                {
                    if (v.getParkingSpotNumber() == i && v.getType() == 2) 
                    {
                        String phone = "NULL";
                        for (Drivers d : drivers) 
                        {
                            if (d.getIp() == v.getIp()) 
                            {
                                phone = d.getPhone();
                                break;
                            }
                        }
                        String format = v.getEntryTime().format(formatter);
                        writer.write(String.format("   #%-17s %-18s %-18s %-20s \n", i, v.getLicencePlate(), phone, format));
                        if (v.getSpace() == 2) //If the vehicle is a truck print the next spot as well. 
                        {
                            i++;
                            writer.write(String.format("   #%-17s %-18s %-18s %-20s \n", i, v.getLicencePlate(), phone, format));
                        }
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    writer.write("   #" + i + "\n");
                }
            }
        }catch(IOException e)
        {
            System.err.println("Failed to save data to file: " + filename);
        }
    }
    
    public void fileReaderPrint(String filename)//Read from saved file.
    {
        try(FileReader reader = new FileReader(filename))
        {
            int c;
            while((c=reader.read())!=-1)
            {
                System.out.print((char)c);
            }
        }catch(IOException e)
        {
            System.out.println("Failed to read file" + filename);
        }
    }
}
