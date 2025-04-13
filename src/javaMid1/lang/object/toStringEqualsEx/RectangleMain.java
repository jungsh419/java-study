package javaMid1.lang.object.toStringEqualsEx;

public class RectangleMain {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(100, 20);
        Rectangle rect2 = new Rectangle(100, 20);

        System.out.println(rect1);
        System.out.println(rect2);

        System.out.println(rect1 == rect2); // 참조값이 달라 false 반환
        System.out.println(rect1.equals(rect2)); // 재정의에 따라 넓이와 높이가 같다면 true

    }
}
