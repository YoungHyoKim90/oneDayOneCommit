package M2024_07;

/**
 * 상속, 메소드 재정의, final 클래스, final 메소드
 * 
 * @author PigYoung90 객체 지향 프로그램에서 부모 클래스의 멤버를 자식 클래스에게 물려줄 수 있다.
 * 
 *         상속 이미 개발된 클래스를 재사용하여 새로운 클래스를 만들기에 중복되는 코드를 줄임
 * 
 *         부모 클래스의 한번의 수정으로 모든 자식 클래스까지 수정되는 효과가 있어 유지보수 시간이 줄어듦
 * 
 */
public class InheritanceTest {
	void method1() {
		System.out.println("method1");
	}

	public class B extends InheritanceTest {
		String field2;

		void method2() {

		}
	}
}
