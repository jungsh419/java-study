package javaAdv1.thread.start;

public class BadThreadMain {
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + ": main() start");

        HelloThread helloThread = new HelloThread();

        System.out.println(thread.getName() + ": start() 호출전");

        helloThread.run();
        //helloThread.start(); // run 직접 실행 직접 실행하게되면 main 스레드에서 메서드를 실행함

        System.out.println(thread.getName() + ": start() 호출후");

        System.out.println(thread.getName() + ": main() end");

    }
}
