import java.util.Scanner;
public class BukuMain02 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku02 data = new PencarianBuku02();
        int jumBuku = 5;

        System.out.println("------------------------------------------------------------");
        System.out.println("Masukkan Data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------------------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku02 m = new Buku02(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);

        data.TampilData(cari, posisi);

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Modified Code - Sequential Search by Me");
        System.out.println("Searched Kode Buku: "+cari);
        try {
            Buku02 dataBuku = data.FindBuku(cari);
            dataBuku.tampilDataBuku();
        } catch (Exception e) {
            System.out.printf("Data %d tidak ditemukan\n", cari);
        }


        // System.out.println("============================================================");
        // System.out.println("menggunakan binary Search");
        // posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        // data.Tampilposisi(cari, posisi);
        // data.Tam(cari, posisi);
    }


}
