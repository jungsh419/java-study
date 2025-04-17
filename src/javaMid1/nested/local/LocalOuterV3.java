package javaMid1.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstance =3;
    public Printer process(int param)
    {
        int localVar = 1;
        class LocalPrinter implements Printer
        {
            int value = 0;
            @Override
            public void print() {
                System.out.println("value=" + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar=" + localVar);
                System.out.println("paramVar=" + param);
                System.out.println("outInstanceVar=" + outInstance);
            }
        }
        Printer printer = new LocalPrinter();
        //printer.print()를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return printer;
    }

    public static void main(String[] args) {

        LocalOuterV3 localOuterV3 = new LocalOuterV3();
        Printer printer = localOuterV3.process(2);
        printer.print();

        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for(Field field : fields)
        {
            System.out.println("field = "+ field);
        }

    }
}
