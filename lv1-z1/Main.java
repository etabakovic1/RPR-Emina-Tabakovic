import java.util.Scanner;

public class Main {

    public static boolean DaLiJeProst(int n) {
        if(n<=1) return false;

        for(int i=2; i*i<=n; i++) {
            if(n%i==0) return false;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in);
        int n=0;

        while (true) {
            System.out.print("Unesite broj n: ");
            n = ulaz.nextInt();
            if (n < 2) {
                System.out.println("Nije moguće izvršiti izračunavanje prostih brojeva");
                ulaz.close();
                return;
            } else if (n > 500) {
                System.out.println("Uneseni broj je prevelik!");
            } else {
                break;
            }
        }

        System.out.print("Prosti brojevi");
        for (int i = 2; i <= 2 * n; i++) {
            if (DaLiJeProst(i)) {
                System.out.print(i + " ");
            }
        }
    }
}