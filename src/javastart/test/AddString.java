package test;

public class AddString {
    public static void main(String[] args) {
        String str = "안녕하세요";

        int a = 10;

        System.out.println(str+a); // 자동형변환 되는듯
        System.out.println("안녕하세요 " + str +" int : "+ a);

    }
}
