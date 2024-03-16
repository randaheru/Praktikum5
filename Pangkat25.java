public class Pangkat25 {
    int nilai;
    int pangkat;

    // Konstruktor untuk inisialisasi nilai dan pangkat
    public Pangkat25(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    // Metode untuk menghitung pangkat dengan brute force
    public long pangkatBF(int x, int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    // Metode untuk menghitung pangkat dengan Divide and Conquer
    public long pangkatDC(int x, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0) {
            long temp = pangkatDC(x, n / 2);
            return temp * temp;
        } else {
            long temp = pangkatDC(x, (n - 1) / 2);
            return x * temp * temp;
        }
    }
}
