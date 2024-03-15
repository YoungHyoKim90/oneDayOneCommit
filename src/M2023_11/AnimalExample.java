package M2023_11;

//동물 인터페이스
interface Animal {
 void makeSound();
}

//구체적인 동물 클래스 - 고양이
class Cat implements Animal {
 @Override
 public void makeSound() {
     System.out.println("야옹");
 }
}


//구체적인 동물 클래스 - 강아지
class Dog implements Animal {
 @Override
 public void makeSound() {
     System.out.println("멍멍");
 }
}


public class AnimalExample {
 public static void main(String[] args) {
     Animal cat = new Cat();
     Animal dog = new Dog();

     cat.makeSound(); // "야옹" 출력
     dog.makeSound(); // "멍멍" 출력
 }
}
