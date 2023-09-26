package M2023_9;

public class D0926 {

	    void show() {
	        int i = 67;
	        System.out.println("In show method: "+ i);
	    }

	    static boolean isGreater(int a, int b) {
	        return a > b;
	    }
	    static int isPlusGreater(int a, int b) {
	    	return a+b;
	    }
	    static int isminusGreater(int a, int b) {
	    	return a-b;
	    }

	    public static void main(String args[]) {
	    	D0926 doe = new D0926();
	        doe.show();
	        System.out.println("Is 5>4: " + D0926.isGreater(5, 4));
	        System.out.println(doe);
	        System.out.println("a+b : " + D0926.isPlusGreater(5, 4));
	        System.out.println("a-b : " + D0926.isminusGreater(5, 4));
	        
	        System.out.println("a, b의 값 넣기");
	        int a = 11;
	        int b = 21;
	        System.out.println("a : " + a);
	        System.out.println("b : " + b);
	        System.out.println("같은 로직 실행");
	        System.out.println("Is 5>4: " + D0926.isGreater(a,b));
	        System.out.println(doe);
	        System.out.println("a+b : " + D0926.isPlusGreater(a,b));
	        System.out.println("a-b : " + D0926.isminusGreater(a,b));
	        
	    }
	}
	

