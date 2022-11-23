package roadVehicles;

public abstract  class RoadVehicle {

    protected String vehicleType;

    protected int numberOfPassengers;
    protected int numberOfWheels;
    protected int maxSpeed;
    protected boolean isPrivateVehicle;

    public RoadVehicle (String vehicleType, int numberOfPassengers, int numberOfWheels, int maxSpeed, boolean isPrivateVehicle){
        this.vehicleType = vehicleType;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
        this.isPrivateVehicle = isPrivateVehicle;
    }


    public String getVehicleType(){return vehicleType;}
    public int getNumberOfPassengers(){return numberOfPassengers;}
    public int getNumberOfWheels() {return numberOfWheels;}
    public int getMaxSpeed(){return maxSpeed;}
    public boolean getIsPrivate(){return isPrivateVehicle;}
    public void setNumberOfPassengers(int numberOfPassengers){this.numberOfPassengers = numberOfPassengers;}
    public void setIsPrivateVehicle(boolean isPrivateVehicle){this.isPrivateVehicle = isPrivateVehicle;}

    public String makeNoise(){
        return "Hello I am a " + getVehicleType();
    }
    public String drive(){
        return "I am driving.";
    }
}
