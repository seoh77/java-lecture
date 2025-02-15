package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lotto;
    private int count;

    public int[] generate() {
        lotto = new int [6];
        count = 0;

        while (count < 6) {
            // 1부터 45 사이의 숫자 생성
            int num = random.nextInt(45) + 1;

            // 중복되지 않은 경우에만 배열에 추가
            if(isUnique(num)) {
                lotto[count] = num;
                count++;
            }
        }

        return lotto;
    }

    /**
     * 이미 생성된 번호와 중복되는지 검사
     */
    private boolean isUnique(int num) {
        for(int i=0; i<count; i++) {
            if(lotto[i] == num) {
                return false;
            }
        }

        return true;
    }
}
