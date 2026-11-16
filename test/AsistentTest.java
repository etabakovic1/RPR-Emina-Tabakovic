import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AsistentTest {

    private Asistent asistent;

    @BeforeEach
    void setUp() {
        asistent = new Asistent("Asistent", "1", "Sarajevo", LocalDate.of(1995, 5, 10),
                100, 2018, "2-15", "Lab 3", "Ponedjeljak");
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("Lab 3", asistent.getLaboratorija());
        assertEquals("Ponedjeljak", asistent.getTerminKonsultacija());

        asistent.setLaboratorija("Lab 1");
        asistent.setTerminKonsultacija("Petak");

        assertEquals("Lab 1", asistent.getLaboratorija());
        assertEquals("Petak", asistent.getTerminKonsultacija());
    }

    @Test
    void testDajInformacije() {
        assertEquals("Asistent: Asistent 1, Kancelarija: 2-15", asistent.DajInformacije());
    }
}