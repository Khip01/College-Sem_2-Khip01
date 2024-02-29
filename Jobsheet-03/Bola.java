public class Bola {
    double r; // Jari-jari

    Bola(double jari) {
        r = jari;
    }

    public double luasPermukaan(){
        // Rumus: 4 x π x r x r
        return 4.0 * 22.0 / 7.0 * r * r;
    }

    public double volume(){
        // Rumus: 4 / 3 x π x r x r x r
        return 4.0 / 3.0 * 22.0 / 7.0 * r * r * r;
    }
    
}
