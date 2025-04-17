package javaMid1.nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {

        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();
        // 내부 클래스를 호출하는 방법
    }
}
