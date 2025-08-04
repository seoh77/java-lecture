package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println("value = " + value);
        }

        // 자바는 Iterable 인터페이스를 구현한 객체에 대해서 향상된 for문을 사용할 수 있게 해준다.
        // -> 모든 데이터를 순회한다면 위의 방법보다 깔끔한 향상된 for문을 사용하는 것이 좋다.
        System.out.println("for-each 사용");
        for(int value : myArray) {
            System.out.println("value = " + value);
        }
    }
}
