package javabasic.PackTest;
import javabasic.Pack.User;


public class UserMain {

    public static void main(String[] args) {

        User user = new User("정성훈",10);
        javabasic.pack2.User user2 = new javabasic.pack2.User("이예진", 20);
        user.UserInfo();
        user2.UserInfo();

    }

}
