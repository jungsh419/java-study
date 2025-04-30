package javaMid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    Map<String, Member> mem = new HashMap<>();
    public void save(Member member)
    {
        mem.put(member.getId(), member);
    }
    public void remove(String id) {
        mem.remove(id);
    }
    public Member findById(String id) {

        if(mem.containsKey(id))
        {
            return mem.get(id);
        }
        return null;
    }
    public Member findByName(String name) {
        for (Member member : mem.values()) {
            if(member.getName().equals(name))
            {
                return member;
            }
        }
        return null;
    }
}
