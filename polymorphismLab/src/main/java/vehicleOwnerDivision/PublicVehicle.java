package vehicleOwnerDivision;

import roadVehicles.RoadVehicle;

public abstract class PublicVehicle extends RoadVehicle {
    private float fare;
    private boolean isRunning;

   // public PublicVehicle(){
     //   super();
    ///}

    public PublicVehicle(float fare, boolean isRunning){
        this.fare = fare;
        this.isRunning = isRunning;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public boolean getIsRunning(boolean isRunning) {
        return isRunning;
    }
    public void setIsRunning(){
        this.isRunning = isRunning;
    }
}

