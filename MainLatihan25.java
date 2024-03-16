import java.util.Scanner;

public class MainLatihan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

        int akarBF = Latihan25.akarBF(bilangan);
        int akarDC = Latihan25.akarDC(bilangan, 1, bilangan);

        System.out.println("Bilangan: " + bilangan);
        System.out.println("Akar Kuadrat (Brute Force): " + (akarBF == -1 ? "Bukan kuadrat sempurna" : akarBF));
        System.out.println("Akar Kuadrat (Divide & Conquer): " + (akarDC == -1 ? "Bukan kuadrat sempurna" : akarDC));

        sc.close();
    }
}
