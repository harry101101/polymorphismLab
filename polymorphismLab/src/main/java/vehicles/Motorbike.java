package vehicles;

import vehicleOwnerDivision.PrivateVehicle;

public class Motorbike extends PrivateVehicle{
    private boolean canDoWheelie;

    public Motorbike(boolean canDoWheelie){
        this.canDoWheelie = canDoWheelie;
    }
    public boolean getCanDoWheelie(){
        return canDoWheelie;
    }
    public void setCanDoWheelie(boolean canDoWheelie) {
        this.canDoWheelie = canDoWheelie;
    }
    @Override
    public String makeNoise(){
        return "VROOOOOOM!";
    }

}
