package javaMid1.nested.nested.ex2;

import javaMid1.nested.nested.ex1.NetWork;
import javaMid1.nested.nested.ex1.NetworkMessage;

public class Network {
    public void sendMessage(String text)
    {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();

    }
    public static class NetworkMessage
    {
        private String content;

        public NetworkMessage(String text)
        {
            this.content = text;
        }
        public void print()
        {
            System.out.println(this.content);
        }

    }
}
