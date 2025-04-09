package javabasic.access.child;

import javabasic.access.parent.Parent;

public class Child extends Parent {

    public static void main(String[] args)
    {


    }

    public void call()
    {
        publicValue =1; //퍼블릭은 접근가능
        protectedValue = 1; //상속관계 같은 패키지 접근 가능
        //defualtValue = 1; // 상속관계여도 다른 패키지 접근 불가능
        //privateValue = 1; // 본인 클래스 외에 접근 불가능

        publicMethod();
        protectedMethod();
        //defaultMethod(); // 위와 같은 이유로 접근 불가
        //privateMethod();

        printParent();



    }

}
