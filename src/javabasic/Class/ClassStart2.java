package javabasic.Class;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentsName = {"학생 1", "학생 2", "학생 3", "학생 4"};
        int[] studentsAge = {15, 16, 17, 18};
        int[] studentsGrade = {90, 80, 70, 60 };

        for(int i=0; i<studentsName.length;i++)
        {
            System.out.println("이름 : "+ studentsName[i] + " 나이 : "+ studentsAge[i] + " 성적 : "+ studentsGrade[i]);
        }




    }
}
