package Klase;

import Izuzeci.PremladStudentException;
import Izuzeci.StudentBuducnostException;
import Izuzeci.DijeljenjeSNulomException;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Student {
    private String ime, prezime, brojIndeksa;
    private Odsjek odsjek;
    private LocalDate datumRodjenja;
    private Integer godinaStudija;
    private List<Integer> ocjene;

    public Student(String ime, String prezime, LocalDate datumRodjenja, String brojIndeksa, Odsjek odsjek, Integer godinaStudija) throws PremladStudentException, StudentBuducnostException
    {
        setIme(ime);
        setPrezime(prezime);
        setDatumRodjenja(datumRodjenja);
        setBrojIndeksa(brojIndeksa);
        setOdsjek(odsjek);
        setGodinaStudija(godinaStudija);
        setOcjene(new ArrayList<Integer>());
    }
    public Double Prosjek() throws DijeljenjeSNulomException {
        Double prosjek = 0.0;
        for (Integer ocjena : ocjene)
            prosjek += ocjena;
        if(ocjene.size()==0) throw new DijeljenjeSNulomException("Nije moguće dijeljenje s nulom!");
        return prosjek / ocjene.size();
    }
    public String toString() {
        try {
            return "Klase.Student: " + ime + " " + prezime + ", broj indeksa: " +
                    brojIndeksa + ", prosjek: " + Prosjek();
        } catch(DijeljenjeSNulomException e) {
            System.out.println("Student nema nijednu unesenu ocjenu! Nije moguće ispisati podatke.");
            return "";
        }
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public Odsjek getOdsjek() {
        return odsjek;
    }

    public void setOdsjek(Odsjek odsjek) {
        this.odsjek = odsjek;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) throws
            StudentBuducnostException, PremladStudentException {
        LocalDate today = LocalDate.now();
        if (datumRodjenja.isEqual(today) || datumRodjenja.isAfter(today))
            throw new StudentBuducnostException("Datum rođenja ne može biti u budućnosti!");
        else if (today.getYear() - datumRodjenja.getYear() < 16)
            throw new PremladStudentException("Klase.Student ne može biti mlađi od 16 godina!");
        this.datumRodjenja = datumRodjenja;
    }

    public void setGodinaStudija(Integer godinaStudija) {
        if (this.odsjek != Odsjek.RS && godinaStudija > 0 && godinaStudija < 6)
            this.godinaStudija = godinaStudija;
        else if (this.odsjek == Odsjek.RS && godinaStudija > 0 && godinaStudija <=
                2)
            this.godinaStudija = godinaStudija;
    }


    public Integer getGodinaStudija() {
        return godinaStudija;
    }

    public List<Integer> getOcjene() {
        return ocjene;
    }

    public void setOcjene(List<Integer> ocjene) {
        this.ocjene = ocjene;
    }
}