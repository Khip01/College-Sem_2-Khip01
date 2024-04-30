public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if(size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[rear] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public boolean Enqueue(int dt) {
        if(IsFull()) {
            System.out.println("Queue sudah penuh, program berhenti(Queue Overflow)");
            return false;
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = dt;
            size++;
            return true;
        }
    }

    public int Dequeue() {
        int dt = 0;
        if(IsEmpty()){
            System.out.println("Queue masih kosong, program berhenti (Queue Underflow)");
            return -1;
        } else {
            dt = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front = (front + 1) % max;
                }
            }
        }
        return dt;
    }
}