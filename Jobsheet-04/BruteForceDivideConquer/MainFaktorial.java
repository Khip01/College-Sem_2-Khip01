import java.util.Scanner;

public class MainFaktorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        // Buat Array of Object
        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" +(i+1)+ ":");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai; // jobsheet kurang ini
        }

        // Menampilkan
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil pnghitungan faktorial menggunakan Divide dan Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
    }

}