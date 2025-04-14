package javaMid1.lang.clazz;

public class ClassCreateMain  {
    public static void main(String[] args) throws Exception{

        Class helloClass = Class.forName("javaMid1.lang.clazz.Hello");
        Hello hello = (Hello)helloClass.getDeclaredConstructor().newInstance();
        String res = hello.hello();
        System.out.println(res);

    }
}
