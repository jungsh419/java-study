package loop;

public class Tree {

    public static void main(String[] args) {

        int rows =5;
        for(int i=1; i<=rows; i++)
        {
            for(int j = rows; j>=i; j--)
            {
                System.out.printf(" ");
            }
            for(int k=1; k<=i*2-1; k++)
            {
                System.out.printf("*");
            }
            System.out.println();

        }

    }
}
