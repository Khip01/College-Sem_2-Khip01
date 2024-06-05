public class Node02 {
    
    int data;
    Node02 prev, next;
    int jarak;

    Node02(Node02 prev, int data, int jarak, Node02 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }

}