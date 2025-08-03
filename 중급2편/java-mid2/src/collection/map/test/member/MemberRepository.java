package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public void remove(String id) {
        memberMap.remove(id);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        /*
        for(String id : memberMap.keySet()) {
            Member member = memberMap.get(id);
            if(member.getName().equals(name)) {
                return member;
            }
        }
         */

        /*
        for(Map.Entry<String, Member> entry : memberMap.entrySet()) {
            Member member = entry.getValue();
            if(member.getName().equals(name)) {
                return member;
            }
        }
        */

        for(Member member : memberMap.values()) {
            if(member.getName().equals(name)) {
                return member;
            }
        }

        return null;
    }
}
