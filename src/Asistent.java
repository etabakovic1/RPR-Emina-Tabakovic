import java.time.LocalDate;

public class Asistent extends NastavnoOsoblje {
    private String laboratorija;
    private String terminKonsultacija;

    public Asistent(String ime, String prezime, String adresa, LocalDate datumRodjenja,
                    Integer brojCasova, Integer godinaZaposlenja, String kancelarija,
                    String laboratorija, String terminKonsultacija) {
        super(ime, prezime, adresa, datumRodjenja, brojCasova, godinaZaposlenja, kancelarija);
        setLaboratorija(laboratorija);
        setTerminKonsultacija(terminKonsultacija);
    }

    public String getLaboratorija() {
        return laboratorija;
    }

    public void setLaboratorija(String laboratorija) {
        this.laboratorija = laboratorija;
    }

    public String getTerminKonsultacija() {
        return terminKonsultacija;
    }

    public void setTerminKonsultacija(String terminKonsultacija) {
        this.terminKonsultacija = terminKonsultacija;
    }

    @Override
    public String DajInformacije() {
        return "Asistent: " + ime + " " + prezime + ", Kancelarija: " + kancelarija;
    }
}