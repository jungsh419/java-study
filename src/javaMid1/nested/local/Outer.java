package javaMid1.nested.local;

public class Outer {
    public void process()
    {
        int localValue = 0;


        class Local{
            Local local  = new Local();

        }
    }
}
