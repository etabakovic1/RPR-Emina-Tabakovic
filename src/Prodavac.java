public class Prodavac implements IZdravlje{
    private String ime_prezime;
    private Integer broj_standa;
    private String ID;

    public Prodavac(String ime_prezime, Integer broj_standa, String ID) {
        this.ime_prezime=ime_prezime;
        this.broj_standa=broj_standa;
        this.ID=ID;
    }
    public String getIme_prezime() {
        return ime_prezime;
    }

    public void setIme_prezime(String ime_prezime) {
        this.ime_prezime = ime_prezime;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getBroj_standa() {
        return broj_standa;
    }

    public void setBroj_standa(Integer broj_standa) {
        this.broj_standa = broj_standa;
    }

    @Override
    public boolean Zdravlje() {
        return ID.endsWith("01");
    }
}
