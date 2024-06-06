public class GraphMatriks02 {
    int vertex;
    int[][] matriks;

    public GraphMatriks02(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public void countDegreeInOut(int index){
        int inDegree = 0, outDegree = 0;
        // Search InDegree
        for (int i = 0; i < matriks.length; i++) if (matriks[i][index] > 0) inDegree++; 
        // Search OutDegree
        for (int val : matriks[index]) if (val > 0) outDegree++;
        // Output
        System.out.println("InDegree dari Gedung " + (char) ('A' + index) + ": " + inDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + index) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + index) + ": " + (inDegree + outDegree));
    }
}
