package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        // 문제점1. Animal 클래스를 생성할 수 있는 문제
        Animal a = new Animal();
        a.sound();

        // Inline Variable 단축키 : opt + cmd + N
        // 문제점2. Animal 클래스를 상속받는 곳에서 `sound()` 메서드 오버라이딩을 하지 않을 가능성
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // Extract Method 단축키 : opt + cmd + M
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
