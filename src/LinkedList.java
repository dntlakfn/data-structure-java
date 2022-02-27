public class LinkedList<T> {
    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    Node<T> head;

    LinkedList(T data){
        this.head = new Node<T>(data);
    }

    void print() {
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println();
    }

    void add(T data){
        Node<T> node = head;
        while (true) {
            if (node.next == null) {
                node.next = new Node<T>(data);
                break;
            } else {
                node = node.next;
            }
        }
    }

    void delete(T data) {
        Node<T> node = head;
        Node<T> parent = null;
        while (true) {
            if (node.data != data) {
                parent = node;
                node = node.next;
            } else {
                // node가 내가 찾던 녀석
                parent.next = node.next;
                break;
            }
        }
    }

    void insert(T base, T data) {
        Node<T> node = head;
        while (node != null) {
            if (node.data == base) {
                Node temp = node.next;
                node.next = new Node(data);
                node.next.next = temp;
                return;
            } else {
                node = node.next;
            }
        }
        System.out.println("base없음");
    }
}
