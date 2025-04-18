package javaMid1.exception.basic.unchecked;

import javaMid1.exception.basic.checked.MyCheckedException;

/*
* RuntimeException을 상속받은 예외는 언체크 예외가 된다.
* */
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String msg)
    {
        super(msg);
    }
}
