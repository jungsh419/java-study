package array;

public class ArrayEx1 {
    public static void main(String[] args) {

        int sum =0;
        double avg;
        int[] students = new int[5];
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for(int stu:students){
            sum +=stu;
        }
        avg = (double) sum/students.length;

        System.out.println("점수 총합 : " + sum);
        System.out.println("점수 평균 : " + avg);

    }
}
