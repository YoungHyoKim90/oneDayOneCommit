package M2024_01;

//함수형 인터페이스를 선언
interface MyFunctionalInterface {
 void myMethod(String input);
}

public class LambdaWithoutImport {
 public static void main(String[] args) {
     // 함수형 인터페이스의 인스턴스를 람다식으로 생성
     MyFunctionalInterface myFunction = (String input) -> {
         System.out.println("Input: " + input);
     };

     // 람다식을 실행
     myFunction.myMethod("Hello, Lambda!");
 }
}
