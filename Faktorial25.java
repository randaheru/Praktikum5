public class Faktorial25 {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto *= i;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * faktorialDC(n - 1);
        }
    }

    public static void main(String[] args) {
        Faktorial25 faktorial = new Faktorial25();
        int n = 10; // Ganti dengan nilai yang ingin Anda hitung faktorialnya

        int hasilBF = faktorial.faktorialBF(n);
        System.out.println("Hasil Faktorial BF: " + hasilBF);

        int hasilDC = faktorial.faktorialDC(n);
        System.out.println("Hasil Faktorial DC: " + hasilDC);
    }
}
