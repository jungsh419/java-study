package javaMid1.lang.wrapper;

public class WrapperTest3 {
    public static void main(String[] args) {

        String str = "100";
        Integer int1 = Integer.parseInt(str);
        System.out.println(int1);
        int a = int1;
        System.out.println(a);
        Integer int2 = a;
        System.out.println(int2);
    }
}
