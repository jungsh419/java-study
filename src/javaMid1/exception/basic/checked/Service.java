package javaMid1.exception.basic.checked;

public class Service {
 Client client = new Client();
 /*
 * 예외를 잡아서 처리하는 코드
 * */
    public void callCatch()
    {
        try{
            client.call();
        }
        //MyCheckedException(자식) -> Exception(부모)
        catch (Exception e)
        {
            System.out.println("예외 처리, message = "+ e.getMessage());
        }
        System.out.println("정상흐름");
    }
    /*
    * 체크 예외를 밖으로 던지는 코드
    * 체크 예외는 예외를 잡지 않고 밖으로 던지면 throws 예외를 메서드에 필수로 선언 해야한다.
    * */

    public void callThrow() throws MyCheckedException
    {
        client.call();

    }

}
