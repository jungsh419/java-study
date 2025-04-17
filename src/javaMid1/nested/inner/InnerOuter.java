package javaMid1.nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValuie =2;

    class Inner
    {
        private int innerInstance = 1;
        public void print(){

            System.out.println(innerInstance);

            System.out.println(outInstanceValuie);

            System.out.println(InnerOuter.outClassValue);
        }
    }
}
