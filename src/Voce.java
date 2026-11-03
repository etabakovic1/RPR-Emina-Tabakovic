import java.util.List;

public class Voce extends Pijaca{
    private String naziv;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Voce(String naziv, String porijeklo, List<Double> kalorije,  Double koeficijentZdravlja) {
        super(porijeklo, kalorije, koeficijentZdravlja);
        this.naziv = naziv;
    }

    public boolean Zdravlje() {
            if(DajBrojKalorija()<50 && koeficijentZdravlja>0.75) return false;
            return true;
    }

}
