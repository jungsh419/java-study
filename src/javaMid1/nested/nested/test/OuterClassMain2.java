package javaMid1.nested.nested.test;

public class OuterClassMain2 {
    public static void main(String[] args) {

        OuterClass2 out2 = new OuterClass2();
        OuterClass2.InnerClass in = out2.new InnerClass();
        in.hello();

    }
}
