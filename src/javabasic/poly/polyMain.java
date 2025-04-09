package javabasic.poly;

public class polyMain {

    public static void main(String[] args) {

        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        Child child2 = (Child)poly;
        child2.childMethod();
        ((Child)poly).childMethod();// 위와 동일


    }
}
