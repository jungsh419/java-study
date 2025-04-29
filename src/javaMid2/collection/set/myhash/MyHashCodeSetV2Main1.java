package javaMid2.collection.set.myhash;

public class MyHashCodeSetV2Main1 {
    public static void main(String[] args) {

        MyHashSetV2 set = new MyHashSetV2(10);

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");

        System.out.println("set = " + set);

        System.out.println("A.hashCode() = " + "A".hashCode());
        System.out.println("B.hashCode()%10 = " + "B".hashCode()%10);
        System.out.println("AB.hashCode() = " + "AB".hashCode());
        System.out.println("SET.hashCode()%10 = " + "SET".hashCode()%10);

        //검색
        String searchValue = "SET";
        boolean res = set.contains(searchValue);
        System.out.println("res = " +res+" searchValue = "+ searchValue);

    }
}
