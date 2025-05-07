package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        HelloRunnable runnable = new HelloRunnable();
        Thread thread = new Thread(runnable); // 생성자에 runnable를 구현한 객체를 전달
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
