package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null;   // data 변수에는 아직 가리키는 객체가 없다.
        System.out.println("1. data = " + data);

        data = new Data();  // 새로운 객체 생성
        System.out.println("2. data = " + data);

        data = null;        // data 변수는 앞서 만든 Data 인스턴스를 더는 참조하지 않는다.
        System.out.println("3. data = " + data);
    }
}

/* GC (가비지 컬렉션)
    - 아무도 참조하지 않는 인스턴스가 있으면 JVM의 GC가 더 이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거한다.
    - 객체는 해당 객체를 참조하는 곳이 있으면, JVM이 종료할 때까지 계속 생존한다.
      그런데 중간에 해당 객체를 참조하는 곳이 모두 사라지면 그때 JVM은 필요 없는 객체라 판단하고 GC를 사용해서 제거한다.
 */