import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdavacTest {
    private Prodavac prodavacTrue;
    private Prodavac prodavacFalse;

    @BeforeEach
    public void setUp() {
        prodavacTrue = new Prodavac("Anel", 5, "ID12301");
        prodavacFalse = new Prodavac("Amina", 3, "ID12302");
    }

    @Test
    public void testGeteriSeteri() {
        prodavacTrue.setIme_prezime("Emina");
        assertEquals("Emina", prodavacTrue.getIme_prezime());

        prodavacTrue.setBroj_standa(10);
        assertEquals(10, prodavacTrue.getBroj_standa());

        prodavacTrue.setID("ID999");
        assertEquals("ID999", prodavacTrue.getID());
    }

    @Test
    public void testZdravljeTrue() {
        assertTrue(prodavacTrue.Zdravlje());
    }

    @Test
    public void testZdravljeFalse() {
        assertFalse(prodavacFalse.Zdravlje());
    }
}