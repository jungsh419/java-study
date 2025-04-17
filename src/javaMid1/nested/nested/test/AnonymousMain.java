package javaMid1.nested.nested.test;



public class AnonymousMain{

    public static void main(String[] args) {


        Hello hellow = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        hellow.hello();

    }

}
