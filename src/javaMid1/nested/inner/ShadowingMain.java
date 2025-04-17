package javaMid1.nested.inner;

public class ShadowingMain {
    public int value =1 ;
    class Inner
    {
        public int value = 2;
        void go()
        {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value = "+ this.value);
            System.out.println("ShadowingMain.Value = " + ShadowingMain.this.value);
        }
    }
}
