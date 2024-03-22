import java.util.Scanner;

public class HotelMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel[] hotel = new Hotel[10];

        hotel[0] = new Hotel("Grand Tjokro", "Yogyakarta", 1000000, (byte) 5);
        hotel[1] = new Hotel("Hotel Mulia", "Jakarta", 800000, (byte) 4);
        hotel[2] = new Hotel("The Westin Resort", "Bali", 1200000, (byte) 5);
        hotel[3] = new Hotel("Sheraton Surabaya", "Surabaya", 600000, (byte) 3);
        hotel[4] = new Hotel("Hilton Bandung", "Bandung", 900000, (byte) 4);
        hotel[5] = new Hotel("Hotel Aryaduta", "Medan", 700000, (byte) 3);
        hotel[6] = new Hotel("Four Points by Sheraton", "Makassar", 1000000, (byte) 4);
        hotel[7] = new Hotel("Hotel Ciputra", "Semarang", 800000, (byte) 3);
        hotel[8] = new Hotel("Aston Palembang Hotel & Conference Center", "Palembang", 600000, (byte) 2);
        hotel[9] = new Hotel("Mercure Padang", "Padang", 900000, (byte) 4);

        HotelService hotelService = new HotelService();

        hotelService.tambah(hotel);

        System.out.println("Pilih Metode Sorting : ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.print("=> ");
        int metode = input.nextInt();
        switch (metode) {
            case 1:
                System.out.println("\nMENGGUNAKAN BUBBLE SORT\n");
                hotelService.bubbleSort();        
                break;
            case 2:
                System.out.println("\nMENGGUNAKAN SELECTION SORT\n");
                hotelService.selectionSort();
                break;
        }
        
    }

}
