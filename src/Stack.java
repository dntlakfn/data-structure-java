public class Stack<T> {
    class Node<T> {
        T data;
        Node<T> prev;

        Node(T data) {
            this.data = data;
            this.prev = null;
        }
    }

    private Node<T> top = null;

    public void push(T data) {
        Node<T> node = new Node<T>(data);
        node.prev = top;
        top = node;
    }

    public Node<T> pop() {
        if (top == null) {
            System.out.println("비었음");
            return null;
        }
        Node<T> popNode = top;
        top = top.prev;
        return popNode;
    }
}
