package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox);   // 하한이 Animal
//        writeBox(catBox);   // 하한이 Animal

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    /*
        하한 와일드 카드
        - 와일드카드는 상한 뿐만 아니라 하한도 지정할 수 있다.
        - `<? super Animal>`는 `?`가 Animal 타입을 포함한 Animal 타입의 상위 타입만 입력 받을 수 있다는 뜻이다.
     */
    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));
    }
}
