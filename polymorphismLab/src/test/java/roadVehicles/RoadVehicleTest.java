package roadVehicles;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoadVehicleTest {

    private RoadVehicle batmobile;

    @BeforeEach
    public void setUp(){ batmobile = new RoadVehicle("car", 2,
            4, 300, true);}

    @Test
    public void canMakeNoise(){
        String expected = "Hello I am a car";
        String actual = batmobile.makeNoise();
        assertEquals(expected, actual);
    }
    @Test
    public void canDrive(){
        String expected = "I am driving.";
        String actual = batmobile.drive();
        assertEquals(expected, actual);
    }

}
