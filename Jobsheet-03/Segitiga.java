public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas(){
        return (alas * tinggi)/2;
    }

    public double hitungKeliling(){
        double sisiMiring = ((alas*alas) + (tinggi*tinggi));
        return alas + tinggi + Math.sqrt(sisiMiring);
    }
}
