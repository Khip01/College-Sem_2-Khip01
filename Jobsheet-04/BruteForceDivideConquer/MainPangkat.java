import java.util.Scanner;

public class MainPangkat {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int inputUserInt = 0;

        System.out.println("==================================");
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        // for (int i = 0; i < elemen; i++) {
        //     png[i] = new Pangkat();
        //     System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
        //     int nilai = sc.nextInt();
        //     png[i].nilai = nilai;
        //     System.out.println("Masukkan nilai pangkat: ");
        //     int pangkat = sc.nextInt();
        //     png[i].pangkat = pangkat;
        // }

        // Modifikasi Pengisian Atribut menggunakan Konstruktor
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pangkat: ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        sc.nextLine();

        // Pemilihan Menu
        System.out.println("\n==================================");
        System.out.println("--- MENU ---");
        System.out.println("\n1. Brute Force");
        System.out.println("2. Divide and Conquer");
        do {
            System.out.print("\nMasukkan pilihan: ");
            String inputUser = sc.nextLine();
            // Validasi
            try {
                inputUserInt = Integer.parseInt(inputUser);
                if (inputUserInt == 2 || inputUserInt == 1) 
                    break;
                else 
                    throw new Exception();
            }
            catch (Exception e) {
                System.out.println("Input tidak valid!");
                continue;
            }
        } while (true);

        // Pemilihan
        switch (inputUserInt) {
            case 1:
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println
                        ("Hasil dari " 
                        + png[i].nilai + " pangkat " 
                        + png[i].pangkat + " adalah " 
                        + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println
                        ("HASIL dari "
                        + png[i].nilai + " pangkat "
                        + png[i].pangkat + " adalah "
                        + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
        }
    }

}
