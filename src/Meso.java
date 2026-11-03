import java.util.Collections;
import java.util.List;

public class Meso extends Pijaca{
    VrstaMesa naziv;

    public VrstaMesa getNaziv() {
        return naziv;
    }

    public void setNaziv(VrstaMesa naziv) {
        this.naziv = naziv;
    }


    public Meso(VrstaMesa naziv, String porijeklo, List<Double> kalorije, Double koeficijentZdravlja) {
        super(porijeklo, kalorije, koeficijentZdravlja);
        this.naziv = naziv;
    }
    public boolean Zdravlje() {
        if(koeficijentZdravlja>0.95) return true;
        return false;
    }
    public Double DajBrojKalorija() {
        Double osnovne_kalorije=super.DajBrojKalorija();
        return osnovne_kalorije*1.20;
    }

}