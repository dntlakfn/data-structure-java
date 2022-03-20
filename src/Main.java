import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
//        HashMap hashmap = new HashMap();
//
//        hashmap.put('k', 154);
//
//        HashSet hash = new HashSet();
//        System.out.println(hash.hashCode());

//        MessageDigest md = MessageDigest.getInstance("SHA-256");
//        md.update("k".getBytes(StandardCharsets.UTF_8));
//        StringBuilder builder = new StringBuilder();
//        for (byte b : md.digest()) {
//            builder.append(String.format("%02x", b));
//        }
//        System.out.println(builder.toString());
//        int a = (int) hashmap.get('k');
//        System.out.println(a);
//        Stack<Integer> stack = new Stack();
//        Queue<String> queue = new Queue();
//        LinkedList<Integer> linkedList = new LinkedList(12);
//        for (int i = 1; i < 11; i++) {
//            linkedList.add(i);
//        }
//        linkedList.print();
//        linkedList.delete(5);
//        linkedList.print();
//        linkedList.insert(4, 5);
//        linkedList.print();

//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//
//        binarySearchTree.insert1(10);
//        binarySearchTree.insert1(7);
//        binarySearchTree.insert1(6);
//        binarySearchTree.insert1(8);
//        binarySearchTree.insert1(15);
//        binarySearchTree.insert1(13);
//        binarySearchTree.insert1(18);
//        binarySearchTree.insert1(11);
//        binarySearchTree.insert1(14);
//        binarySearchTree.insert1(16);
//        binarySearchTree.insert1(19);
//        binarySearchTree.insert1(17);
//
//        binarySearchTree.search(18);
//        binarySearchTree.insert2(9);
//        binarySearchTree.search(9);
//        binarySearchTree.delete(15);
//        binarySearchTree.search(15);
//        binarySearchTree.search(16);
        Heap heap = new Heap(15);
        heap.insert(10);
        heap.insert(8);
        heap.insert(5);
        heap.insert(4);
        heap.insert(20);

        heap.print();
        System.out.println(heap.pop());
        heap.print();
        System.out.println(heap.pop());
        heap.print();
        System.out.println(heap.pop());
        heap.print();
        System.out.println(heap.pop());
        heap.print();

    }
}
