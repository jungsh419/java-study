package javastart.method;

public class MethodEx2 {
    public static void main(String[] args) {

        String message = "Hello, world!";

        messageWrite(3,message);
        System.out.println("*******************");
        messageWrite(5,message);
        System.out.println("*******************");
        messageWrite(7,message);



    }
    public static void messageWrite(int count, String str)
    {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
}
