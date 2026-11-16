import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("Student", "1", "Sarajevo", LocalDate.of(1998, 3, 2), "12345", 2, 8.5);
    }

    @Test
    void testGettersAndSetters() {
        assertEquals("Student", student.getIme());
        assertEquals("1", student.getPrezime());
        assertEquals("Sarajevo", student.getAdresa());
        assertEquals(LocalDate.of(1998, 3, 2), student.getDatumRodjenja());


        assertEquals("12345", student.getBrojIndeksa());
        assertEquals(2, student.getGodinaStudija());
        assertEquals(8.5, student.getProsjek(), 0.001);


        student.setIme("Mujo");
        student.setPrezime("Mujić");
        student.setAdresa("Titova 1");
        LocalDate noviDatum = LocalDate.of(1999, 1, 1);
        student.setDatumRodjenja(noviDatum);

        student.setBrojIndeksa("54321");
        student.setGodinaStudija(3);
        student.setProsjek(9.2);

        assertEquals("Mujo", student.getIme());
        assertEquals("Mujić", student.getPrezime());
        assertEquals("Titova 1", student.getAdresa());
        assertEquals(noviDatum, student.getDatumRodjenja());
        assertEquals("54321", student.getBrojIndeksa());
        assertEquals(3, student.getGodinaStudija());
        assertEquals(9.2, student.getProsjek(), 0.001);
    }

    @Test
    void testProvjeriMaticniBroj() {

        assertTrue(student.ProvjeriMaticniBroj("0203998123456"));


        assertFalse(student.ProvjeriMaticniBroj("0303998123456"));
        assertFalse(student.ProvjeriMaticniBroj("0204998123456"));
        assertFalse(student.ProvjeriMaticniBroj("0203999123456"));
        assertFalse(student.ProvjeriMaticniBroj("020399"));
        assertFalse(student.ProvjeriMaticniBroj(null));

        student.setDatumRodjenja(null);
        assertFalse(student.ProvjeriMaticniBroj("0203998123456"));
    }

    @Test
    void testDajInformacije() {
        assertEquals("Student: Student 1, broj indeksa: 12345", student.DajInformacije());
    }
}