package vehicles;

import vehicleOwnerDivision.PublicVehicle;

import java.util.ArrayList;

public class Bus extends PublicVehicle {
    private String driverName;
    private ArrayList<String> passengers;

    public Bus (String driverName){
        this.driverName = driverName;
        this.passengers = new ArrayList<>();
    }
    public void setDriverName(String driverName){
        this.driverName = driverName;
    }
    public String getDriverName(){
        return this.driverName;
    }
    public void addPassenger(String passengerName){
        this.passengers.add(passengerName);
    }
    public ArrayList<String> getPassengers(){return passengers;}
    public int countPassengers(){return passengers.size();}

}
