import java.time.LocalDate;

public class Student extends Osoba {

    private String brojIndeksa;
    private Integer godinaStudija;
    private Double prosjek;

    public Student(String ime, String prezime, String adresa, LocalDate datumRodjenja,
                   String brojIndeksa, Integer godinaStudija, Double prosjek) {
        super(ime, prezime, adresa, datumRodjenja);
        setBrojIndeksa(brojIndeksa);
        setGodinaStudija(godinaStudija);
        setProsjek(prosjek);
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public Integer getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(Integer godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public Double getProsjek() {
        return prosjek;
    }

    public void setProsjek(Double prosjek) {
        this.prosjek = prosjek;
    }


    @Override
    public String DajInformacije() {
        return "Student: " + ime + " " + prezime + ", broj indeksa: " + brojIndeksa;
    }
}