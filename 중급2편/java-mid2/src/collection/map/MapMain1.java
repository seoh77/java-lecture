package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        // 특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("keySet 활용");
        Set<String> keySet = studentMap.keySet();   // Map의 키는 중복을 허용하지 않아 모든 키 목록을 조회하는 `keySet()`을 호출하면 Set 자료구조를 반환
        for(String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();    // entry는 Map 내부에서 키와 값을 함께 묶어서 저장할 때 사용
        for(Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();   // 단순히 값의 모음이라는 의미의 상위 인터페이스인 Collection으로 반환
        for(Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}
