package javastart.loop;

public class WhileEx2 {
    public static void main(String[] args)
    {
        int num2=1;
        int count = 0;

        while(true)
        {

            num2++;
            if(num2%2==0)
            {
                System.out.println("while문 이용 : " + num2);
                count++;

            }
            else if(count == 10)
            {
                break;
            }

        }

        for(int num1 = 1; num1<=20; num1++)
        {
            if(num1 % 2 == 0)
            {
                System.out.println("for문 이용 : " + num1);
            }

        }
    }
}
