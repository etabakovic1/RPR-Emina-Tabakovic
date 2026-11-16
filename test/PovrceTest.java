import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class PovrceTest {
    private Povrce test1;
    private Povrce test2;
    private Povrce test3;
    private Povrce test4;

    @BeforeEach
    public void SetUp() {
        test1 = new Povrce("mrkva", "BiH", Arrays.asList(30.0, 50.0), 0.6);
        test2 = new Povrce("paradajz", "Hrvatska", Arrays.asList(10.0, 30.0), 0.4);
        test3 = new Povrce("mrkva", "Hrvatska", Arrays.asList(100.0, 20.0), 0.55);
        test4 = new Povrce("krastavac", "Austrija", Arrays.asList(10.0, 30.0), 0.8);

    }

    @Test
    public void getIsetNazivtest() {
        test1.setNaziv("krompir");
        assertEquals("krompir", test1.getNaziv());
    }

    @Test
    public void getIsetPorijeklotest() {
        test2.setPorijeklo("Njemacka");
        assertEquals("Njemacka", test2.getPorijeklo());
    }

    @Test
    public void DajBrojKalorijatest() {
        assertEquals(80.0, test1.DajBrojKalorija());
    }

    @Test
    public void Zdravljetest1() {
        assertFalse(test1.Zdravlje());
    }
    @Test
    public void Zdravljetest() {
        assertTrue(test2.Zdravlje());
        assertTrue(test3.Zdravlje());
        assertTrue(test4.Zdravlje());

    }
}