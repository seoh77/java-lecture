package lang.system;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다.
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));
        
        // 배열을 고속으로 복사한다.
        // 시스템 레벨에서 최적화된 메모리 복사 연산을 사용한다. 직접 반복문을 사용해서 배열을 복사할 때보다 수 배 이상 빠른 성능을 제공한다.
        char[] originalArray = {'h', 'e', 'l', 'l', '0'};
        char[] copiedArrays = new char[5];
        System.arraycopy(originalArray, 0, copiedArrays, 0, originalArray.length);
        
        // 배열 출력
        System.out.println("copiedArrays = " + copiedArrays);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArrays));

        // 프로그램 종료 <- 가급적 사용X
        // 상태코드 0 : 정상 종료 , 0이 아님 : 오류나 예외적인 종료
        System.exit(0);
    }
}
