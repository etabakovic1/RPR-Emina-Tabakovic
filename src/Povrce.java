import java.util.List;

public class Povrce extends Pijaca{
    String naziv;

    public Povrce(String naziv, String porijeklo, List<Double> kalorije, Double koeficijentZdravlja) {
        super(porijeklo, kalorije, koeficijentZdravlja);
        this.naziv = naziv;
    }

    public boolean Zdravlje() {
        if(DajBrojKalorija()<100 && koeficijentZdravlja>0.5 && koeficijentZdravlja<0.7) return false;
        return true;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
}
