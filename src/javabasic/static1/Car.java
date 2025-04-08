package javabasic.static1;

public class Car {
    private String carName;
    private static int count;

    public Car(String name)
    {
        this.carName = name;
        System.out.println("차량구입, 이름 : "+ this.carName);
        count++;
    }
    public static void showTotalCars()
    {
        System.out.println("구매한 차량 수 : "+ count);
    }
}
