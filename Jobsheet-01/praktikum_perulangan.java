import java.util.Scanner;

/**
 * praktikum_perulangan
 */
public class praktikum_perulangan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare, init
        String strNIM, strResult = "";
        int n;

        // input user
        do{
            System.out.print("Masukkan NIM : ");
            strNIM = input.nextLine();
            
            // validation message
            System.out.print(
                (strNIM.isEmpty() || strNIM == null || strNIM.length() <= 2) 
                ? "\nMasukkan nim dengan benar!\n\n" : ""
            );
        } while (strNIM.isEmpty() || strNIM == null || strNIM.length() < 2);

        // take 2 numbers from the last (substring)
        n =  Integer.parseInt(strNIM.substring(strNIM.length() - 2));

        // condition that if n < 10
        n += (n < 10) ? 10 : 0;

        // generate loop result 
        for(int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) continue; // cond if i = 6 or 10
            strResult += (i % 2 == 0) ? i+" " : "* ";
        }

        // output 
        System.out.printf("\nn : %d\n%s", n, strResult);
    }

}
