public class GraphMain02 {
    
    public static void main(String[] args) {
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
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
