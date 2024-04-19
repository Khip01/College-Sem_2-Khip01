public class Gudang02 {
    
    Barang02[] tumpukan;
    int size;
    int top;

    public Gudang02(int kapasitas) {
        this.size = kapasitas;
        tumpukan = new Barang02[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang02 brg){
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang02 ambilBarang() {
        if (!cekKosong()) {
            Barang02 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " berhasil diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah kosong");
            return null;
        }
    }

    public Barang02 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang02 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+ barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang02 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang02 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: "+ barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void cariBarang(String input){
        if (cekKosong()) {
            System.out.println("Barang masih kosong, tidak ada yang bisa dicari");
            return;
        }
        for (int i = 0; i < tumpukan.length; i++) {
            if (tumpukan[i].nama.equals(input) || input.equals(""+(tumpukan[i].kode))) {
                System.out.println("\nBarang ditemukan!\nDeskripsi:");
                System.out.println("Kode: "+tumpukan[i].kode);
                System.out.println("Nama: "+tumpukan[i].nama);
                System.out.println("Kategori: "+tumpukan[i].kategori);
                return;
            }
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }


    public String konversiDesimalKeBiner(int kode) {
        StackKonversi02 stack = new StackKonversi02();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
