import java.util.Scanner;

public class MainFaktorial25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial25[] fk = new Faktorial25[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial25();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("===============================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            long startTime = System.currentTimeMillis(); // Waktu awal Brute Force
            int hasilBF = fk[i].faktorialBF(fk[i].nilai);
            long endTime = System.currentTimeMillis(); // Waktu akhir Brute Force
            long executionTimeBF = endTime - startTime; // Waktu eksekusi Brute Force
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilBF + " (Time: " + executionTimeBF + " milliseconds)");
        }

        System.out.println("===============================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            long startTime = System.currentTimeMillis(); // Waktu awal Divide and Conquer
            int hasilDC = fk[i].faktorialDC(fk[i].nilai);
            long endTime = System.currentTimeMillis(); // Waktu akhir Divide and Conquer
            long executionTimeDC = endTime - startTime; // Waktu eksekusi Divide and Conquer
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilDC + " (Time: " + executionTimeDC + " milliseconds)");
        }
        System.out.println("===============================================================");
    }
}
