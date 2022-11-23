package vehicles;

import vehicleOwnerDivision.PrivateVehicle;

public class Car extends PrivateVehicle{
    private boolean hasBoot;

    public Car(boolean hasBoot){
        this.hasBoot = hasBoot;
    }

    public boolean getHasBoot(){
        return hasBoot;
    }
    public void setHasBoot(boolean hasBoot){
        this.hasBoot = hasBoot;
    }

}
