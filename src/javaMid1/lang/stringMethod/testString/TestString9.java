package javaMid1.lang.stringMethod.testString;

public class TestString9 {
    public static void main(String[] args) {

        String email = "jungsh419@naver.com";
        String[] arr = email.split("@");
        for(String a : arr)
        {
            System.out.println(a);
        }

    }
}
