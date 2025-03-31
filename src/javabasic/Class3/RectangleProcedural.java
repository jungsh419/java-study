package javabasic.Class3;

public class RectangleProcedural {

    int w;
    int h;


    int getArea()
    {
        return w*h;
    }

    int getPerimeter()
    {
        return 2*(w+h);

    }
    boolean isSquare()
    {
        return w==h;
    }
}
