package javaMid1.lang.stringMethod.testString;

public class TestString7 {
    public static void main(String[] args) {

        String original = "    Hello Java   ";
        String front = original.stripLeading();
        String rear = original.stripTrailing();
        String all = original.strip();
        String all2 = original.trim();

        System.out.println("'"+front+"'");
        System.out.println("'"+rear+"'");
        System.out.println("'"+all+"'");
        System.out.println("'"+all2+"'");
    }
}
