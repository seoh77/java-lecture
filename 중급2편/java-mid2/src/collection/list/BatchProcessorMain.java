package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();    // 크기: 100000, 계산 시간: 11912ms
        MyLinkedList<Integer> list = new MyLinkedList<>();  // 크기: 100000, 계산 시간: 4ms

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(100_000);
    }
}
