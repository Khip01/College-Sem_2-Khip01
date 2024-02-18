/**
 * praktikum_pemilihan
 */
public class praktikum_fungsi {
    public static void main(String[] args) {
        // declare
        int[][] recordsDetail = {
            {10, 5 , 15, 7 }, // RoyalGarden 1
            {6 , 11, 9 , 12}, // RoyalGarden 2
            {2 , 10, 10, 5 }, // RoyalGarden 3
            {5 , 7 , 12, 9 }, // RoyalGarden 4
        };
    
        // show stock record
        showRecordDetails(recordsDetail);

        // show income per store / row
        showIncome(recordsDetail);

        // show stock change details for dead plants in RoyalGarden 4 store
        showStockChanges(recordsDetail[3], -1, -2, -0, -5);
    }

    private static void showRecordDetails(int[][] records){
        System.out.println("\nCATATAN STOCK");
        spacer(50);
        System.out.println("\t\tAglonema  Keladi  Alocasia  Mawar");
        for (int n = 0; n < records.length; n++ ) {
            System.out.printf("RoyalGarden%d\t%d\t  %d\t  %d\t    %d\n", n+1, records[n][0], records[n][1], records[n][2], records[n][3]);
        }
        spacer(50);
    }

    private static void showIncome(int[][] records) {
        System.out.println("\n\nPENDAPATAN SETIAP CABANG");
        spacer(25);
        for (int n = 0; n < records.length; n++) {
            System.out.printf("RoyalGarden%d = Rp.%d\n", n+1, calcIncome(records[n][0], records[n][1], records[n][2], records[n][3]));
        }
        spacer(25);
    }

    private static int calcIncome(int stockAglonema, int stockKeladi, int stockAlocasia, int stockMawar) { // calculate income
        int hAglonema = 75000, hKeladi = 50000, hAlocasia = 60000, hMawar = 10000; // constant price
        return (stockAglonema * hAglonema) + (stockKeladi * hKeladi) + (stockAlocasia * hAlocasia) + (stockMawar * hMawar);
    }

    private static void showStockChanges(int[] record, int deadAglonema, int deadKeladi, int deadAlocasia, int deadMawar) {
        System.out.println("\n\nROYAL GARDEN 4 - PERUBAHAN STOK BUNGA");
        spacer(55);
        System.out.println("\t    stock   tumbuhan mati   tumbuhan tersisa");
        System.out.printf("Aglonema    %d\t\t%d\t\t%d\n", record[0], deadAglonema, record[0] + deadAglonema);
        System.out.printf("Keladi      %d\t\t%d\t\t%d\n", record[1], deadKeladi, record[1] + deadKeladi);
        System.out.printf("Alocasia    %d\t\t%d\t\t%d\n", record[2], deadAlocasia, record[2] + deadAlocasia);
        System.out.printf("Mawar       %d\t\t%d\t\t%d\n", record[3], deadMawar, record[3] + deadMawar);
        spacer(55);
    }

    
    private static void spacer(int width) {
        for (int n = 1; n <= width; n++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
