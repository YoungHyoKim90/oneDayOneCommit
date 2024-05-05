package M2024_05;

public class welcome05 {
	
	public static void main(String args) {
		System.out.println("벌써5월이야!");
		Thread.activeCount();
		System.out.println("벌써5월이야!");
		boolean condition = false;
		if (condition) {
			String[] args2 = new String[args.length() + 1];
			System.arraycopy(args, 0, args2, 0, args.length());
			args2[args.length()] = args;
			
		}
	}

}
