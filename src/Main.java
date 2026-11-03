import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double>nutritivnaJagoda= new ArrayList<>();
        nutritivnaJagoda.add(20.0);
        nutritivnaJagoda.add(15.0);
        Voce jagoda=new Voce("Jagoda", "Hrvatska", nutritivnaJagoda, 0.8);

        List<Double>nutritivnaMrkva= new ArrayList<>();
        nutritivnaMrkva.add(30.0);
        nutritivnaMrkva.add(25.0);
        Povrce mrkva=new Povrce("Mrkva", "BiH", nutritivnaMrkva, 0.6);

        List<Double>nutritivnaPiletina= new ArrayList<>();
        nutritivnaPiletina.add(70.0);
        nutritivnaPiletina.add(65.0);
        Meso piletina=new Meso(VrstaMesa.piletina, "BiH", nutritivnaPiletina, 0.91);

        Prodavac prodavac1 = new Prodavac("A V", 4, "LIC-9901");
        Prodavac prodavac2 = new Prodavac("N B", 9, "LIC-8845");

        List<Pijaca> prehrambeniProizvodi = new ArrayList<>();
        prehrambeniProizvodi.add(jagoda);
        prehrambeniProizvodi.add(mrkva);
        prehrambeniProizvodi.add(piletina);

        for (Pijaca proizvod : prehrambeniProizvodi) {
            String naziv = "";
            if (proizvod instanceof Voce) {
                naziv = ((Voce) proizvod).getNaziv();
            } else if (proizvod instanceof Povrce) {
                naziv = ((Povrce) proizvod).getNaziv();
            } else {
                naziv = String.valueOf(((Meso) proizvod).getNaziv());
            }

            System.out.println("Proizvod: " + naziv + " (" + proizvod.getPorijeklo() + ")");
            System.out.println("Ukupan broj kalorija: " + String.format("%.2f", proizvod.DajBrojKalorija()));
            System.out.println("Status zdravlja: " + (proizvod.Zdravlje() ? "Zadovoljava uslove zdravlja" : "Ne zadovoljava uslove"));
        }


        List<IZdravlje> subjektiSaZdravljem = new ArrayList<>();
        subjektiSaZdravljem.add(prodavac1);
        subjektiSaZdravljem.add(prodavac2);

        for (IZdravlje subjekt : subjektiSaZdravljem) {
            if (subjekt instanceof Prodavac) {
                Prodavac p = (Prodavac) subjekt;
                System.out.println("Prodavač: " + p.getIme_prezime() + " | Štand: " + p.getBroj_standa() + " | ID Licence: " + p.getID());
                System.out.println("Status zdravlja: " + (p.Zdravlje() ? "Zdrav" : "Nije zdrav"));
            }
        }
    }
}