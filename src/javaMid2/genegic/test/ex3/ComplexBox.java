package javaMid2.genegic.test.ex3;

import javaMid2.genegic.animal.Animal;

public class ComplexBox <T extends Animal>{
    private T animal;

    public void set(T animal)
    {
        this.animal = animal;
    }
    public <Z> Z printAndReturn(Z z)
    {
        System.out.println("animal.className = "+ animal.getClass().getName());
        System.out.println("t.className = "+ z.getClass().getName());
        return z;
    }
    // 메서드 > 타입
//    public <T> T printAndReturn(T t)
//    {
//        System.out.println("animal.className = "+ animal.getClass().getName());
//        System.out.println("t.className = "+ t.getClass().getName());
//        return t;
//    }
}
