import java.util.Scanner;
public class BukuMain02 {
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku02 data = new PencarianBuku02();
        int jumBuku = 5;

        // // Buku Dummy Data Sorted
        // Buku02 m1 = new Buku02("B001", "Pemrograman Java", 2019, "Dahlan", 10);
        // data.tambah(m1);
        // Buku02 m2 = new Buku02("B002", "Pemrograman Python", 2019, "Dahlan", 10);
        // data.tambah(m2);
        // Buku02 m3 = new Buku02("B003", "Pemrograman C++", 2019, "Dahlan", 10);
        // data.tambah(m3);
        // Buku02 m4 = new Buku02("B004", "Pemrograman PHP", 2019, "Dahlan", 10);
        // data.tambah(m4);
        // Buku02 m5 = new Buku02("B005", "Pemrograman Javascript", 2019, "Dahlan", 10);
        // data.tambah(m5);

        // Buku Dummy Data Random
        // Buku02 m2 = new Buku02("B002", "Pemrograman Python", 2019, "Dahlan", 10);
        // data.tambah(m2);
        // Buku02 m5 = new Buku02("B005", "Pemrograman Javascript", 2019, "Dahlan", 10);
        // data.tambah(m5);
        // Buku02 m3 = new Buku02("B003", "Pemrograman C++", 2019, "Dahlan", 10);
        // data.tambah(m3);
        // Buku02 m4 = new Buku02("B001", "Pemrograman PHP", 2019, "Dahlan", 10);
        // data.tambah(m4);
        // Buku02 m6 = new Buku02("B004", "Pemrograman PHP", 2019, "Dahlan", 10);
        // data.tambah(m6);
        // Buku02 m1 = new Buku02("B001", "Pemrograman Java", 2019, "Dahlan", 10);
        // data.tambah(m1);
        

        System.out.println("------------------------------------------------------------");
        System.out.println("Masukkan Data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s1.nextLine();
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

        // Sort terlebih dahulu secara Asc
        data.doSortKodeBuku();

        System.out.println("------------------------------------------------------------");
        System.out.println("Data keseluruhan Buku (Setelah Sort Kode Buku) : ");
        data.tampil();

        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearchStr(cari);
        data.TampilposisiStr(cari, posisi);
        data.TampilDataStr(cari, posisi);

        // System.out.println("------------------------------------------------------------");
        // System.out.println("------------------------------------------------------------");
        // System.out.println("Modified Code - Sequential Search by Me");
        // System.out.println("Searched Kode Buku: "+cari);
        // try {
        //     Buku02 dataBuku = data.FindBukuStr(cari);
        //     dataBuku.tampilDataBuku();
        // } catch (Exception e) {
        //     System.out.printf("Data %d tidak ditemukan\n", cari);
        // }
        
        
        System.out.println("============================================================");
        System.out.println("menggunakan binary Search");
        posisi = data.FindBinarySearchStr(cari, 0, jumBuku - 1);
        data.TampilposisiStr(cari, posisi);
        data.TampilDataStr(cari, posisi);



        // --- Mencari Judul Buku --- //
        data.doSortJudulBuku();
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Data keseluruhan Buku (Setelah Sort Judul Buku) : ");
        data.tampil();
        
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Judul Buku yang dicari: ");
        System.out.print("Judul Buku : ");
        cari = s1.nextLine();
        System.out.println("Menggunakan Sequential Search");
        posisi = data.FindSeqSearchStrJudul(cari);
        data.TampilposisiStr(cari, posisi);
        data.TampilDataStr(cari, posisi);
        
        System.out.println("============================================================");
        System.out.println("menggunakan binary Search");
        posisi = data.FindBinarySearchStrJudul(cari, 0, jumBuku - 1);
        data.TampilposisiStr(cari, posisi);
        data.TampilDataStr(cari, posisi);
        
        // Menampilkan Warning
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");
        System.out.println("(Warning)");
        System.out.println("============================================================");
        System.out.println("Menggunakan Sequential Search");
        posisi = data.FindSeqSearchStrJudulWithWarning(cari);
        try {
            if (posisi == -2) {
                throw new Exception("[WARNING] Data Lebih dari Satu! (terdapat duplikasi judul)");
            }
            data.TampilposisiStr(cari, posisi);
            data.TampilDataStr(cari, posisi);
        }
        catch (Exception err) {
            System.out.println("LOG:\n  " + err + "\nENDLOG");
        }
        
        System.out.println("============================================================");
        System.out.println("menggunakan binary Search");
        posisi = data.FindBinarySearchStrJudulWithWarning(cari, 0, jumBuku - 1);
        try {
            if (posisi == -2) {
                throw new Exception("[WARNING] Data Lebih dari Satu! (terdapat duplikasi judul)");
            }
            data.TampilposisiStr(cari, posisi);
            data.TampilDataStr(cari, posisi);
        }
        catch (Exception err) {
            System.out.println("LOG:\n  " + err + "\nENDLOG");
        }
    }


}
