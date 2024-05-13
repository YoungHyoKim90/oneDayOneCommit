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

			do {
				new Runnable() {
					public void run() {
						System.out.println("Rnnable : " + "\r\n" + "java.lang.Runnable\r\n" + "\r\n" + "\r\n"
								+ "The Runnable interface should be implemented by anyclass whose instances are intended to be executed by a thread. Theclass must define a method of no arguments called run. \r\n"
								+ "\r\n"
								+ "This interface is designed to provide a common protocol for objects thatwish to execute code while they are active. For example, Runnable is implemented by class Thread.Being active simply means that a thread has been started and has notyet been stopped. \r\n"
								+ "\r\n"
								+ "In addition, Runnable provides the means for a class to beactive while not subclassing Thread. A class that implements Runnable can run without subclassing Threadby instantiating a Thread instance and passing itself inas the target. In most cases, the Runnable interface shouldbe used if you are only planning to override the run()method and no other Thread methods.This is important because classes should not be subclassedunless the programmer intends on modifying or enhancing the fundamentalbehavior of the class.\r\n"
								+ "Since:JDK1.0Author:Arthur van HoffSee Also:java.lang.Threadjava.util.concurrent.Callable"
								+ "" + "" + "" + "");

					}
				};

				
			} while (condition);

		}
	}

}
/*
 *
 * void java.io.PrintStream.println(String x) Prints a String and then terminate
 * the line. This method behaves asthough it invokes print(String) and then
 * println(). Parameters:x The String to be printed.
 * 
 * 
 * PrintStream java.lang.System.out The "standard" output stream. This stream is
 * alreadyopen and ready to accept output data. Typically this streamcorresponds
 * to display output or another output destinationspecified by the host
 * environment or user. For simple stand-alone Java applications, a typical way
 * to writea line of output data is: System.out.println(data) See the println
 * methods in class PrintStream. See
 * Also:java.io.PrintStream.println()java.io.PrintStream.println(boolean)java.io
 * .PrintStream.println(char)java.io.PrintStream.println(char
 * [])java.io.PrintStream.println(double)java.io.PrintStream.println(float)java.
 * io.PrintStream.println(int)java.io.PrintStream.println(long)java.io.
 * PrintStream.println(java.lang.Object)java.io.PrintStream.println(java.lang.
 * String)
 * 
 * 
 */
