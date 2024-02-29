import java.lang.Math;

public class Limas {
    // Limas Segi Empat Sama Sisi
    double sisiAlas,        // Panjang Sisi dari bangun datar persegi (alas limas)
           tinggiLimas,     // Tinggi dari bangun ruang Limas
           luasSisiTegak,   // Luas dari bangun datar segitiga (bagian samping Limas)
           tinggiSisiTegak; // Tinggi dari bangun datar segitiga (bagian samping Limas)

    
    public Limas(double panjangSisiAlas, double tinggiLimas) {
        sisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double luasPermukaan(){
        // Mencari Tinggi Sisi Tegak Segitiga pada Limas
        tinggiSisiTegak = Math.sqrt((sisiAlas/2.0) * (sisiAlas/2.0) + (tinggiLimas * tinggiLimas));
        // Mencari Luas dari Segitiga pada Limas
        luasSisiTegak = (sisiAlas * tinggiSisiTegak)/2.0;
        // Rumus: LuasPerm = (s x s) + (4 x luas sisi tegak)
        return (sisiAlas * sisiAlas) + (4 * luasSisiTegak);
    }

    public double volume(){
        // Rumus: V = 1/3 x (s x s) x t
        return 1.0 / 3.0 * sisiAlas * sisiAlas * tinggiLimas;
    }
    
}
