package Tugas;

import java.util.Scanner;

public class PembeliMain {
    static boolean isAutoTampil = false;

    public static void tampilMenu(){
        System.out.println("\n----- PILIH MENU ");
        System.out.println("--- Aksi Queue");
        System.out.println("1. Menambahkan Antrian Pembeli");
        System.out.println("2. Mengeluarkan Antrian Pembeli");
        System.out.println("--- Menampilkan Data");
        System.out.println("3. Mengecek Antrian Paling Depan");
        System.out.println("4. Mengecek Antrian Paling Belakang");
        System.out.println("5. Mencari Antrian Berdasarkan Nama");
        System.out.println("6. Menampilkan Data Seluruh Pembeli");
        System.out.println("\n--- Other");
        System.out.printf("7. *akan %s auto tampil data pembeli setelah menjalankan Aksi Queue\n", isAutoTampil ? "mematikan" : "menyalakan");
        System.out.printf("[%s] Auto Tampil (%s)\n", isAutoTampil ? "v" : " ", isAutoTampil ? "enabled" : "disabled");
        System.out.println("\n99. Keluar dari program\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue q = new Queue(5);
        int pilihan;

        System.out.println("\033[H\033[2J");
        do {
            tampilMenu();
            System.out.print("$> ");
            pilihan = input.nextInt();
            input.nextLine(); // prevent scanner bug
            switch (pilihan) {
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.println("Masukkan data pembeli ");
                    System.out.print("Nama : ");
                    String namaPembeli = input.nextLine();
                    System.out.print("No HP: ");
                    int noHpPembeli = input.nextInt();
                    input.nextLine(); // prevent scanner bug
                    q.enqueue(new Pembeli(namaPembeli, noHpPembeli));
                    
                    if (isAutoTampil) {
                        q.daftarPembeli();
                    }
                    break;
                case 2:
                    System.out.println("\033[H\033[2J");
                    q.dequeue();

                    if (isAutoTampil) {
                        q.daftarPembeli();
                    }
                    break;
                case 3:
                    System.out.println("\033[H\033[2J");
                    q.peek();
                    break;
                case 4:
                    System.out.println("\033[H\033[2J");
                    q.peekRear();
                    break;
                case 5:
                    System.out.println("\033[H\033[2J");
                    System.out.print("Masukkan nama pembeli yang ingin dicari: ");
                    String namaPembeliDicari = input.nextLine();
                    q.peekPosition(namaPembeliDicari);
                    break;
                case 6:
                    System.out.println("\033[H\033[2J");
                    q.daftarPembeli();
                    break;
                case 7:
                    System.out.println("\033[H\033[2J");
                    isAutoTampil = !isAutoTampil;
                    break;
                case 99:
                    System.out.println("\033[H\033[2J");
                    return;
                default:
                    System.out.println("\033[H\033[2J");
                    System.out.println("ERROR: masukkan input sesuai dengan angka di menu\n");
            }
        } while (pilihan != 99);

    }

}
