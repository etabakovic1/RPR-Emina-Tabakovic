import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProfesorTest {

    private Profesor profesor;

    @BeforeEach
    void setUp() {
        profesor = new Profesor("Profesor", "1", "Sarajevo", LocalDate.of(1975, 4, 12),
                150, 2000, "3-00", "red. prof. dr.", 50);
    }

    @Test
    void testGettersAndSetters() {
        // Atributi iz NastavnoOsoblje
        assertEquals(150, profesor.getBrojCasova());
        assertEquals(2000, profesor.getGodinaZaposlenja());
        assertEquals("3-00", profesor.getKancelarija());

        assertEquals("red. prof. dr.", profesor.getZvanje());
        assertEquals(50, profesor.getBrojDiplomanata());


        profesor.setBrojCasova(180);
        profesor.setGodinaZaposlenja(2005);
        profesor.setKancelarija("2-05");
        profesor.setZvanje("van. prof. dr.");
        profesor.setBrojDiplomanata(65);

        assertEquals(180, profesor.getBrojCasova());
        assertEquals(2005, profesor.getGodinaZaposlenja());
        assertEquals("2-05", profesor.getKancelarija());
        assertEquals("van. prof. dr.", profesor.getZvanje());
        assertEquals(65, profesor.getBrojDiplomanata());
    }

    @Test
    void testDajInformacije() {
        assertEquals("Profesor: red. prof. dr. Profesor 1", profesor.DajInformacije());
    }
}