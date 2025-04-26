package javaMid2.collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

        BatchProcessor processor1 = new BatchProcessor(myArrayList);
        processor1.logic(10000); //O(n)

        BatchProcessor processor2 = new BatchProcessor(myLinkedList);
        processor2.logic(100_000); //O(1)
    }
}
