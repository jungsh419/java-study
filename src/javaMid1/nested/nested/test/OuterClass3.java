package javaMid1.nested.nested.test;

public class OuterClass3 {
    public void myMethod()
    {

        class LocalClass
        {
            public void hello()
            {
                System.out.println("Hello");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();

    }
}
