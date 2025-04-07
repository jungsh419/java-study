package javabasic.access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //퍼블릭 호출
        data.publicField = 1;
        data.publicMethod();
        //default 호출 (같은 패키지 까지)
        data.defaultField = 2;
        data.defaultMethod();
        //private 호출 불가 (같은 클래스 까지)
        //data.privateField = 1;
        //data.privateMethod();

        data.innerAccess();
    }
}
