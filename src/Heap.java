import java.util.LinkedList;
import java.util.List;

public class Heap {
    public List<Integer> heapArray = null;

    Heap(int data) {
        this.heapArray = new LinkedList<Integer>();
        this.heapArray.add(0);
        this.heapArray.add(data);
    }

    boolean moveUp(int insertedIndex) {
        if (insertedIndex <= 1) return  false;
        int parentIndex = insertedIndex / 2;
        return this.heapArray.get(insertedIndex) > this.heapArray.get(parentIndex);
    }

    void insert(int data) {
        this.heapArray.add(data);
        int insertedIndex = this.heapArray.size() - 1;
        while (this.moveUp(insertedIndex)) {
            int parentIndex = insertedIndex / 2;
            int temp = this.heapArray.get(insertedIndex);
            this.heapArray.set(insertedIndex, this.heapArray.get(parentIndex));
            this.heapArray.set(parentIndex, temp);
            insertedIndex = parentIndex;
        }
    }

    int pop() {
        if (this.heapArray.size() == 1){
            return 0;
        }
        int returnedData = this.heapArray.get(1);
        this.heapArray.set(1, this.heapArray.get(this.heapArray.size() - 1));
        this.heapArray.remove(this.heapArray.size() - 1);

        int head = 1;
        while (true) {
            int left = head * 2;
            int right = head * 2 + 1;
            if (this.heapArray.size() <= left) {
                break;
            }
            if (this.heapArray.size() <= right) {
                break;
            }
            if (this.heapArray.get(head) > this.heapArray.get(left) && this.heapArray.get(head) > this.heapArray.get(right)){
                break;
            }
            if (this.heapArray.get(left) < this.heapArray.get(right)) {
                int temp = this.heapArray.get(head);
                this.heapArray.set(head, this.heapArray.get(right));
                this.heapArray.set(right, temp);
                head = right;
            }else{
                int temp = this.heapArray.get(head);
                this.heapArray.set(head, this.heapArray.get(left));
                this.heapArray.set(left, temp);
                head = left;
            }
        }
        return returnedData;
    }

    void print() {
        for (int i = 1;i < this.heapArray.size(); i++){
            System.out.printf("%d -> ", this.heapArray.get(i));
        }
        System.out.println();
    }
}
