/*
 * Purpose :
 * Date: 16-January-2019
 */

package sk.questAns.Sub_Super;

class SuperClass {
	public int doIt(String str, int data) throws ArrayIndexOutOfBoundsException{
		String signature = "(String, Integer[])";
		System.out.println(str + "  " + signature);
		return 1;
	}
}

public class SubClass extends SuperClass {
	public int doIt(String str, int data) throws Exception { // CE: Exception Exception is not compatible with throws clause in SuperClass.doIt(String, int)
		String signature = "test";
		System.out.println("Overridden: " + str + " " + signature);
		return 0;
	}

	public static void main(String args[]) {
		SuperClass sb = new SubClass(); // Runtime Polymorphism ?
		
		try {
			sb.doIt("hello", 3);
		} catch (Exception e) {}
	}
}