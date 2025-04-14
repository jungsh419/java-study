package javaMid1.lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {

        // Integer newInteger = new Integer(10);
        Integer newInteger = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double DoubleObj = Double.valueOf(10.5);

        System.out.println("내부 값 읽기");
        int intValue = newInteger.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longObj = " + longValue);

        double doubleValue = DoubleObj.doubleValue();
        System.out.println("DoubleObj = " + doubleValue);

    }
}
