package javaMid1.nested.nested.ex1;

public class NetWork {
    public void sendMessage(String text)
    {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}
