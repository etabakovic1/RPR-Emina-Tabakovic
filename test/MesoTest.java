import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class MesoTest {
    private Meso mesoZdravo;
    private Meso mesoNezdravo;

    @BeforeEach
    public void setUp() {
        List<Double> kalorije1 = Arrays.asList(100.0, 150.0);
        mesoZdravo = new Meso(VrstaMesa.piletina, "BiH", kalorije1, 0.98);

        List<Double> kalorije2 = Arrays.asList(200.0);
        mesoNezdravo = new Meso(VrstaMesa.teletina, "Uvoz", kalorije2, 0.90);
    }

    @Test
    public void getIsettest() {
        mesoZdravo.setNaziv(VrstaMesa.puretina);
        assertEquals(VrstaMesa.puretina, mesoZdravo.getNaziv());

        assertEquals("BiH", mesoZdravo.getPorijeklo());

        mesoZdravo.setPorijeklo("EU");
        assertEquals("EU", mesoZdravo.getPorijeklo());

        mesoZdravo.setKalorije(Arrays.asList(50.0));
        assertEquals(1, mesoZdravo.getKalorije().size());

        mesoZdravo.setKoeficijentZdravlja(0.99);
        assertEquals(0.99, mesoZdravo.getKoeficijentZdravlja());
    }

    @Test
    public void ZdravljeTruetest() {
        assertTrue(mesoZdravo.Zdravlje());
    }

    @Test
    public void ZdravljeFalsetest() {
        assertFalse(mesoNezdravo.Zdravlje());
    }

    @Test
    public void DajBrojKalorijatest() {
        assertEquals(300.0, mesoZdravo.DajBrojKalorija());
    }
}