package Operation;

public class OperationEx2 {
    public static void main(String[] args) {
        double num1 = 1.5;
        double num2 = 2.5;
        double num3 = 3.5;

        double sum = num1+num2+num3;
        double avg = (num1+num2+num3)/3;

        System.out.printf("합 : %.1f 평균 : %.1f", sum, avg);

    }
}
