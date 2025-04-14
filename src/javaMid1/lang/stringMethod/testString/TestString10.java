package javaMid1.lang.stringMethod.testString;

public class TestString10 {
    public static void main(String[] args) {

        String fruits = "apple,banana,mango";
        String[] arr = fruits.split(",");
        String joinedString;
        for(String a : arr)
        {
            System.out.println(a);
        }
        joinedString = String.join("->",arr);
        System.out.println(joinedString);
    }
}
