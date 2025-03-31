package javabasic.Class;

public class ClassStart3 {
    public static void main(String[] args) {


        Student stu = new Student();
        stu.name = "정성훈";
        stu.age = 25;
        stu.grade = 100;

        Student stu2 = new Student();
        stu2.name = "예보냄";
        stu2.age = 20;
        stu2.grade = 0;

        Student[] stus ={stu, stu2};

        System.out.println("이름 : "+ stus[0].name + " 나이 : "+ stus[0].age + " 성적 : "+ stus[0].grade);
        System.out.println("이름 : "+ stus[1].name + " 나이 : "+ stus[1].age + " 성적 : "+ stus[1].grade);

        System.out.println(stus[0]);
        System.out.println(stus[1]);
    }
}
