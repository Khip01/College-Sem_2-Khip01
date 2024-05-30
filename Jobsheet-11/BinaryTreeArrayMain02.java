public class BinaryTreeArrayMain02 {
    
    public static void main(String[] args) {
        BinaryTreeArray02 bta = new BinaryTreeArray02();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }

}
