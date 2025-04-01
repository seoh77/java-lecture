package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * 리스트에 데이터를 추가 (데이터를 추가하면 size는 1증가)
     */
    @Override
    public void add(E e) {
        if(size == elementData.length) {
            grow();
        }

        elementData[size] = e;
        size++;
    }

    @Override
    public void add(int index, E e) {
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

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    /**
     * 인덱스에 있는 항목을 조회
     */
    @Override
    @SuppressWarnings("unchecked")  // 경고 없애기
    public E get(int index) {
        return (E) elementData[index];
    }

    /**
     * 인덱스에 있는 항목을 변경
     */
    @Override
    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    /**
     * index 요소 값 삭제
     */
    @Override
    public E remove(int index) {
        E oldValue = get(index);
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
    @Override
    public int indexOf(E o) {
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
