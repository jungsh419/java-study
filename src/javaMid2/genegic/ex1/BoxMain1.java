package javaMid2.genegic.ex1;
/*
 * BoxMain2에 비해 코드 재사용이 안좋아지지만 타입 안정성이 좋음
 * */
public class BoxMain1 {
    public static void main(String[] args) {

        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10); //오토박싱
        Integer integer = integerBox.getValue();
        System.out.println("integer = "+integer);

        StringBox stringBox = new StringBox();
        stringBox.set("hello java");
        String value = stringBox.get();
        System.out.println("String = "+ value);

    }
}
