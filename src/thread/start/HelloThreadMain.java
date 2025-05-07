package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": main() start");

        HelloThread helloThread = new HelloThread();

        System.out.println(thread.getName() + ": start() 호출전");

        //helloThread.run(); run 말고 start 호출
        helloThread.start();

        System.out.println(thread.getName() + ": start() 호출후");

        System.out.println(thread.getName() + ": main() end");

    }
}
