package javaMid2.collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {

        MyArrayListV3 list = new MyArrayListV3();
        // 숫자만 입력하기를 기대
        list.add(1);
        list.add(2);
        list.add("문자 3");
        System.out.println(list );

        Integer num1 = (Integer) list.get(0);
        Integer num2 = (Integer) list.get(1);

        // ClassCaseException 발생, 문자를 Integer로 캐스팅
        Integer num3 = (Integer) list.get(2);


    }
}
