import java.util.Scanner;

public class DataMahasiswaMain {
    
    public static void main(String[] args) {
        // init
        String nama, nim;         // temp var untuk nama dan nim
        char jenisKelamin;        // temp var untuk jenis kelamin
        float ipk;                // temp var untuk ipk
        int jumlahDataMhs;        // jumlah mahasiswa yg ingin diinput
        DataMahasiswa[] dataMhs;  // objek array data mahasiswa
        float[] ipkMhs;           // menyimpan ipk ipk mahasiswa (hanya ipk)
        int highestIpkIndex;      // menyimpan index mahasiswa dengan ipk tertinggi

        Scanner input = new Scanner(System.in);


        // Input 
        System.out.print("\nMasukkan jumlah Mahasiswa yang ingin diinput\n=> ");
        jumlahDataMhs = input.nextInt();

        input.nextLine(); // ! prevent Scanner bug
        System.out.println();

        // Deklarasi Objek Array 
        dataMhs = new DataMahasiswa[jumlahDataMhs];
        ipkMhs = new float[jumlahDataMhs];

        // Input data mahasiswa
        for (int i = 0; i < dataMhs.length; i++) {
            System.out.printf("Masukkan data mahasiswa ke- %d\n", i+1);
            System.out.printf("Masukkan nama : ");
            nama = input.nextLine();
            System.out.printf("Masukkan nim : ");
            nim = input.nextLine();
            System.out.printf("Masukkan jenis kelamin : ");
            jenisKelamin = input.next().charAt(0);
            System.out.printf("Masukkan IPK : ");
            ipk = input.nextFloat();
            
            input.nextLine(); // ! prevent Scanner bug
            System.out.println();
            
            // Menyimpan data ke Object di index ke i
            dataMhs[i] = new DataMahasiswa(nama, nim, jenisKelamin, ipk);
            // Hanya menyimpan IPK ke arr ipk mahasiswa
            ipkMhs[i] = ipk; 
        }

        
        // Output data mahasiswa
        for (int i = 0; i < dataMhs.length; i++) {
            System.out.printf("\nData Mahasiswa ke-%d\n", i+1);
            System.out.printf("nama : %s\n", dataMhs[i].nama);
            System.out.printf("nim : %s\n", dataMhs[i].nim);
            System.out.printf("Jenis kelamin: %s\n", dataMhs[i].jenisKelamin);
            System.out.printf("Nilai IPK: %.1f\n", dataMhs[i].ipk);
        }



        // Output Rata-rata
        DataMahasiswa data = new DataMahasiswa();
        System.out.printf("\nRata-rata IPK mahasiswa: %.2f\n", data.hitungRataIPK(ipkMhs, ipkMhs.length - 1));

        // Output Data Mahasiswa IPK Terbesar 
        highestIpkIndex = data.showIndexIpkTertinggi(ipkMhs); // cari dan simpan index mhs ipk tertinggi

        System.out.println("\nMahasiswa dengan ipk terbesar diraih oleh data:");
        System.out.printf("nama : %s\n", dataMhs[highestIpkIndex].nama);
        System.out.printf("nim : %s\n", dataMhs[highestIpkIndex].nim);
        System.out.printf("Jenis kelamin: %s\n", dataMhs[highestIpkIndex].jenisKelamin);
        System.out.printf("Nilai IPK: %.1f\n", dataMhs[highestIpkIndex].ipk);

        System.out.printf("\n----------- SELAMAT %s! -----------", dataMhs[highestIpkIndex].nama);

    }

}
