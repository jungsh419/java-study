package javaMid1.nested.nested.ex2;

import javaMid1.nested.nested.ex1.NetworkMessage;

public class NetworkMain {
    public static void main(String[] args) {

        Network network = new Network();
        String text = "Hello Java@";
        Network.NetworkMessage networkMessage = new Network.NetworkMessage(text);
        network.sendMessage("Hello Java!");
        networkMessage.print();



    }
}
