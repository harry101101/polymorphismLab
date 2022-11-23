package animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {

    private Lion lion;

    @BeforeEach
    public void setUp(){
        lion = new Lion("scar", false);
    }

    @Test
    public void canMakeNoise(){
        String expected = "Hello, my name is scar.";
        String actual = lion.makeNoise();
        //assertThat()
        assertEquals(expected, actual);
    }

    @Test
    public void canEat(){
        String expected = "Mmm, that was tasty!";
        String actual = lion.eat();
        assertEquals(expected,actual);
    }

}
