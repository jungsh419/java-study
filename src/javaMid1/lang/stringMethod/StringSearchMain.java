package javaMid1.lang.stringMethod;

public class StringSearchMain {
    public static void main(String[] args) {

        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 'JAVA'가 포함되어 있는지 : " +
                str.contains("Java"));
        System.out.println("'Java'의 첫 번째 인덱스 : "+ str.indexOf("Java"));
        System.out.println("인데스 10부터 'Java'의 인덱스 : "+ str.indexOf("Java",10));
        System.out.println("'Java'의 마지막 인덱스 : "+ str.lastIndexOf("Java"));
    }
}
