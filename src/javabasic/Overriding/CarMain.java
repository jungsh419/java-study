package javabasic.Overriding;

public class CarMain {
    public static void main(String[] args) {
        ElecticCar eCar = new ElecticCar();
        GasCar gCar = new GasCar();

        eCar.move();
        eCar.charge();

        gCar.move();
        gCar.fuel();

    }
}
