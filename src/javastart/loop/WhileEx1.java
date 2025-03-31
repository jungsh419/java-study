package loop;

public class WhileEx1 {
    public static void main(String[] args) {
        int count1 = 1;

        while(count1 <= 10)
        {
            System.out.println("while을 이용한 count1 값: "+ count1);
            count1 ++;
        }
        
        for(int count2=1; count2<=10;count2++)
        {

            System.out.println("for문을 이용한 count2 값"+ count2);

        }

    }
}
