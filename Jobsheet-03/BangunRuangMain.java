import java.util.Scanner;

public class BangunRuangMain {
    
    public static void main(String[] args) {
        // declare
        double inputUser1, inputUser2;
        int arrLength;
        Scanner input = new Scanner(System.in);

        Limas[] limas;
        Kerucut[] kerucut;
        Bola[] bola;
        
        
        // Meminta Input berapa banyak bangun ruang yang akan dibuat
        System.out.print("\n\nMasukkan berapa banyak bangun ruang yang akan dibuat\n=> ");
        arrLength = input.nextInt();
        limas = new Limas[arrLength];
        kerucut = new Kerucut[arrLength];
        bola = new Bola[arrLength];
        
        System.out.print("\n\n========================================== INPUT");
        
        // Input User Bangun Ruang Kerucut 
        System.out.println("\n\n========= BANGUN RUANG KERUCUT");
        for (int i = 0; i < kerucut.length; i++) {
            System.out.printf("\nBANGUN RUANG KERUCUT KE-%d\n", i+1);
            System.out.print("Masukkan jari-jari alas kerucut: ");
            inputUser1 = input.nextDouble();
            System.out.print("Masukkan sisi miring kerucut   : ");
            inputUser2 = input.nextDouble();
            
            // Menyimpan di Array Object
            kerucut[i] = new Kerucut(inputUser1, inputUser2);
        }
        
        // Input User Bangun Ruang Limas
        System.out.println("\n\n========= BANGUN RUANG LIMAS SEGI EMPAT");
        for (int i = 0; i < limas.length; i++) {
            System.out.printf("\nBANGUN RUANG LIMAS SEGI EMPAT KE-%d\n", i+1);
            System.out.print("Masukkan panjang sisi alas: ");
            inputUser1 = input.nextDouble();
            System.out.print("Masukkan tinggi limas     : ");
            inputUser2 = input.nextDouble();

            // Menyimpan di Array Object
            limas[i] = new Limas(inputUser1, inputUser2);
        }
        
        // Input User Bangun Ruang Bola
        System.out.println("\n\n========= BANGUN RUANG BOLA");
        for (int i = 0; i < limas.length; i++) {
            System.out.printf("\nBANGUN RUANG BOLA KE-%d\n", i+1);
            System.out.print("Masukkan jari-jari bola: ");
            inputUser1 = input.nextDouble();
            
            // Menyimpan di Array Object
            bola[i] = new Bola(inputUser1);
        }
        
        
        System.out.print("\n\n========================================== HASIL");

        // Output Luas Permukaan dan Volume 
        System.out.println("\n\n========= BANGUN RUANG KERUCUT");
        for (int i = 0; i < kerucut.length; i++) {
            System.out.printf("\nHASIL PERHITUNGAN %s ke-%d\n", "Kerucut", i+1);
            System.out.printf("Luas Permukaan %s: %2f\n", "Kerucut", kerucut[i].luasPermukaan());
            System.out.printf("Volume %s        : %2f\n", "Kerucut", kerucut[i].volume());
        }
        System.out.println("\n\n========= BANGUN RUANG LIMAS SEGI EMPAT");
        for (int i = 0; i < limas.length; i++) {
            System.out.printf("\nHASIL PERHITUNGAN %s ke-%d\n", "Limas Segi Empat", i+1);
            System.out.printf("Luas Permukaan %s: %2f\n", "Limas", limas[i].luasPermukaan());
            System.out.printf("Volume %s        : %2f\n", "Limas", limas[i].volume());
        }
        System.out.println("\n\n========= BANGUN RUANG BOLA");
        for (int i = 0; i < limas.length; i++) {
            System.out.printf("\nHASIL PERHITUNGAN %s ke-%d\n", "Bola", i+1);
            System.out.printf("Luas Permukaan %s: %2f\n", "Bola", bola[i].luasPermukaan());
            System.out.printf("Volume %s        : %2f\n", "Bola", bola[i].volume());
        }



    }

}
