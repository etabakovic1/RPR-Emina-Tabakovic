import Klase.Odsjek;
import Klase.Student;
import Izuzeci.PremladStudentException;
import Izuzeci.StudentBuducnostException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean uspjesanUnos = false;
        Student student = null;

        while (!uspjesanUnos) {
            try {
                System.out.print("Datum rođenja (dd/mm/yyyy): ");
                String datumString = scanner.nextLine();

                int dan = Integer.parseInt(datumString.substring(0, 2));
                int mjesec = Integer.parseInt(datumString.substring(3, 5));
                int godina = Integer.parseInt(datumString.substring(6));

                LocalDate datumDate = LocalDate.of(godina, mjesec, dan);

                student = new Student("Ime", "Prezime", datumDate, "12345", Odsjek.RI, 2);
                uspjesanUnos = true;

            } catch (PremladStudentException e) {
                System.out.println(e.getMessage());
                return;
            } catch (StudentBuducnostException e) {
                System.out.println(e.getMessage());
                System.out.println("Molimo ponovite unos datuma rođenja!");
            } catch (Exception e) {
                System.out.println("Neispravan format datuma!");
            }
        }

        System.out.print("Unesite ocjene studenta: (x,y,...): ");
        String ocjeneString = scanner.nextLine();

        String[] dijelovi = ocjeneString.split(",");
        List<Integer> listaOcjena = new ArrayList<>();

        for (String dio : dijelovi) {
            listaOcjena.add(Integer.parseInt(dio.trim()));
        }

        student.setOcjene(listaOcjena);

        System.out.println("Unos studenta uspješan! " + student);
    }
}