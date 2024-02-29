public class SegitigaMain {

    public static void main(String[] args) {
    
        Segitiga[] sg = new Segitiga[4];

        sg[0] = new Segitiga(10, 4);
        sg[1] = new Segitiga(20, 10);
        sg[2] = new Segitiga(15, 6);
        sg[3] = new Segitiga(25, 10);


        for (int i = 0; i < sg.length; i++) {
            System.out.printf("Segitiga %d, Luas: %2f, Keliling: %2f\n", i+1, sg[i].hitungLuas(), sg[i].hitungKeliling());
        }

    }

}
