package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int [10];
    private int size = 0;

    /**
     * set에 중복된 값이 있는지 체크하고, 중복된 값이 있으면 false를 반환한다.
     * 중복된 값이 없으면 값을 저장하고 true를 반환한다.
     * O(n)
     */
    public boolean add(int value) {
        if(contains(value)) {
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }

    /**
     * set에 값이 있는지 확인한다. 값이 있으면 true를 반환하고, 값이 없으면 false를 반환한다.
     * O(n)
     */
    public boolean contains(int value) {
        for(int data : elementData) {
            if(data == value) {
                return true;
            }
        }

        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
