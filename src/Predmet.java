import java.util.ArrayList;
import java.util.List;

public class Predmet implements IInformacije {
    private String naziv;
    private Profesor odgovorniProfesor;
    private List<Asistent> asistenti;
    private Double ECTS;

    public Predmet(String naziv, Profesor odgovorniProfesor, List<Asistent> asistenti, Double ECTS) {
        setNaziv(naziv);
        setOdgovorniProfesor(odgovorniProfesor);
        setAsistenti(asistenti);
        setECTS(ECTS);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Profesor getOdgovorniProfesor() {
        return odgovorniProfesor;
    }

    public void setOdgovorniProfesor(Profesor odgovorniProfesor) {
        this.odgovorniProfesor = odgovorniProfesor;
    }

    public List<Asistent> getAsistenti() {
        return asistenti;
    }

    public void setAsistenti(List<Asistent> asistenti) {
        this.asistenti = (asistenti != null) ? asistenti : new ArrayList<>();
    }

    public Double getECTS() {
        return ECTS;
    }

    public void setECTS(Double ECTS) {
        this.ECTS = ECTS;
    }

    @Override
    public String DajInformacije() {
        String profInfo = (odgovorniProfesor != null) ? odgovorniProfesor.DajInformacije() : "Nema profesora";
        return "Predmet: " + naziv + ", odgovorni profesor: " + profInfo;
    }
}