package M2024_06;

/**
 * String 타입
 * 
 * @author PigYoung90 String 
 * 변수에 문자열 리터럴을 대입할 경우 String 객체로 생성되고 변수가 String 객체를  참조
 */
public class String_Test {

	public static void main(String[] args) {
	    String name = "가나다";
	    String hobby = "노래";
	    // 문자열 리터럴이 동일한 경우 같은 String 객체를 공유한다. 다를 경우 각자의 String 객체로 힙영역에 저장된다.
	    
	    String name1 ="123";
	    String name2 ="123"; //true
	    
	    System.out.println(name1 == name2);
	    
	    //new 연산자를 통해 객체 생성을 하여 같은 문자열 리터럴을 가지고 있어서 각자의 객체로 생성할 수 있다.
	    
	    String name3 = new String("123");
	    String name4 = new String("123");
	    System.out.println(name3 == name4); //false
	    
	    //다른 객체를 가진 다른 참조 변수의 경우 문자열을 비교하려면 ==가 아닌 equals()를 사용하여 문자열을 비교한다.
	    
	    
	    System.out.println(name.equals(hobby)); //false
	    System.out.println(name3.equals(name4)); //true
	} // String 변수 초기 값으로는 null을 대입하여 사용한다. null인 객체는 참조하는 변수가 없음을 의미하고 가비지컬렉터에 의해 메모리에서 자동으로 제거한다. 
	
}
