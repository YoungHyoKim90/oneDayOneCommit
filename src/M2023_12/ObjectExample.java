package M2023_12;

//클래스 정의
class Car {
 // 속성 (멤버 변수)
 String brand;
 String model;
 int year;

 // 메서드 (동작)
 void start() {
     System.out.println("차량이 출발합니다.");
 }

 void stop() {
     System.out.println("차량이 정지합니다.");
 }
}

public class ObjectExample {
 public static void main(String[] args) {
     // 객체 생성
     Car myCar = new Car();

     // 객체의 속성 설정
     myCar.brand = "Hyundai";
     myCar.model = "Sonata";
     myCar.year = 2020;

     // 객체의 메서드 호출
     System.out.println("내 차의 브랜드: " + myCar.brand);
     myCar.start();
     myCar.stop();
 }
}

