public class ShowroomMain {
    
    public static void main(String[] args) {
        
        

        String[][] arrDaftarMobil = {
            {"BMW",             "M2 Coupe",         "2016", "6816", "728"},
            {"Ford",            "Fiesta ST",        "2014", "3921", "575"},
            {"Nissan",          "370Z",             "2009", "4360", "657"},
            {"Subaru",          "BRZ",              "2014", "4058", "609"},
            {"Subaru",          "Impreza WRX STI",  "2013", "6255", "703"},
            {"Toyota",          "AE86 Trueno",      "1986", "3700", "553"},
            {"Toyota",          "86/GT86",          "2014", "4180", "609"},
            {"Volkswagen",      "Golf GTI",         "2014", "4180", "631"},
        };
        
        Showroom[] arrShowroom = new Showroom[arrDaftarMobil.length]; 

        // Memasukkan daftar array ke Array of Object untuk disimpan
        for(int i = 0; i < arrDaftarMobil.length; i++){
            arrShowroom[i] = new Showroom(arrDaftarMobil[i][0], arrDaftarMobil[i][1], Integer.parseInt(arrDaftarMobil[i][2]), Integer.parseInt(arrDaftarMobil[i][3]), Integer.parseInt(arrDaftarMobil[i][4]));
        }

        // Meenampilkan daftar mobil
        System.out.println("*---------------------------------------------------------------------------------------*");
        System.out.printf("| %-10s    | %-15s    |   %-5s   |   %-16s   |   %-9s   |\n", "merk", "tipe", "tahun", "top_acceleration", "top_power");
        System.out.println("*---------------------------------------------------------------------------------------*");
        for (int i = 0; i < arrShowroom.length; i++) { 
            arrShowroom[i].tampilDataMobil();
        }
        System.out.println("*---------------------------------------------------------------------------------------*");
        

        Showroom showroom = new Showroom();

        System.out.println("\n\na) TOP ACCELERATION TERTINGGI menggunakan Divide and Conquer!");
        System.out.println("*---------------------------------------------------------------------------------------*");
        System.out.printf("| %-10s    | %-15s    |   %-5s   |   %-16s   |   %-9s   |\n", "merk", "tipe", "tahun", "top_acceleration", "top_power");
        System.out.println("*---------------------------------------------------------------------------------------*");
        arrShowroom[showroom.indexDataMobilAcc(arrDaftarMobil, 0, arrDaftarMobil.length - 1, true)].tampilDataMobil();
        System.out.println("*---------------------------------------------------------------------------------------*");

        System.out.println("\nb) TOP ACCELERATION TERENDAH menggunakan Divide and Conquer!");
        System.out.println("*---------------------------------------------------------------------------------------*");
        System.out.printf("| %-10s    | %-15s    |   %-5s   |   %-16s   |   %-9s   |\n", "merk", "tipe", "tahun", "top_acceleration", "top_power");
        System.out.println("*---------------------------------------------------------------------------------------*");
        arrShowroom[showroom.indexDataMobilAcc(arrDaftarMobil, 0, arrDaftarMobil.length - 1, false)].tampilDataMobil();
        System.out.println("*---------------------------------------------------------------------------------------*");
        
        System.out.println("\nc) RATA-RATA TOP POWER dari seluruh mobil menggunakan Brute Force!");
        System.out.printf("Rata-rata: %.3f", showroom.averageTopPower(arrDaftarMobil));
    }

}
