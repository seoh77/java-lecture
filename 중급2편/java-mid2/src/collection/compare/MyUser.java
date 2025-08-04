package collection.compare;

/*
    Comparable
     - 현재 객체가 인수로 주어진 객체보다 더 작으면 음수 (-1)
     - 두 객체의 크기가 같으면 0
     - 현재 객체가 인수로 주어진 객체보다 더 크면 양수 (1)
 */

public class MyUser implements Comparable<MyUser>{

    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
