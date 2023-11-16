package M2023_11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D_1116DateTest {
	public static void main(String[] args) {

		//현재시간을 표시하는 코드를 만들어보자.
		/*
		 * 자바 8이전에는 SimpleDateFormat이라는 메소드가 존재하였다.
		 */
		SimpleDateFormat SDF1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //#SDF1 : java.text.SimpleDateFormat@4f76f1a0
		System.out.println("SDF1 : "+ SDF1); //이렇게 출력하면 해당 변수의 주소값이 넘어옴.
		//해당 SDF1객체를 이용하려면 Date() 객체를 사용한다. Date객체는 기본적인 타입이String을 사용한다.
		Date now = new Date();
		String nowTime = now.toString(); // new 객체를 toString으로 
		System.out.println("now :" +now); //#now :Thu Nov 16 12:34:39 KST 2023
		System.out.println("nowTime : " +nowTime); //# nowTime : Thu Nov 16 12:34:39 KST 2023
		//엥? 출력이 안되었다 왜지? 저장을 안했네... ㅋ
		
		//특정 무자열 포맷을 얻고싶을때는
		String nowTime1 = SDF1.format(now);
		
		System.out.println("nowTime : " + nowTime1); //#nowTime : 2023-11-16 12:37:34
		// 바로 출력도 가능하다 
		System.out.println("SDF1.format(now)" +SDF1.format(now)); //SDF1.format(now)2023-11-16 12:37:34
		
		//참조한 블로그 주소 :https://dev-coco.tistory.com/31
	}
}
