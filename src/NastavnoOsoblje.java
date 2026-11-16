import java.time.LocalDate;

public abstract class NastavnoOsoblje extends Osoba {
    protected Integer brojCasova;
    protected String kancelarija;
    protected Integer godinaZaposlenja;

    public NastavnoOsoblje(String ime, String prezime, String adresa, LocalDate datumRodjenja,
                           Integer brojCasova, Integer godinaZaposlenja, String kancelarija) {
        super(ime, prezime, adresa, datumRodjenja);
        setBrojCasova(brojCasova);
        setGodinaZaposlenja(godinaZaposlenja);
        setKancelarija(kancelarija);
    }

    public Integer getBrojCasova() {
        return brojCasova;
    }

    public void setBrojCasova(Integer brojCasova) {
        this.brojCasova = brojCasova;
    }

    public String getKancelarija() {
        return kancelarija;
    }

    public void setKancelarija(String kancelarija) {
        this.kancelarija = kancelarija;
    }

    public Integer getGodinaZaposlenja() {
        return godinaZaposlenja;
    }

    public void setGodinaZaposlenja(Integer godinaZaposlenja) {
        this.godinaZaposlenja = godinaZaposlenja;
    }

}