package javaMid1.lang.stringMethod.testString;

public class TestString5 {
    public static void main(String[] args) {

        String str = "hello.txt";
        String ext = ".txt";
        String a =str.substring(0,str.indexOf(ext));
        String b =str.substring(str.indexOf(ext));
        System.out.println(a);
        System.out.println(b);
    }
}
