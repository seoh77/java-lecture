package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    // 인스턴스 생성을 막기 위해 private 으로 설정
    private MathArrayUtils() {

    }

    public static int sum(int[] values) {
        int sum = 0;
        for(int value : values) {
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for(int value : values) {
            if(value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for(int value : values) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
}
