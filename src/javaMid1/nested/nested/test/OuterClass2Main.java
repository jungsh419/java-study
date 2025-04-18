package javaMid1.nested.nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {

        OuterClass2 out = new OuterClass2();
        OuterClass2.InnerClass in = out.new InnerClass();
        in.hello();
    }
}
