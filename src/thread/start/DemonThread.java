package thread.start;

public class DemonThread {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()+": main() start");
        DaemonThrea daemonThrea = new DaemonThrea();
        //daemonThrea.setDaemon(true); // 데몬 스레드 여부
        daemonThrea.start();

        System.out.println(Thread.currentThread().getName()+": main() end");
    }
    static class DaemonThrea extends Thread // 데몬 스레드는 스레드의 종료 여부와 상관없이 자바 프로그램이 종료된다.
    {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+": run()");
            try {
                Thread.sleep(10000); // 10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+": run() end");
        }
    }
}
