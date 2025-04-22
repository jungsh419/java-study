package javaMid2.genegic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.setValue(10);
        Integer value = integerBox.getValue();
        System.out.println("value = " + value);

        GenericBox<String> stringGenericBox = new GenericBox<String>();
        stringGenericBox.setValue("hello");
        String stringGenericBoxValue = stringGenericBox.getValue();
        System.out.println("stringGenericBoxValue = " + stringGenericBoxValue);

        //원하는 모든 타입 사용가능
        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.setValue(30.1234);
        Double value1 = doubleGenericBox.getValue();
        System.out.println("value1 = " + value1);

        //타입 추론 앞에만 타입을 적으면 생성시 타입 추론
        GenericBox<Integer> integerGenericBox = new GenericBox<>();

    }
}
