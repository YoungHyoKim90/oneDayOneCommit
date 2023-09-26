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

	    public static void main(String args[]) {
	    	D0926 doe = new D0926();
	        doe.show();
	        System.out.println("Is 5>4: " + D0926.isGreater(5, 4));
	        System.out.println(doe);
	        System.out.println("a+b : " + D0926.isPlusGreater(5, 4));
	        
	    }
	}
	

