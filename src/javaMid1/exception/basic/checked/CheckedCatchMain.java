package javaMid1.exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) //throws MyCheckedException
    {

        Service service = new Service();
        service.callCatch(); // 여기서 client.call()의 예외를 잡아서 정상 흐름이 된다.
        System.out.println("정상 종료");
        //service.callThrow();
    }
}
