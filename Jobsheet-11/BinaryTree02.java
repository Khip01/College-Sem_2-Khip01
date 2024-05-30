public class BinaryTree02 {
    Node02 root;
    
    public BinaryTree02(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { // tree is empty
            root = new Node02(data);
        } else {
            Node02 current = root;
            while (true) {
                // if (data > current.data) {
                //     if (current.right == null) {
                //         current.right = new Node02(data);
                //         break;
                //     } else {
                //         current = current.right;
                //     }
                // } else if (data < current.data) {
                //     if (current.left == null) {
                //         current.left = new Node02(data);
                //         break;
                //     } else {
                //         current = current.left;
                //     }
                // } else { // data is already exist
                //     break;
                // }
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node02(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node02(data);
                        break;
                    }
                } else { // data is already exist
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node02 current = root;
        while (current != null) {
            if (current.data == data) { 
                result = true;
                break;
            } else if (data > current.data) { 
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node02 node){
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node02 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    void traverseInOrder(Node02 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node02 getSuccessor(Node02 del){
        Node02 successor = del.right;
        Node02 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if (isEmpty()) { 
            System.out.println("tree is empty");
            return;
        }
        // find node (current) that will be deleted
        Node02 parent = root;
        Node02 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        // deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else { // if there is 2 childs
                Node02 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

}
