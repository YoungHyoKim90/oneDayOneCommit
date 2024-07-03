package M2024_07;

/**
 * 열거 타입, 열거 타입 선언, 열거 상수, 열거 타입 변수
 * 
 * @author PigYoung90 데이터 중에는 몇 가지로 한정된 값만을 갖는 경우가 있다. 이러한 한정된 값을 갖는 타입을 열거
 *         타입이라고 한다.
 */
public class enumTest {

	public enum WEEK {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

		// 여기에서 WEEK는 열거타입 이름, 요일은 열거 상수 이다.
	}

	public enum MONTH {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	} // 숫자는 안되는 걸로~?

	public static void main(String[] args) {
		WEEK today;
		today = WEEK.WEDNESDAY;
		System.out.println("today = " + today);
		MONTH thisMonth;
		thisMonth = MONTH.JULY;
		System.out.println("this Month = " + thisMonth);
	}

}

/*
 * 열거 타입: 몇 가지로 한정된 값을 가지는 타입
 * 열거 타입 선언 : enum 타입 { 상수, 상수, … }
 * 열거 상수 : 열거 타입 선언 때 주어진 상수
 * 열거 타입 변수 : 열거 타입으로 선언된 변수, 열거 상수(한정된 값) 중 하나를 대입.
 */