/**
 * Balok
 */
public class Balok {
    public int panjang;
    public int lebar; 
    public int tinggi;
    
    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    // public Balok(int luasAlas, int t){
    //     // do something
    // }

    // public Balok() {
    //     // do something
    // }

    // public Balok(int t, int p, int l) {

    // }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
    
}