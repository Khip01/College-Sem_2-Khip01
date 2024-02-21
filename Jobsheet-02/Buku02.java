public class Buku02 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku02() {

    }

    public Buku02(String jud, String pg, int hal, int stock, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stock;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Jumlah halaman: "+halaman);
        System.out.println("Sisa Stock: "+stok);
        System.out.println("Harga: Rp."+harga);
    }

    void terjual(int jml) {
       if (stok > 0) stok -= jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}
