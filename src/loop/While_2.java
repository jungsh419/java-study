package loop;

public class While_2 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1;
        int max = 3;

        while(num <= max)
        {
            sum+=num;
            System.out.println(sum);
            num++;
        }

    }
}
