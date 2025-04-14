package javaMid1.lang.stringMethod.testString;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.charAt(0));
        String a = sb.reverse().toString();
        System.out.println(a);
    }
}
