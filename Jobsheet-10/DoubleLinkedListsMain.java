public class DoubleLinkedListsMain {
    
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        try {
            dll.add(40, 1);
        }
        catch (Exception err) {
            System.out.println(err);
        }
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
        dll.clear();
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================================");
    }

}
