import java.util.Scanner;

public class GraphMain02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Graph02 gedung = new Graph02(6);
        // try {
        //     gedung.addEdgeDirected(0, 1, 50);
        //     gedung.addEdgeDirected(0, 2, 100);
        //     gedung.addEdgeDirected(1, 3, 70);
        //     gedung.addEdgeDirected(2, 3, 40);
        //     gedung.addEdgeDirected(3, 4, 60);
        //     gedung.addEdgeDirected(4, 5, 80);
        //     gedung.degreeDirected(0);
        //     gedung.printGraph();
        //     gedung.removeEdgeDirected(1, 3);
        //     gedung.printGraph();

        //     // Adjency
        //     while (true) {
        //         System.out.print("\nMasukkan gedung asal: ");
        //         int asal = input.nextInt();
        //         System.out.print("Masukkan gedung tujuan: ");
        //         int tujuan = input.nextInt();
        //         input.nextLine();
        //         String conclusion = "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + (gedung.checkIsAdjacency(asal, tujuan) ? "" : " tidak") + " bertetangga";
        //         System.out.println(conclusion);
        //     }
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        GraphMatriks02 gdg = new GraphMatriks02(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        System.out.print("\nMasukkan INDEX VERTEX yang ingin dicari InDegree dan OutDegreenya: ");
        int index = input.nextInt();
        gdg.countDegreeInOut(index);
    }

}
