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

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x );
            System.out.println("Judul\t\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    Buku02 FindBuku(int kodeBuku){
        int iterationIndex = 0;
        do {
            if (iterationIndex == listBk.length) return null;
            if (listBk[iterationIndex].kodeBuku == kodeBuku) return listBk[iterationIndex];
            iterationIndex++;
        } while (true);
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}