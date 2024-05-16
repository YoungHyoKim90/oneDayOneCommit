package M2024_05;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class T01ArrayListTest {
	
	public static void main(String[] args) {
		
		// Default Capacity => 10;
		List list1 = new Vector();
		
		// add()메서드를 사용해서 데이터를 추가한다.
		list1.add("aaa");
		list1.add("bbb");
		list1.add(111);
		list1.add(new Character('k'));
		list1.add(true);
		list1.add(12.34);
		
		// size() => 데이터의 개수
		System.out.println("size => " + list1.size());
		System.out.println("list1 => " + list1);
		
		// get()으로 데이터 가져오기
		System.out.println("1번째 자료 => " + list1.get(0));
		
		// 데이터의 끼워넣기도 같다.
		list1.add(0, "zzz");
		System.out.println("list1 => " + list1);
		
		// 데이터 변경하기 (set메서드)
		String temp = (String) list1.set(0, "YYY");
		System.out.println("temp => " + temp);
		System.out.println("list1 => " + list1);
		
		// 삭제하기
		list1.remove(0);
		System.out.println("첫번째 데이터 삭제 후 : " + list1);
		
		list1.remove("bbb");
		System.out.println("bbb 삭제 후 : " + list1);
		
		//list1.remove(1);
		list1.remove(new Integer(111));
		System.out.println("111 삭제 후 : " + list1);
		
		System.out.println("============================");
		
		// 제너릭을 지정하여 선언할 수 있다.
		List<String> list2 = new ArrayList<String>();
		list2.add("AAA");
		list2.add("BBB");
		list2.add("CCC");  
		
		list2.add("DDD");
		list2.add("EEE");
		
		for(String s : list2) {
			System.out.println(s);
		}
		System.out.println("-----------------------------");
		
		// contains(비교객체) => 리스트에 '비교객체'가 있으면 true
		//                     그렇지 않으면 false가 리턴됨.
		System.out.println(list2.contains("DDD"));
		System.out.println(list2.contains("ZZZ"));
		
		// indexOf(비교객체) => 리스트에서 '비교객체'를 찾아 '비교객체'가
		//                    존재하는 index값을 반환한다. 없으면 -1리턴함.
		System.out.println("DDD의 index값 : " 
				+ list2.indexOf("DDD"));
		System.out.println("ZZZ의 index값 : " 
				+ list2.indexOf("ZZZ"));
		System.out.println("-----------------------------");
		
		// ArrayList 삭제 처리 예제
		for(int i=0; i<list2.size(); i++) {
			list2.remove(i);
		}
		
		System.out.println("삭제 처리 후 리스트 데이터 개수 : "
				+ list2.size());
	}
}

