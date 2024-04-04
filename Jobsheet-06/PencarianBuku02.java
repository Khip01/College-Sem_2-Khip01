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

    // int FindSeqSearch(int cari) {
    //     int posisi = -1; // Berbeda, di jobsheet bilang 2
    //     for (int j = 0; j < listBk.length; j++) {
    //         if (listBk[j].kodeBuku == cari) {
    //             posisi = j; // Berbeda, di jobsheet bilang j = posisi
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    int FindSeqSearchStr(String cari) {
        // Mengecek apakah input terdapat huruf atau tidak
        int subStrInput = isContainString(cari);
        // Proses Find Sequential Search
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            // Konversi Kode Buku String ke Integer
            int subStrKodeBuku = isContainString(listBk[j].kodeBuku);
            if (subStrKodeBuku == subStrInput) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // void Tampilposisi(int x, int pos) {
    //     if (pos != -1) {
    //         System.out.println("data : " + x + " ditemukan pada indeks " + pos);
    //     } else {
    //         System.out.println("data " + x + " tidak ditemukan");
            
    //     }
    // }

    void TampilposisiStr(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
            
        }
    }

    // public void TampilData(int x, int pos) {
    //     if (pos != -1) {
    //         System.out.println("Kode Buku\t : " + x );
    //         System.out.println("Judul\t\t : " + listBk[pos].judulBuku);
    //         System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
    //         System.out.println("Pengarang\t : " + listBk[pos].pengarang);
    //         System.out.println("Stock\t\t : " + listBk[pos].stock);
    //     } else {
    //         System.out.println("Data " + x + " tidak ditemukan");
    //     }
    // }
    
    public void TampilDataStr(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + listBk[pos].kodeBuku);
            System.out.println("Judul\t\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t\t : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    // Buku02 FindBuku(int kodeBuku){
    //     int iterationIndex = 0;
    //     do {
    //         if (iterationIndex == listBk.length) return null;
    //         if (listBk[iterationIndex].kodeBuku == kodeBuku) return listBk[iterationIndex];
    //         iterationIndex++;
    //     } while (true);
    // }
     
    // Buku02 FindBukuStr(String kodeBuku){
    //     int iterationIndex = 0;
    //     do {
    //         if (iterationIndex == listBk.length) return null;
    //         if (listBk[iterationIndex].kodeBuku.length() == kodeBuku.length()) return listBk[iterationIndex];
    //         iterationIndex++;
    //     } while (true);
    // }

    // public int FindBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = left + (right - left) / 2;
    //         if (cari == listBk[mid].kodeBuku) {
    //             return (mid);
    //         } else if (listBk[mid].kodeBuku < cari) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }
    
    public int FindBinarySearchStr(String cari, int left, int right) {
        // Mengecek apakah input terdapat huruf atau tidak
        int subStrInput = isContainString(cari);
        // Proses Find Binary Search
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            // Konversi Kode Buku String ke Integer
            int subStrKodeBuku = isContainString(listBk[mid].kodeBuku);
            if (subStrInput == subStrKodeBuku) {
                return (mid);
            } else if (subStrKodeBuku > subStrInput) {
                return FindBinarySearchStr(cari, left, mid - 1);
            } else {
                return FindBinarySearchStr(cari, mid + 1, right);
            }
        }
        return -1;
    }


    // HELPER

    private int isContainString(String inputKodeString){
        try {
            return Integer.parseInt(inputKodeString);
        } catch (Exception e) {
            return Integer.parseInt(inputKodeString.substring(1));
        }
    }


    // SORTING BUKU

    public void doSortKodeBuku() {
        for (int i = 0; i < listBk.length; i++) {
            for (int j = i + 1; j < listBk.length; j++) {
                int left = isContainString(listBk[i].kodeBuku);
                int right = isContainString(listBk[j].kodeBuku);
                if (left > right) {
                    Buku02 temp = listBk[i];
                    listBk[i] = listBk[j];
                    listBk[j] = temp;
                }
            }
        }
    }

    public void doSortJudulBuku() {
        for (int i = 0; i < listBk.length - 1; i++) {
            if (listBk[i].judulBuku.length() > listBk[i + 1].judulBuku.length()) {
                Buku02 temp = listBk[i];
                listBk[i] = listBk[i + 1];
                listBk[i + 1] = temp;
            }
        }
    }


    // JUDUL BUKU SEARCHING

    int FindSeqSearchStrJudul(String cari) {
        // Proses Find Sequential Search
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearchStrJudul(String cari, int left, int right) {
        // Proses Find Binary Search
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judulBuku)) {
                return (mid);
            } else if (listBk[mid].kodeBuku.length() > cari.length()) {
                return FindBinarySearchStrJudul(cari, left, mid - 1);
            } else {
                return FindBinarySearchStrJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }


    // DUPLICATE WARNING CONDITION

    int FindSeqSearchStrJudulWithWarning(String cari) {
        // Menghitung Total buku duplikat yang ditemukan
        int bookFoundTotal = 0;
        // Proses Find Sequential Search
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                bookFoundTotal++;
            }
        }
        
        return (bookFoundTotal > 1) ? -2 : posisi;
    }

    public int FindBinarySearchStrJudulWithWarning(String cari, int left, int right) {
        // Menghitung Total buku duplikat yang ditemukan
        int bookFoundTotal = 0;
        // Proses Find Binary Search
        int mid = -1;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judulBuku)) {
                bookFoundTotal++;
            } else if (listBk[mid].kodeBuku.length() > cari.length()) {
                return FindBinarySearchStrJudul(cari, left, mid - 1);
            } else {
                return FindBinarySearchStrJudul(cari, mid + 1, right);
            }
        }
        if(bookFoundTotal == 0){
            return -1;
        } else if (bookFoundTotal > 1) {
            return (mid);
        } else {
            return -2;
        }
    }
}