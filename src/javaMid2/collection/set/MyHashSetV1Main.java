package javaMid2.collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {

        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println("set = " + set);

        //검색
        int serchValue = 9;
        boolean res = set.contains(serchValue);
        System.out.println("set.contains("+serchValue+ ") = "+ res);

        //삭제
        int removeValue = 9;
        boolean res2 = set.remove(removeValue);
        System.out.println("set.remove("+removeValue+ ") = "+ res2);

        System.out.println("set = " + set);
    }
}
