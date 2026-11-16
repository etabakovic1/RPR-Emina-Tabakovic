import java.time.LocalDate;

public class Profesor extends NastavnoOsoblje {
    private String zvanje;
    private Integer brojDiplomanata;

    public Profesor(String ime, String prezime, String adresa, LocalDate datumRodjenja,
                    Integer brojCasova, Integer godinaZaposlenja, String kancelarija,
                    String zvanje, Integer brojDiplomanata) {
        super(ime, prezime, adresa, datumRodjenja, brojCasova, godinaZaposlenja, kancelarija);
        setZvanje(zvanje);
        setBrojDiplomanata(brojDiplomanata);
    }

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    public Integer getBrojDiplomanata() {
        return brojDiplomanata;
    }

    public void setBrojDiplomanata(Integer brojDiplomanata) {
        this.brojDiplomanata = brojDiplomanata;
    }

    @Override
    public String DajInformacije() {
        return "Profesor: " + zvanje + " " + ime + " " + prezime;
    }
}