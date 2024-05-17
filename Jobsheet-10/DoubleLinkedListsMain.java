public class DoubleLinkedListsMain {
    
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("=======================================");
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("=======================================");
        // try {
        //     dll.add(40, 1);
        // }
        // catch (Exception err) {
        //     System.out.println(err);
        // }
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("=======================================");
        // dll.clear();
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("=======================================");

        // try {
        //     dll.addLast(50);
        //     dll.addLast(40);
        //     dll.addLast(10);
        //     dll.addLast(20);
        //     dll.print();
        //     System.out.println("Size : "+dll.size());
        //     System.out.println("=======================================");
        //     dll.removeFirst();
        //     dll.print();
        //     System.out.println("Size : "+ dll.size());
        //     System.out.println("=======================================");
        //     dll.removeLast();
        //     dll.print();
        //     System.out.println("Size : "+dll.size());
        //     System.out.println("---------------------------------------");
        //     dll.remove(1);
        //     dll.print();
        //     System.out.println("Size : "+dll.size());
        // } catch (Exception e) {
        //     System.out.println("Kesalahan : "+e.getMessage());
        // }
        
        try {
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("=======================================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size: "+dll.size());
            System.out.println("=======================================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size: " + dll.size());
            System.out.println("=======================================");
            System.out.println("Data awal pada Linked Lists adalah: " + dll.getFirst());
            System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
            System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
        } catch (Exception e) {
            System.out.println("Kesalahan : "+e.getMessage());
        }
    }

}
