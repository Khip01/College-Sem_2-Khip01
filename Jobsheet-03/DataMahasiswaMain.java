import java.util.Scanner;

public class DataMahasiswaMain {
    
    public static void main(String[] args) {
        // declare
        String nama, nim;
        char jenisKelamin;
        float ipk;
        int jumlahDataMhs;
        DataMahasiswa[] dataMhs;

        Scanner input = new Scanner(System.in);

        // Input 
        System.out.print("\nMasukkan jumlah Mahasiswa yang ingin diinput\n=> ");
        jumlahDataMhs = input.nextInt();

        input.nextLine(); // ! prevent Scanner bug
        System.out.println();

        // Deklarasi Objek Array 
        dataMhs = new DataMahasiswa[jumlahDataMhs];


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
        }

        
        // Output data mahasiswa
        for (int i = 0; i < dataMhs.length; i++) {
            System.out.printf("\nData Mahasiswa ke-%d\n", i+1);
            System.out.printf("nama : %s\n", dataMhs[i].nama);
            System.out.printf("nim : %s\n", dataMhs[i].nim);
            System.out.printf("Jenis kelamin: %s\n", dataMhs[i].jenisKelamin);
            System.out.printf("Nilai IPK: %.1f\n", dataMhs[i].ipk);
        }
    }

}
