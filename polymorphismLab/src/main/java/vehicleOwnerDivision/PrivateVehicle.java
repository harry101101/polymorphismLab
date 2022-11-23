package vehicleOwnerDivision;

import roadVehicles.RoadVehicle;

public abstract class PrivateVehicle extends RoadVehicle {

    private int cost;

    public PrivateVehicle(int cost){
        this.cost = cost;
    }

    public int getCost(){
        return cost;
    }
    public void setCost(int cost){
        this.cost = cost;
    }
}
