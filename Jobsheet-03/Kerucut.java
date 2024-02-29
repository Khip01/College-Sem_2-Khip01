public class Kerucut {
    double jariAlas,      // Jari-jari dari alas kerucut  
           sisiMiring,    // garis pelukis/sisi miring dari kerucut
           tinggiKerucut; // Tinggi bangun ruang kerucut
    
    public Kerucut(double jari, double sisiMiring) {
        jariAlas = jari;
        this.sisiMiring = sisiMiring;
    }

    public double luasPermukaan(){
        // Rumus: π x r (r + s)
        return (22.0 / 7.0 * jariAlas * (jariAlas + sisiMiring));
    }

    public double volume(){
        // Mencari tinggi kerucut
        tinggiKerucut = Math.sqrt((sisiMiring*sisiMiring) - (jariAlas*jariAlas));
        // Rumus: 1/3 x π x r x r x t 
        return 22.0 / 7.0 * jariAlas * jariAlas * tinggiKerucut / 3.0;
    }
    
}
