public class BinarySearchTree {
    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            left = null;
            right = null;
            this.data = data;
        }
    }
    Node root;

    void search(int data) {
        if (root == null) {
            System.out.println("없음");
            return;
        }
        Node current = root;

        while (current != null) {
            if (data < current.data) {
                current = current.left;
            } else if (data > current.data) {
                current = current.right;
            } else {
                System.out.println("있음");
                return;
            }
        }
        System.out.println("없음");
    }

    void insert1(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        Node current = root;
        Node parent = root;
        int leftAndRight = -1;
        while (current != null) {
            if (data < current.data) { // 0
                parent = current;
                current = current.left;
                leftAndRight = 0;
            } else if (data > current.data) { // 1
                parent = current;
                current = current.right;
                leftAndRight = 1;
            } else {
                System.out.println("이미있음");
                return;
            }
        }
        if (leftAndRight == 0) parent.left = new Node(data);
        else parent.right = new Node(data);
    }

    void insert2(int data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        Node current = root;
        while (true) {
           if (data < current.data) {
               if (current.left != null) {
                   current = current.left;
               } else {
                   current.left = new Node(data);
                   break;
               }
           } else {
               if (current.right != null) {
                   current = current.right;
               } else {
                   current.right = new Node(data);
                   break;
               }
           }
        }
    }
    void delete(int data) {
        boolean searched = false;
        Node current = root;
        Node parent = root;

        while (current != null) {
            if (current.data == data) {
                searched = true;
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
            } else {
                parent = current;
                current = current.right;
            }
        }
        if (!searched) {
            System.out.println("false");
            return;
        }

        // 삭제할 node 가 leaf node 일때
        if (current.left == null && current.right == null) {
            if (data < parent.data) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

        // 삭제할 node 가 child node 를 하나만 가지고 있을때
        if (current.left != null && current.right == null) {
            if (data < parent.data) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null && current.right != null) {
            if (data < parent.data) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }

        // 삭제할 node 가 child node 를 2개이상 가지고 있을때
        if (current.left != null && current.right != null) {
            Node change = null;
            Node change_parent = null;
            if (data < parent.data) {
                change = current.right;
                change_parent = current.right;
                while (change.left != null) {
                    change_parent = change;
                    change = change.left;
                }
                if (change.right != null) {
                    change_parent.left = change.right;
                } else {
                    change_parent.left = null;
                }
                parent.left = change;
                change.right = current.right;
                change.left = current.left;
            } else {
                change = current.right;
                change_parent = current.right;
                while (change.left != null) {
                    change_parent = change;
                    change = change.left;
                }
                if (change.right != null) {
                    change_parent.left = change.right;
                } else {
                    change_parent.left = null;
                }
                parent.right = change;
                change.left = current.left;
                change.right = current.right;
            }
        }

    }
}
