import java.time.LocalDate;

public abstract class Osoba implements IInformacije {
    protected String ime;
    protected String prezime;
    protected String adresa;
    protected LocalDate datumRodjenja;

    public Osoba(String ime, String prezime, String adresa, LocalDate datumRodjenja) {
        setIme(ime);
        setPrezime(prezime);
        setAdresa(adresa);
        setDatumRodjenja(datumRodjenja);
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }


    public boolean ProvjeriMaticniBroj(String maticniBroj) {
        if (maticniBroj == null || maticniBroj.length() < 7 || datumRodjenja == null) {
            return false;
        }
        boolean danIsti = datumRodjenja.getDayOfMonth() == Integer.parseInt(maticniBroj.substring(0, 2));
        boolean mjesecIsti = datumRodjenja.getMonthValue() == Integer.parseInt(maticniBroj.substring(2, 4));
        boolean godinaIsta = (datumRodjenja.getYear() % 1000) == Integer.parseInt(maticniBroj.substring(4, 7));

        return danIsti && mjesecIsti && godinaIsta;
    }

    @Override
    public String DajInformacije() {
        return "Ime i prezime: " + ime + " " + prezime;
    }
}