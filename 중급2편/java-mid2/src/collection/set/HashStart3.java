package collection.set;

import java.util.Arrays;

public class HashStart3 {

    public static void main(String[] args) {
        // 입력: {1, 2, 5, 8, 14, 99}
        Integer[] inputArray = new Integer[100];    // => 낭비되는 메모리 공간이 너무 많다.
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue];   // O(1)
        System.out.println(result);
    }
}
