import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    private Profesor profesor;
    private Asistent asistent;
    private Predmet predmet;

    @BeforeEach
    void setUp() {
        profesor = new Profesor("Profesor", "1", "", LocalDate.of(1999, 1, 1),
                150, 2000, "3-00", "red. prof. dr.", 50);
        asistent = new Asistent("Asistent", "1", "", LocalDate.of(1995, 5, 10),
                100, 2018, "2-15", "Lab 3", "Ponedjeljak");

        List<Asistent> asistenti = new ArrayList<>(Collections.singletonList(asistent));
        predmet = new Predmet("RPR", profesor, asistenti, 5.0);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("RPR", predmet.getNaziv());
        assertEquals(profesor, predmet.getOdgovorniProfesor());
        assertEquals(1, predmet.getAsistenti().size());
        assertEquals(5.0, predmet.getECTS(), 0.001);

        predmet.setNaziv("TP");
        predmet.setOdgovorniProfesor(null);
        predmet.setAsistenti(null);
        predmet.setECTS(6.0);

        assertEquals("TP", predmet.getNaziv());
        assertNull(predmet.getOdgovorniProfesor());
        assertNotNull(predmet.getAsistenti());
        assertTrue(predmet.getAsistenti().isEmpty());
        assertEquals(6.0, predmet.getECTS(), 0.001);
    }

    @Test
    void testDajInformacije() {
        assertEquals("Predmet: RPR, odgovorni profesor: Profesor: red. prof. dr. Profesor 1",
                predmet.DajInformacije());

        predmet.setOdgovorniProfesor(null);
        assertEquals("Predmet: RPR, odgovorni profesor: Nema profesora",
                predmet.DajInformacije());
    }
}