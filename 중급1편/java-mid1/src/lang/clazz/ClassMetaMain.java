package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
    Class 클래스의 주요 기능
    - 타입 정보 얻기 : 클래스의 이름, 슈퍼클래스, 인터페이스, 접근 제한자 등과 같은 정보를 조회할 수 있다.
    - 리플렉션 : 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 등의 작업을 할 수 있다.
    - 동적 로딩과 생성 : `Class.forName()` 메서드를 사용하여 클래스를 동적으로 로드하고,
                     `newInstance()` 메서드를 통해 새로운 인스턴스를 생성할 수 있다.
    - 애노테이션 처리 : 클래스에 적용된 애노테이션(annotation)을 조회하고 처리하는 기능을 제공한다.
 */

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {
        // Class 조회
        // `String.Class`는 String 클래스에 대한 Class 객체를 나타내며, 이를 통해 String 클래스에 대한 메타데이터를 조회하거나 조작할 수 있다.
        Class clazz = String.class;     // 1. 클래스에서 조회
//        Class clazz = new String().getClass();     // 2. 인스턴스에서 조회
//        Class clazz = Class.forName("java.lang.String");   // 3. 문자열로 조회

        // 모든 필드 출력
        // `getDeclaredFields()` : 클래스의 모든 필드를 조회한다.
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        // 모든 메서드 출력
        // `getDeclaredMethods()` : 클래스의 모든 메서드를 조회한다.
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // 상위 클래스 정보 출력
        // `getSuperclass()` : 클래스의 부모 클래스를 조회한다.
        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        // 인터페이스 정보 출력
        // `getInterfaces()` : 클래스의 인터페이스들을 조회한다.
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }
    }
}
