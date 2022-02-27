public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        Queue<String> queue = new Queue();
        LinkedList<Integer> linkedList = new LinkedList(12);
        for (int i = 1; i < 11; i++) {
            linkedList.add(i);
        }
        linkedList.print();
        linkedList.delete(5);
        linkedList.print();
        linkedList.insert(4, 5);
        linkedList.print();
    }
}
