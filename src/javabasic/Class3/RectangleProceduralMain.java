package javabasic.Class3;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        RectangleProcedural rec = new RectangleProcedural();
        rec.w = 10;
        rec.h = 20;

        int area = rec.getArea();
        int perimeter = rec.getPerimeter();
        String isSquare = (rec.isSquare())?"맞음":"아님";
        System.out.println("넓이 : " + area);
        System.out.println("둘레 : " + perimeter);
        System.out.println("정사각형 여부 : " + isSquare);

    }

}
