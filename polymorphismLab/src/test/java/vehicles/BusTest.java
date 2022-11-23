package vehicles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusTest {

    private Bus minibus;

    @BeforeEach
    public void setUp(){minibus = new Bus("Steve");}

    @Test
    public void canCountPassengers(){
        int expected = 0;
        int actual = minibus.countPassengers();
        assertEquals(expected,actual);
    }
    @Test
    public void canAddPassenger(){
        minibus.addPassenger("Harry");
        int expected = 1;
        int actual = minibus.countPassengers();
        assertEquals(expected,actual);
    }
}
