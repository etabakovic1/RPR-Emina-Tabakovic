import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class VoceTest {
    private Voce voceNezdravo;
    private Voce voceZdravoKalorije;
    private Voce voceZdravoKoef;

    @BeforeEach
    public void setUp() {
        voceNezdravo = new Voce("Jabuka", "BiH", Arrays.asList(20.0, 20.0), 0.8);
        voceZdravoKalorije = new Voce("Banana", "BiH", Arrays.asList(30.0, 30.0), 0.8);
        voceZdravoKoef = new Voce("Kruška", "BiH", Arrays.asList(20.0), 0.7);
    }

    @Test
    public void getIsetNazivtest() {
        voceNezdravo.setNaziv("Limun");
        assertEquals("Limun", voceNezdravo.getNaziv());
    }

    @Test
    public void ZdravljeFalsetest() {
        assertFalse(voceNezdravo.Zdravlje());
    }

    @Test
    public void ZdravljeTruetest() {
        assertTrue(voceZdravoKalorije.Zdravlje());
        assertTrue(voceZdravoKoef.Zdravlje());
    }
}