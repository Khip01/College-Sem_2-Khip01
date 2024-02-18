import java.util.Scanner;

/**
 * praktikum_pemilihan
 */
public class praktikum_array {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare, init
        String[][] matkulNsks = { // matkul and sks = {matkul, sks}
            {"Pancasila", "2"}, 
            {"Konsep Teknologi Informasi", "2"},
            {"Critical Thinking dan Problem Solving", "2"},
            {"Matematika Dasar", "3"},
            {"Bahasa Inggris", "2"},
            {"Dasar Pemrograman", "2"},
            {"Praktikum Dasar Pemrograman", "3"},
            {"Keselamatan dan Kesehatan Kerja", "2"}
        };
        // nilaiAngkas = [nPanc, nKTI, nCTPS, nMat, nBing, nDaspro, nPrakDaspro, nK3]
        double[] nilaiAngkas = new double[matkulNsks.length];
        // scoreConvRes = [n][MK, Nilai Angka, Nilai Huruf, Bobot Nilai, SKS]
        String[][] scoreConvRes = new String[matkulNsks.length][4]; 

        String tempNilaiHuruf;
        double tempBobotNilai, IP = 0;


        System.out.println("\nPROGRAM MENGHITUNG IP SEMESTER\n");

        // input user
        for (int index = 0; index < matkulNsks.length; index++) {
            System.out.printf("masukkan nilai Angka untuk MK %s: ", matkulNsks[index][0]);
            nilaiAngkas[index] = input.nextDouble();

            // validation
            while ( nilaiAngkas[index] < 0 || 100 < nilaiAngkas[index]){
                System.out.printf("\n[nilai tidak valid]\nmasukkan nilai Angka untuk MK %s: ", matkulNsks[index][0]);
                nilaiAngkas[index] = input.nextDouble();
            };
        }

        // inserting into the array "Score Conversion Result"
        for (int row = 0; row < scoreConvRes.length; row++) {
            
            // decl temporary var Nilai Huruf
            tempNilaiHuruf = (nilaiAngkas[row] > 80 && nilaiAngkas[row] <= 100) ? "A" 
            : (nilaiAngkas[row] > 73) ? "B+" 
            : (nilaiAngkas[row] > 65) ? "B" 
            : (nilaiAngkas[row] > 60) ? "C+"
            : (nilaiAngkas[row] > 50) ? "C"
            : (nilaiAngkas[row] > 39) ? "D"
            : "E";
            // decl temporary var Bobot Nilai
            tempBobotNilai = (nilaiAngkas[row] > 80 && nilaiAngkas[row] <= 100) ? 4 
            : (nilaiAngkas[row] > 73) ? 3.5 
            : (nilaiAngkas[row] > 65) ? 3
            : (nilaiAngkas[row] > 60) ? 2.5
            : (nilaiAngkas[row] > 50) ? 2
            : (nilaiAngkas[row] > 39) ? 1
            : 0;

            // insert Mata Kuliah name
            scoreConvRes[row][0] = matkulNsks[row][0];
            // insert Nilai Angka
            scoreConvRes[row][1] = ""+nilaiAngkas[row];
            // insert Nilai Huruf
            scoreConvRes[row][2] = tempNilaiHuruf;
            // insert Bobot Nilai
            scoreConvRes[row][3] = ""+tempBobotNilai;

            // calculate IP
            IP += (tempBobotNilai * Double.parseDouble(matkulNsks[row][1])) / 18;
        }

        // output
        System.out.println("\n\nHASIL KONVERSI NILAI\n");

        System.out.println("MK\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        System.out.printf("%s\t\t\t\t  %s\t\t     %s\t\t    %s\n", scoreConvRes[0][0], scoreConvRes[0][1], scoreConvRes[0][2], scoreConvRes[0][3]);
        System.out.printf("%s\t\t  %s\t\t     %s\t\t    %s\n", scoreConvRes[1][0], scoreConvRes[1][1], scoreConvRes[1][2], scoreConvRes[1][3]);
        System.out.printf("%s\t  %s\t\t     %s\t\t    %s\n", scoreConvRes[2][0], scoreConvRes[2][1], scoreConvRes[2][2], scoreConvRes[2][3]);
        System.out.printf("%s\t\t\t  %s\t\t     %s\t\t    %s\n", scoreConvRes[3][0], scoreConvRes[3][1], scoreConvRes[3][2], scoreConvRes[3][3]);
        System.out.printf("%s\t\t\t\t  %s\t\t     %s\t\t    %s\n", scoreConvRes[4][0], scoreConvRes[4][1], scoreConvRes[4][2], scoreConvRes[4][3]);
        System.out.printf("%s\t\t\t  %s\t\t     %s\t\t    %s\n", scoreConvRes[5][0], scoreConvRes[5][1], scoreConvRes[5][2], scoreConvRes[5][3]);
        System.out.printf("%s\t\t  %s\t\t     %s\t\t    %s\n", scoreConvRes[6][0], scoreConvRes[6][1], scoreConvRes[6][2], scoreConvRes[6][3]);
        System.out.printf("%s\t\t  %s\t\t     %s\t\t    %s\n", scoreConvRes[7][0], scoreConvRes[7][1], scoreConvRes[7][2], scoreConvRes[7][3]);

        System.out.printf("\nIP : %.2f\n", IP);

    }
}
