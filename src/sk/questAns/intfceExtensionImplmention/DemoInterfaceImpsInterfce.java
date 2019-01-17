/*
 * Purpose : Would extending a method from one class to the other and leaving it as an abstract class, further implementing this interfact generate
 * issues? Ans: No
 * 
 * Date: 14-January-2019
 */

package sk.questAns.intfceExtensionImplmention;

interface InterfaceWithMthdAdd {
	int add(int x, int y);
}

interface InterfaceExtsInterface extends InterfaceWithMthdAdd {
	int add(int x, int y);
}

public class DemoInterfaceImpsInterfce implements InterfaceExtsInterface {
	public int add(int x, int y) {
		return 0;
	}

	public int sub(int a, int b) {
		return 0;
	}

	public static void main(String args[]) {
		System.out.println("There is no compilation error nor a runtime error.");
	}
}
