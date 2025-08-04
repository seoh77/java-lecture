package collection.compare;

/*
    TreeSet과 같은 이진 탐색 트리 구조는 데이터를 보관할 때, 데이터를 정렬하면서 보관한다. 따라서 정렬 기준을 제공하는 것이 필수다.
    => TreeSet, TreeMap은 `Comparable` 또는 `Comparator`가 필수다.
 */

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        // TreeSet을 생성할 때 별도의 비교자를 제공하지 않으면 객체가 구현한 Comparable을 사용한다.
        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        // TreeSet을 생성할 때 별도의 비교자를 제공하면 Comparable 대신 비교자(Comparator)를 사용해서 정렬한다.
        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
    }
}
