package M2024_03;


public class Service {
	
	
	@PrintAnnotation
	private String name;
	
	
	@PrintAnnotation()
	public void method1() {
		System.out.println("메서드1 입니다.");
	}
	
	
	@PrintAnnotation("%")
	public void method2() {
		System.out.println("메서드2 입니다.");
	}
	
	
	@PrintAnnotation(value = "#", count = 25)
	public void method3() {
		System.out.println("메서드3 입니다.");
	}
}

/*
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

     Annotation에 대하여...
     
    프로그램 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨것
    (JDK1.5부터 지원됨.)
  주석처럼 프로그램에 영향을 미치지 않으면서, 다른 프로그램(또는 컴파일러)에게 유용한
  정보를 제공한다.
  
  종류 : 1. 표준애너테이션
      2. 메타애너테이션(애너테이션을 위한 애너테이션, 즉 애너테이션을 정의할 때 사용하는
                                         애너테이션)
                                         
   애너테이션 타입 정의하기
   @interface 애너테이션이름 {
   	 
   	 요소타입  타입요소이름();  // 반환값이 있고 매개변수는 없는 추상메서드의 형태
   	   ...
   	   
   }
   
   애너테이션 요소의 규칙
  1. 요소타입은 기본형, String, enum, 애너테이션, class만 허용한다.
  2. ()안에 매개변수를 선언할 수 없다.
  3. 예외를 선언할 수 없다.
  4. 요소의 타입에 타입매개변수(지네릭타입글자)를 사용할 수 없다.	
 
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-"; // 기본값을 '-'로 설정
	int count() default 20;		// 기본값을 20으로 지정
}
*/
