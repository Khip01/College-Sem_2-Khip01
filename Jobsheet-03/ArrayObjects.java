import java.util.Scanner;
/**
 * ArrayObjects
 */
public class ArrayObjects {

    public static void main(String[] args) {

        PersegiPanjang[] ppArray;
        int panjangArr;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang array: ");
        panjangArr = sc.nextInt();

        ppArray = new PersegiPanjang[panjangArr];

        // ppArray[0] = new PersegiPanjang();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;
        
        // ppArray[1] = new PersegiPanjang();
        // ppArray[1].panjang = 80;
        // ppArray[1].lebar = 40;
        
        // ppArray[2] = new PersegiPanjang();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-"+i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        // System.out.println("persegi panjang ke-0, panjang: "+ ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        // System.out.println("persegi panjang ke-0, panjang: "+ ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        // System.out.println("persegi panjang ke-0, panjang: "+ ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: "+ ppArray[i].panjang + ", lebar: "+ ppArray[i].lebar);
        }
    }
    
}