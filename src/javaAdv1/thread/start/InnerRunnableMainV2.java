package javaAdv1.thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV2 {
    public static void main(String[] args) {

        log("main() start");

        // 익명 클래스
        /*
        / 익명 클래스는 이름 없이 일회성으로 사용하는 클래스로, 주로 인터페이스나 추상 클래스의 메서드를 간단히 구현할 때 사용된다.
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                log("run()");

            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }


}
