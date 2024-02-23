public class Buku02 {
    String judul, pengarang;
    int halaman, stok, harga, terjual, hargaTotal, hargaDiskon, hargaBayar;

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

        System.out.printf("\nHarga Total: %d\nHarga Diskon: %d\nHarga bayar: %d\n\n\n", hargaTotal, hargaDiskon, hargaBayar);
    }

    void terjual(int jml) {
       if (stok > 0) stok -= jml;
       terjual = jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        return harga * terjual;       
    }

    int hitungDiskon() {
        if (hargaTotal > 150000)
            hargaDiskon = (int)(hargaTotal * 0.12);
        else if (75000 > hargaTotal || hargaTotal < 150000)
            hargaDiskon = (int)(hargaTotal * 0.05);
        else 
            hargaDiskon = 0;
        return hargaDiskon;
    }

    int hitungHargaBayar(){
        return hargaTotal - hargaDiskon;
    }
}
