package if_else;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 55;

        if(score >=90){
            System.out.println("A");
        }
        else if (score<90 && score>=80)
        {
            System.out.println("B");
        }
        else if (score<80 && score>=70)
        {
            System.out.println("C");
        }
        else if (score<70 && score>=60)
        {
            System.out.println("D");
        }
        else if (score<60 )
        {
            System.out.println("F");
        }
    }
}
