package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;  // 리스트를 생성할 때 사용하는 기본 배열의 크기

    private Object[] elementData;   // 다양한 타입의 데이터를 보관하기 위해 `Object` 배열 사용
    private int size = 0;

    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV3(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    /**
     * 리스트에 데이터를 추가 (데이터를 추가하면 size는 1증가)
     */
    public void add(Object e) {
        if(size == elementData.length) {
            grow();
        }

        elementData[size] = e;
        size++;
    }

    public void add(int index, Object e) {
        if(size == elementData.length) {
            grow();
        }

        // 데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    /**
     * 요소의 마지막부터 index까지 오른쪽으로 밀기
     */
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i-1];
        }
    }

    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;

        // 배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    /**
     * 인덱스에 있는 항목을 조회
     */
    public Object get(int index) {
        return elementData[index];
    }

    /**
     * 인덱스에 있는 항목을 변경
     */
    public Object set(int index, Object element) {
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    /**
     * index 요소 값 삭제
     */
    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);

        size--;
        elementData[size] = null;
        return oldValue;
    }

    /**
     * 요소의 index부터 마지막까지 왼쪽으로 밀기
     */
    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    /**
     * 검색
     * 데이터가 없는 경우 -1 반환
     */
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])) {
                return i;
            }
        }

        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size = " + size + ", capacity = " + elementData.length;
    }
}
