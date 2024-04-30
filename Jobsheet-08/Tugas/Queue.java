package Tugas;

public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    Queue(int n){
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Pembeli antri){
        System.out.println("\n----- ENQUEUE ANTRIAN PEMBELI");
        if(isFull()){
            System.out.println("#>    Maaf, antrian sudah penuh     <#");
            System.out.println("#>    Coba keluarkan 1 pembeli      <#\n");
            return;
        }

        if(isEmpty()){
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        antrian[rear] = antri;
        size++;

        // Pesan 
        System.out.println("#>    Pembeli berhasil ditambahkan   <#");
        System.out.println("#> Data Pembeli (yang ditambahkan)   <#");
        System.out.println("#> Nama: " + antri.nama);
        System.out.println("#> No HP: " + antri.noHP + "\n");
    }

    public int dequeue(){
        System.out.println("\n----- DEQUEUE ANTRIAN PEMBELI");
        if (isEmpty()) {
            System.out.println("#>    Maaf, antrian masih kosong    <#");
            System.out.println("#> Tidak ada yang harus dikeluarkan <#\n");
            return -1;
        }
        int tempIndexTakenOut = front;
        front = (front + 1) % max;
        size--;

        // Pesan 
        System.out.println("#>    Pembeli berhasil dikeluarkan   <#");
        System.out.println("#> Data Pembeli (yang dikeluarkan)   <#");
        System.out.println("#> Nama: " + antrian[tempIndexTakenOut].nama);
        System.out.println("#> No HP: " + antrian[tempIndexTakenOut].noHP + "\n");
        
        return tempIndexTakenOut;
    }

    public void daftarPembeli() { // method print diganti oleh daftarPembeli
        if(isEmpty()){
            System.out.println("#>    Maaf, antrian masih kosong    <#");
            System.out.println("#> Tidak ada yang harus ditampilkan <#\n");
            return;
        }
        System.out.println("\n----- DATA ANTRIAN PEMBELI");
        // DALAM BENTUK ANTRIAN
        System.out.println("Data Antrian (tampilan sesuai urutan antrian)");
        int indexNama = front;
        while (indexNama != rear) {
            System.out.printf("| %s ", antrian[indexNama].nama);
            indexNama = (indexNama + 1) % max;
        }
        System.out.printf("| %s |\n", antrian[rear].nama);
        
        // DALAM BENTUK ARRAY
        System.out.println("\nData Antrian (tampilan sesuai array)");
        for (int i = 0; i < antrian.length; i++) {
            if (front <= rear) {
                if (i >= front && i <= rear){
                    if (i == max-1) {
                        System.out.printf("| %s |\n", antrian[i].nama);
                    } else {
                        System.out.printf("| %s ", antrian[i].nama);
                    }
                } else {
                    if (i == max-1) {
                        System.out.printf("| %s |\n", " ".repeat(5));
                        continue;
                    } else {
                        System.out.printf("| %s ", " ".repeat(5));
                        continue;
                    } 
                }
            } else {
                if(i > rear && i < front){
                    if (i == max-1) {
                        System.out.printf("| %s |\n", " ".repeat(5));
                        continue;
                    } else {
                        System.out.printf("| %s ", " ".repeat(5));
                        continue;
                    }
                } else {
                    if (i == max-1) {
                        System.out.printf("| %s |\n", antrian[i].nama);
                    } else {
                        System.out.printf("| %s ", antrian[i].nama);
                    }
                }
            }
        }

        // DATA LENGKAP
        System.out.println("\nData Antrian Seluruhnya (tampilan lengkap)");
        int indexPembeli = front;
        while (indexPembeli != rear) {
            System.out.println("Pembeli ke-" + (indexPembeli + 1));
            System.out.printf("Nama  =  %s \n", antrian[indexPembeli].nama);
            System.out.printf("No HP =  %s \n", antrian[indexPembeli].noHP);
            indexPembeli = (indexPembeli + 1) % max;
        }
        System.out.println("Pembeli ke-" + (rear + 1));
        System.out.printf("Nama  =  %s \n", antrian[rear].nama);
        System.out.printf("No HP =  %s \n", antrian[rear].noHP);
    }

    public void peek () {
        System.out.println("\n----- MENGECEK PEMBELI TERDEPAN");
        if(isEmpty()){
            System.out.println("#>    Maaf, antrian masih kosong    <#");
            System.out.println("#> Tidak ada yang harus ditampilkan <#\n");
            return;
        }
        System.out.println("#> Pembeli terdepan adalah: ");
        System.out.printf("Nama  =  %s \n", antrian[front].nama);
        System.out.printf("No HP =  %s \n", antrian[front].noHP);
    }
    
    public void peekRear() {
        System.out.println("\n----- MENGECEK PEMBELI TERBELAKANG");
        if(isEmpty()){
            System.out.println("#>    Maaf, antrian masih kosong    <#");
            System.out.println("#> Tidak ada yang harus ditampilkan <#\n");
            return;
        }
        System.out.println("#> Pembeli paling belakang adalah: ");
        System.out.printf("Nama  =  %s \n", antrian[rear].nama);
        System.out.printf("No HP =  %s \n", antrian[rear].noHP);
    }

    public void peekPosition(String nama){
        System.out.println("\n----- MENGECEK POSISI ANTRIAN PEMBELI");
        if(isEmpty()){
            System.out.println("#>    Maaf, antrian masih kosong    <#");
            System.out.println("#> Tidak ada yang harus ditampilkan <#\n");
            return;
        }
        int indexPembeli = front;
        while (indexPembeli != rear) {
            if (antrian[indexPembeli].nama.equals(nama)) {
                System.out.println("#> Pembeli berada di posisi terdepan <#");
                System.out.printf("#> Posisi antrian ke-%d               <#\n\n", indexPembeli + 1);
                return;
            }
            indexPembeli = (indexPembeli + 1) % max;
        }
        if (antrian[rear].nama.equals(nama)) {
            System.out.println("#> Pembeli berada di posisi terbelakang <#");
            System.out.printf("#> Posisi antrian ke-%d                  <#\n\n", rear + 1);
        }  
    }
}
