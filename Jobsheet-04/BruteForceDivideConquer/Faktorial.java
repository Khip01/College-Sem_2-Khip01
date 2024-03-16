public class Faktorial {
    
    int nilai;

    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            // fakto = fakto * 1; // jobsheet salah disini
            fakto = fakto * i; // pembetulan jobsheet

        }
        return fakto;
    }

    // Faktorial BF dengan While Loop
    int faktorialBFWhile(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }

    // Faktorial BF dengan Do While Loop
    int faktorialBFDoWhile(int n) {
        int fakto = 1;
        int i = 1;
        do {
            fakto = fakto * i;
            i++;
        } while (i <= n);
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
