package javaMid2.collection.list.test;

import java.util.ArrayList;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {

        List<Integer> students = new ArrayList<>();
        students.add(90);
        students.add(80);
        students.add(70);
        students.add(60);
        students.add(50);

        int total= 0;
        for (Integer student : students) {
            total += student.intValue();

        }
        double avg = (double) total/students.size();

        System.out.println("합계 : "+total);
        System.out.println("평균 : "+avg);


    }
}
