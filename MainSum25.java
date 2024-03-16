import java.util.Scanner;

public class MainSum25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int numCompanies = sc.nextInt();

        // Buat array dari objek Sum25 untuk setiap perusahaan
        Sum25[] companies = new Sum25[numCompanies];

        // Input keuntungan untuk setiap perusahaan
        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + " : ");
            int numMonths = sc.nextInt();
            companies[i] = new Sum25(numMonths);

            System.out.println("Masukkan keuntungan untuk perusahaan ke-" + (i + 1));
            for (int j = 0; j < companies[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " : ");
                companies[i].keuntungan[j] = sc.nextDouble();
            }
        } 

        // Hitung total keuntungan untuk setiap perusahaan
        System.out.println("==============================================================");
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + companies[i].elemen + " bulan adalah = " + companies[i].totalBF(companies[i].keuntungan));
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + companies[i].elemen + " bulan adalah = " + companies[i].totalDC(companies[i].keuntungan, 0, companies[i].elemen - 1));
            System.out.println("==============================================================");
        }
    }
}

