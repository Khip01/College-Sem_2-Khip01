import java.util.Scanner;

public class GraphMain02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Graph02 gedung = new Graph02(6);
        try {
            gedung.addEdgeDirected(0, 1, 50);
            gedung.addEdgeDirected(0, 2, 100);
            gedung.addEdgeDirected(1, 3, 70);
            gedung.addEdgeDirected(2, 3, 40);
            gedung.addEdgeDirected(3, 4, 60);
            gedung.addEdgeDirected(4, 5, 80);
            gedung.degreeDirected(0);
            gedung.printGraph();
            gedung.removeEdgeDirected(1, 3);
            gedung.printGraph();

            // Adjency
            while (true) {
                System.out.print("\nMasukkan gedung asal: ");
                int asal = input.nextInt();
                System.out.print("Masukkan gedung tujuan: ");
                int tujuan = input.nextInt();
                input.nextLine();
                String conclusion = "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + (gedung.checkIsAdjacency(asal, tujuan) ? "" : " tidak") + " bertetangga";
                System.out.println(conclusion);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
