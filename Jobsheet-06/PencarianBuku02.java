public class PencarianBuku02 {
    Buku02 listBk[] = new Buku02[5];
    int idx;

    void tambah(Buku02 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku02 m : listBk) {
            m.tampilDataBuku();
        }
    }

    int FindSeqSearch(int cari) {
        int posisi = -1; // Berbeda, di jobsheet bilang 2
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j; // Berbeda, di jobsheet bilang j = posisi
                break;
            }
        }
        return posisi;
    }

    void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
            
        }
    }
}