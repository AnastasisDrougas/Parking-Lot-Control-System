package gr.hua.dit.it2024023;
import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 *
 * @author Anastasis Drougas it2024023
 */
public class Function1 {
     
    protected final ArrayList<Drivers> drivers; //Array list to store multiple Drivers
    protected final ArrayList<Vehicles> vehicles; //Array list to store multiple Vehicles
    
    public Function1() 
    {
       drivers= new ArrayList<>();
       vehicles= new ArrayList<>();
    }

    public ArrayList<Drivers> getDrivers() {
        return drivers;
    }

    public ArrayList<Vehicles> getVehicles() {
        return vehicles;
    }
    
    
    
    //method for adding new driver details in the system.
    public void addDriver(String name, String phone,LocalDateTime entryTime,int ip ,int parkingSpotNumber)
    {
        Drivers newDriver =  new Drivers(name,phone,entryTime,ip,parkingSpotNumber);
        drivers.add(newDriver);
    }
    
    //method for adding Motorcycle and Car details in the system
    public void addVehicleMotoCar(String licencePlate, int space,int type,int ip,LocalDateTime entryTime,int parkingSpotNumber)
    {
        if(type==1)
        {
            Vehicles newCar = new Car(licencePlate,space,type,ip,entryTime,parkingSpotNumber);
            vehicles.add(newCar);   
        }
        else
        {
            Vehicles newMoto = new Motorcycle(licencePlate,space,type,ip,entryTime,parkingSpotNumber);
            vehicles.add(newMoto);   
        }
    }
    
    //method for adding Truck details in the system
    public void addVehicleTruck(int size,int purpose,String licencePlate, int space,int type,int ip,int parkingSpotNumber,LocalDateTime entryTime,int parkingSpotNumber2)
    {
        Vehicles newTruck = new Truck(size, purpose, parkingSpotNumber2, licencePlate, space, type, ip, entryTime, parkingSpotNumber);
        vehicles.add(newTruck);
    }

    //Returns the space of the given vehicle.
    public int findSpace(String licencePlate)
    {
        for (Vehicles vehicle : vehicles)
        {
            if (vehicle.getLicencePlate().equals(licencePlate))
            {
                int space=vehicle.getSpace();
                return space;
            }
        }
        return 0;
    }
    
    //Returns the type of the given vehicle.
    public int findType(String licencePlate)
    {
        for (Vehicles vehicle : vehicles)
        {
            if (vehicle.getLicencePlate().equals(licencePlate))
            {
                int type=vehicle.getType();
                return type;
                
            }
        }
        return 0;
    }
    
    //Returns the entry time/date of the given vehicle.
    public LocalDateTime findEntryTime(String licencePlate)
    {
        for (Vehicles vehicle : vehicles)
        {
            if (vehicle.getLicencePlate().equals(licencePlate))
            {
                LocalDateTime entryTime=vehicle.getEntryTime();
                return entryTime;
            }
        }
        return null;
    }
    
    //Returns the ip of the given vehicle.
    public int findIP(String licencePlate)
    {
        int ip=0;
        for (Vehicles vehicle : vehicles)
        {
            if (vehicle.getLicencePlate().equals(licencePlate))
            {
                
                ip=vehicle.getIp();
                
            }
        }
        return ip;
    }
    
    //Returns the name of the driver using the user's ip.
    public String findName(int ip)
    {
        for (Drivers driver : drivers)
        {
            if (driver.getIp()==ip)
            {
                return driver.getName();
            }
        }
        return null;
    }
    
    //Returns the phone number of the driver using the user's ip.
    public String findPhone(int ip)
    {
        for (Drivers driver : drivers)
        {
            if (driver.getIp()==ip)
            {
                return driver.getPhone();
            }
        }
        return null;
    }
    
    //Driver in the system search.
    public boolean driverInTheSystem(String name)
    {
        for (Drivers driver : drivers)
        {
            if (driver.getName().equals(name))
            {
                return true;
            }
        }
        return false;
    }
    
    //Vehicle in the system search.
    public boolean vehicleInTheSystem(String licencePlate)
    {
        for (Vehicles vehicle : vehicles)
        {
            if (vehicle.getLicencePlate().equals(licencePlate))
            {
                return true;
            }
        }
        return false;
    }
    
    //Used to update the driver's position.
    public void updateDriverPosition(String name, int newPosition) 
    {
        for (Drivers driver : drivers) 
        {
            if (driver.getName().equals(name)) 
            {
                driver.setParkingSpotNumber(newPosition);
                break;
            }
        }
    }
    
    //Used to update the vehicle's position.
    public void updateVehiclePosition(String licencePlate, int newPosition) 
    {
        for (Vehicles vehicle : vehicles) 
        {
            if (vehicle.getLicencePlate().equals(licencePlate)) 
            {
                vehicle.setParkingSpotNumber(newPosition);
                break;
            }
        }
    }
    
    //Updates fuel type of the vehicle (Used in electric vehicles to put them into the ICE vehicle parking spots if the electric are full).
    public void updateVehicleFuelType(String licencePlate, int newType)
    {
        for (Vehicles vehicle : vehicles) 
        {
            if (vehicle.getLicencePlate().equals(licencePlate)) 
            {
                vehicle.setType(newType);
                break;
            }
        }
    }
    //Returns the vehicle's parking spot.
    public int returnParkingSpotPosition(String licencePlate)
    {
        int position=-1;
        for (Vehicles vehicle : vehicles)
        {
            if(vehicle.getLicencePlate().equals(licencePlate))
            {
                position = vehicle.getParkingSpotNumber();
            }
        }
        return position;
    }
}
