package javabasic.Overriding;

public class ElecticCar extends Car {

    public void charge()
    {
        System.out.println("전기를 충전합니다.");
    }

    @Override
    public void move()
    {
        System.out.println("차가 매우 빠르게 움직입니다. ");
    }
}
