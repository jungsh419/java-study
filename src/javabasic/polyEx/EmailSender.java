package javabasic.polyEx;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String msg)
    {
        System.out.println("Email에 발송합니다 : " + msg);
    }
}
