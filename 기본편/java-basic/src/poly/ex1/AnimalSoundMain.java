package poly.ex1;

/*
    아래의 중복 제거 시도가 Dog, Cat, Caw의 타입이 서로 다르기 때문에 불가능하다.
    반대로 이야기하면 Dog, Cat, Caw가 모두 같은 타입을 사용할 수 있는 방법이 있다면 메서드와 배열을 활용해서 코드의 중복을 제거할 수 있다.
    => 다형성의 다형적 참조와 메서드 오버라이딩을 활용하면 모두 같은 타입을 사용하고, 각자 자신의 메서드도 호출할 수 있다.
 */

public class AnimalSoundMain {

    public static void main(String[] args) {
        // 단축키 : cmd + opt + V
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        /*
            배열과 for문을 통한 중복 제거 시도
            -> 배열과 for문을 사용해서 중복을 제거하려고 해도 배열의 타입을 Dog, Cat, Caw 중에 하나로 지정해야 한다.
               같은 Caw들을 배열에 담아서 처리하는 것은 가능하지만 타입이 서로 다른 Dog, Cat, Caw을 하나의 배열에 담는 것은 불가능하다.
         */
        // Caw[] cawArr = {dog, cat, caw};

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        soundCaw(caw);
    }

    /*
        메서드로 중복 제거 시도
        -> 메서드를 사용하면 매개변수의 클래스를 Caw, Dog, Cat 중 하나로 정해야 한다.
           따라서 이 메서드는 Caw 전용 메서드가 되고 Dog, Cat은 인수로 사용할 수 없다.
           Dog, Cat, Caw의 타입(클래스)이 서로 다르기 때문에 soundCaw 메서드를 함께 사용하는 것은 불가능하다.
     */
    private static void soundCaw(Caw caw) {
        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
