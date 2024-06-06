public class Graph02 {
    
    int vertex;
    DoubleLinkedList02 list[];

    public Graph02(int v){
        vertex = v;
        list = new DoubleLinkedList02[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList02();
        }
    }

    public void addEdgeDirected(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }

    public void addEdgeUndirected(int asal, int tujuan, int jarak){
        list[tujuan].addFirst(asal, jarak);
    }

    public void degreeDirected(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size; j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            // outDegree
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
    }

    public void degreeUndirected(int asal) {
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
    }

    public void removeEdgeDirected(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == asal) {
                list[asal].remove(tujuan);
                list[asal].size--;
            }
        }
    }

    public void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}