public class HotelService {
    Hotel[] rooms;

    void tambah(Hotel[] H){
        rooms = H;
    }

    void tampilAll(String berdasarkan){ // berdasarkan = "harga" atau "bintang"
        if (berdasarkan.equals("harga")) {
            System.out.println("*" + "=".repeat(60) + "*");
            System.out.printf("|%-17sDATA HOTEL - SORT BY HARGA%-17s|\n", " ", " ");
        } else {
            System.out.println("*" + "=".repeat(60) + "*");
            System.out.printf("|%-16sDATA HOTEL - SORT BY BINTANG%-16s|\n", " ", " ");
        }
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("*" + "=".repeat(60) + "*");
            System.out.printf("| Nama Hotel\t: %-41s  |\n", rooms[i].nama);
            System.out.printf("| Kota\t\t: %-41s  |\n", rooms[i].kota);
            System.out.printf("| Harga\t\t: %-41d  |\n", rooms[i].harga);
            System.out.printf("| Bintang\t: %-5s (%-1d) %-26s  |\n", showStar(5, rooms[i].bintang), rooms[i].bintang, " ");
        }
        System.out.println("*" + "=".repeat(60) + "*");
    }

    void bubbleSort(){
        // Bubble Sorting Harga
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].harga < rooms[j-1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
        tampilAll("harga");
        // Buble Sorting Rating Bintang
        for (int i = 0; i < rooms.length-1; i++) {
            for (int j = 1; j < rooms.length-i; j++) {
                if (rooms[j].bintang > rooms[j-1].bintang) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
        tampilAll("bintang");
    }
    
    void selectionSort(){
        // Selection Sorting Harga
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMin].harga) {
                    idxMin = j;
                }
            }
            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
        tampilAll("harga");
        // Selection Sorting Rating Bintang
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
        tampilAll("bintang");
    }
    
    // i = jumlah bintang maksimal (disini adalah 5)
    // starTotal = jumlah bintang yang ingin ditampilkan
    String showStar(int i, int starTotal){ 
        if (i == 1) {
            return (i > (5 - starTotal)) ? "* " : "_ ";
        } else {
            if (i > (5 - starTotal)) {
                return "* " + showStar(i - 1, starTotal);
            } else {
                return "_ " + showStar(i - 1, starTotal);
            }
        }
    }
}
