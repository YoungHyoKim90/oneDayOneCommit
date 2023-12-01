package M2023_12;

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

public class PolymorphismExample {
 public static void main(String[] args) {
     Animal cat = new Cat();
     Animal dog = new Dog();

     animalMakesSound(cat); // Cat 객체의 makeSound() 호출
     animalMakesSound(dog); // Dog 객체의 makeSound() 호출
 }

 // 다형성을 사용하여 Animal 인터페이스로 구현된 객체의 makeSound() 호출
 public static void animalMakesSound(Animal animal) {
     animal.makeSound();
 }
}

