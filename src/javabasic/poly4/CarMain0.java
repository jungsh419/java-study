package javabasic.poly4;

public class CarMain0 {
    public static void main(String[] args) {
          Driver driver = new Driver();
          Car k3car = new K3Car();
//        driver.setK3Car(k3car);
//        driver.drive();
//
//

//        driver.setK3Car(null);
//        driver.setModel3Car(model3Car);
//        driver.drive();

        driver.setCar(k3car);
        driver.drive();

        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();


    }
}
