package javaMid2.collection.set.myhash;

public class MyHashSetV3Main {
    public static void main(String[] args) {

        MySet<String> set = new MyHashSetV3<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("set = " + set);

        // 검색
        String searchValue = "A";
        boolean res = set.contains(searchValue);
        System.out.println("searchValue (" + searchValue+") ="+ res);
    }
}
