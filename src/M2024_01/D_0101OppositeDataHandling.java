package M2024_01;

	import java.util.ArrayList;
	import java.util.List;

	public class D_0101OppositeDataHandling {
	    public static void main(String[] args) {
	        List<String> dataList = new ArrayList<>();
	        dataList.add("데이터1");
	        dataList.add("데이터2");
	        
	        // 리스트를 역순으로 처리
	        for (int i = dataList.size() - 1; i >= 0; i--) {
	            System.out.println("역순 데이터: " + dataList.get(i));
	        }
	    }
	}

