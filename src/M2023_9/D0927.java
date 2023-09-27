package M2023_9;

public class D0927 {

 private String id;
 private String password;
 
 // 이렇게 단순한 값만 가져오면 VO

public String getId() {
	return id;
}

public String getPassword() {
	return password;
}
 // VO의 경우 단순한 get-읽어오기 정도만 하기 때문에 getter정도면 충분.

private String secondPassword;

// secondPassword를 DTO로 만들어 보겠음.

public String getSecondPassword() {
	return secondPassword;
}

public void setSecondPassword(String secondPassword) {
	this.secondPassword = secondPassword;
}
// DTO의 경우 비즈니스 로직 단계 등에서 값이 변경 될 수 있기 때문에 set이 들어가 있음.
/* 
 * 접근제한자.
 * public - 모든 클래스 및 패키지 등에서 사용이 가능 -> JVM이 접근하기 위해서도 public을 사용해야함.
 * default - 해당 클래스와 패키지까지 사용이 가능  
 * protected -해당 클래스와 패키지 그리고 상속된 클래스에서 사용가능
 * private -해당 클래스에서만 사용이 가능
 * 
 * void -  리턴타입이 없음. 문법적인 이유라고 보면됨. 해당 void가 없을경우 return이 있어야함.
 * return - void가 아닌경우 사용하는데, 해당 return (내용) ; 해주면 해당 내용을 리턴함 .
 * -? 어디로 리턴함!?
 */
	
}
