package javaMid1.lang.stringMethod;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "   Java Programming ";

        System.out.println("소문자 변환 : "+strWithSpaces.toLowerCase());
        System.out.println("대문자 변환 : "+strWithSpaces.toUpperCase());

        System.out.println("공백 제거 trim : "+ strWithSpaces.trim());
        System.out.println("공백 제거 strip : "+ strWithSpaces.strip());

        System.out.println("앞 공백 제거 strip : "
                + strWithSpaces.stripLeading()+"'");
        System.out.println("뒤 공백 제거 strip : "
                + strWithSpaces.stripTrailing()+"'");




    }
}
