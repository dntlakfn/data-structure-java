public class Queue<T> {
    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    Node<T> first = null;
    Node<T> last = null;

    public void push(T data) {
        Node<T> node = new Node(data);

        if (last == null) {
            last = node;
            first = node;
        }
        else{
            last.next = node;
            last = node;
        }
    }
    public Node<T> pop() {
        if (first == null) {
            System.out.println("비었음");
            return null;
        }
        Node<T> popdata = first;
        first = first.next;
        return popdata;
    }

}
