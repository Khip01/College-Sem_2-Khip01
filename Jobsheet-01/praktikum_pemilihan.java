import java.util.Scanner;

/**
 * praktikum_pemilihan
 */
public class praktikum_pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // declare
        boolean isValid;
        double bobotNTugas = 0.2, bobotNKuis = 0.2, bobotNUTS = 0.3, bobotNUAS = 0.3, nilaiAkhir;
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        String nilaiHuruf;
        
        System.out.println("\nPROGRAM MENGHITUNG NILAI AKHIR\n");
        
        // input user
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = input.nextInt();

        // validasi
        isValid = (0 <= nilaiTugas && nilaiTugas <= 100 && 0 <= nilaiKuis && nilaiKuis <= 100 && 0 <= nilaiUTS && nilaiUTS <= 100 && 0 <= nilaiUAS && nilaiUAS <= 100); 

        if (!isValid) {
            // Output
            System.out.println("\n\nnilai tidak valid\n\n");
        } else {
            // proses menghitung nilai akhir
            nilaiAkhir = (nilaiTugas * bobotNTugas) + (nilaiKuis * bobotNKuis) + (nilaiUTS * bobotNUTS) + (nilaiUAS * bobotNUAS);
            // konversi nilai akhir -> nilai huruf 
            nilaiHuruf =  (nilaiAkhir > 80 && nilaiAkhir <= 100) ? "A" 
                        : (nilaiAkhir > 73) ? "B+" 
                        : (nilaiAkhir > 65) ? "B" 
                        : (nilaiAkhir > 60) ? "C+"
                        : (nilaiAkhir > 50) ? "C"
                        : (nilaiAkhir > 39) ? "D"
                        : "E";

            // Output
            System.out.println("\n\nNilai Akhir = "+nilaiAkhir);
            System.out.println("Nilai Huruf = "+nilaiHuruf+"\n\nSELAMAT ANDA LULUS");
        }

    }
    
}