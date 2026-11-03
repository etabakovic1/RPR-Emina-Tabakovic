import java.util.List;

public abstract class Pijaca implements IZdravlje {
    private String porijeklo;
    private List<Double> kalorije;
    Double koeficijentZdravlja;

    public Double getKoeficijentZdravlja() {
        return koeficijentZdravlja;
    }

    public void setKoeficijentZdravlja(Double koeficijentZdravlja) {
        this.koeficijentZdravlja = koeficijentZdravlja;
    }

    public Pijaca(String porijeklo, List<Double>kalorije, Double koeficijentZdravlja) {
        this.porijeklo=porijeklo;
        this.kalorije=kalorije;
        this.koeficijentZdravlja=koeficijentZdravlja;

    }

    public String getPorijeklo() {
        return porijeklo;
    }

    public void setPorijeklo(String porijeklo) {
        this.porijeklo = porijeklo;
    }

    public List<Double> getKalorije() {
        return kalorije;
    }

    public void setKalorije(List<Double> kalorije) {
        this.kalorije = kalorije;
    }

    public Double DajBrojKalorija() {
        Double ukupno_kalorija = 0.0;
        for (Double kalorija : kalorije) {
            ukupno_kalorija = ukupno_kalorija + kalorija;
        }
        return ukupno_kalorija;
    }
    @Override
    public abstract boolean Zdravlje();
}


