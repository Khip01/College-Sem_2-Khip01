import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("==================================");
        System.out.print("Masukkan jumlah perusahaan yang akan dihitung : ");
        int jumlahPerusahaan = sc.nextInt();
        Sum[] sm = new Sum[jumlahPerusahaan];

        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("==================================");
            System.out.println("PERUSAHAAN KE - " + (i + 1));
            System.out.print("\nMasukkan jumlah bulan : ");
            int elm = sc.nextInt();
    
            sm[i] = new Sum(elm);
            System.out.println("==================================");
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan untungan bulan ke - " + (j + 1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
    
            System.out.printf("\n============ KEUNTUNGAN PERUSAHAAN KE - %d ===========\n", (i + 1));
            System.out.println("Algoritma Brute Froce");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalBF(sm[i].keuntungan));
            System.out.println("==================================");
            System.out.println("Algoritma Divide and Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = " + sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
            System.out.println("\n");
        }
    }

}
