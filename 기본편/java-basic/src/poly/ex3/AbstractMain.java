package poly.ex3;

/*
    - 추상클래스 덕분에 실수로 `Animal` 인스턴스를 생성할 문제를 근본적으로 방지해준다.
    - 추상메서드 덕분에 새로운 동물의 자식 클래스를 만들때 실수로 `sound()`를 오버라이딩 하지 않을 문제를 근본적으로 방지해준다.
 */

public class AbstractMain {

    public static void main(String[] args) {
        // 추상클래스 생성 불가
        // AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
