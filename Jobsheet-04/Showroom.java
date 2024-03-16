public class Showroom {
    String merk, tipe;
    int tahun, topAccelerate, topPower;
    
    public Showroom(String merk, String tipe, int tahun, int topAccelerate, int topPower){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAccelerate = topAccelerate;
        this.topPower = topPower;
    }

    public Showroom() {

    }

    public void tampilDataMobil(){
        System.out.printf("| %-10s    | %-15s    |   %-5d   |   %-16d   |   %-9d   |\n", merk, tipe, tahun, topAccelerate, topPower);
    }

    // Note:
    // acc = acceleration
    public int indexDataMobilAcc(String[][] arrDaftarMobil, int indexLeft, int indexRight, boolean indexTertinggi) {
        if (indexLeft == indexRight) {
            return indexLeft;
        } else if (indexLeft < indexRight) {
            int indexMid = (indexLeft + indexRight) / 2;
            int biggerIndexLeft = indexDataMobilAcc(arrDaftarMobil, indexLeft, indexMid, indexTertinggi);
            int biggerIndexRight = indexDataMobilAcc(arrDaftarMobil, indexMid + 1, indexRight, indexTertinggi);
            
            // Konversi ke int terlebih dahulu agar bisa dibandingkan
            int accTertinggiLeft = Integer.parseInt(arrDaftarMobil[biggerIndexLeft][3]);
            int accTertinggiRight = Integer.parseInt(arrDaftarMobil[biggerIndexRight][3]);

            // Return index yang memiliki top acceleration tertinggi atau terendah, tergantung dari parameter indexTertinggi
            if (indexTertinggi) {
                return (accTertinggiLeft > accTertinggiRight) ? biggerIndexLeft : biggerIndexRight;
            } else {
                return (accTertinggiLeft < accTertinggiRight) ? biggerIndexLeft : biggerIndexRight;
            }
        } else {
            return 0;
        }
    }

    // Menggunakan Brute Force
    public double averageTopPower(String[][] arrDaftarMobil) {
        double totalTopPower = 0;
        for (int i = 0; i < arrDaftarMobil.length; i++) {
            totalTopPower += Double.parseDouble(arrDaftarMobil[i][4]);
        }
        return totalTopPower / arrDaftarMobil.length;
    }

}
