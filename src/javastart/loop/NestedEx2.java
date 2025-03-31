package javastart.loop;

public class NestedEx2 {

    public static void main(String[] args) {
        int raw=3;
        for(int i = 1; i<=raw; i++)
        {
            for(int j = 1; j <= i ;j++)
            {
                System.out.printf("*");

            }
            System.out.println();
        }

    }
}
