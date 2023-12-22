package M2023_12;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 클래스 로드
        Class<?> myClass = Class.forName("com.example.MyClass");

        // 클래스의 인스턴스 생성
        Object instance = myClass.getDeclaredConstructor().newInstance();

        // 메서드 호출
        // methodName: 호출할 메서드의 이름
        String methodName = "myMethod";
        Method method = myClass.getDeclaredMethod(methodName);
        method.invoke(instance); // 인스턴스를 통해 메서드 호출
    }
}

