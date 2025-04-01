package collection.list;

public class BatchProcessor {

    // BatchProcessor가 구체적인 MyArrayList 클래스에 의존
    // private final MyArrayList list = new MyArrayList();

    // BatchProcessor가 구체적인 클래스에 의존하는 대신 추상적인 MyList 인터페이스에 의존
    // => BatchProcessor를 생성하는 시점에 생성자를 통해 원하는 리스트 전략(알고리즘)을 선택해서 전달하면 됨 (생성자 의존관계 주입)
    private final MyList<Integer> list;

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for(int i=0; i<size; i++) {
            list.add(0, i);     // list 앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기: " + size + ", 계산 시간: " + (endTime - startTime) + "ms");
    }
}
