package collection.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] targetArr) {
        this.targetArr = targetArr;
    }

    /**
     * 다음 요소가 있는지 확인한다. 다음 요소가 없으면 `false` 를 반환한다.
     */
    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }

    /**
     * 다음 요소를 반환한다. 내부에 있는 위치를 다음으로 이동한다.
     */
    @Override
    public Integer next() {
        return targetArr[++currentIndex];
    }
}
