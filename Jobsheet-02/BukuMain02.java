public class BukuMain02 {

    public static void main(String[] args) {
        Buku02 bk1 = new Buku02();
        bk1.judul = "Today Ends Tomorow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku02 bk2 = new Buku02("Self Reward", "Maheera Ayesha", 160, 29, 5900);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku02 buku02 = new Buku02(
            "Beginning Flutter 3.0 with Dart", 
            "Sanjib Sinha", 
            1566,
            100, 
            160000
        );
        buku02.tampilInformasi();
    }

}