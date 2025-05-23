package javaMid2.collection.set.member;

import javaMid2.collection.set.myhash.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {

        //중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);

        System.out.println("set = " + set);


        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        boolean res = set.contains(searchValue);
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        System.out.println("res : "+ res + "  searchValue = " + searchValue);



    }
}
