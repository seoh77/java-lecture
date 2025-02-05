package extends1.ex1;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

        // move()라는 공통 기능이 보임 -> 이런 경우 상속 관계를 사용하는 것이 효과적이다.
    }
}
