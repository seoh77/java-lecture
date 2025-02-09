package poly.car1;

/*
    OCP(Open-Closed Principle) 원칙
    - Open for extension : 새로운 기능의 추가나 변경 사항이 생겼을 때, 기존 코드는 확장할 수 있어야 한다.
    - Closed for modification : 기존의 코드는 수정되지 않아야 한다.
 */

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경(k3 -> Model3Car)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경(Model3Car -> newCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
