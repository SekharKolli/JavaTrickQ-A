
package sk.questAns.packages;

interface InterfaceWithVarX {
	int add(int x, int y);
}

interface InterfaceExdInterface extends InterfaceWithVarX {
	int add(int x, int y);
}

public class DemoInterfaceInheritance implements InterfaceExdInterface {
	public int add(int x, int y) {
		return 0;
	}

	public int sub(int a, int b) {
		return 0;
	}

	public static void main(String args[]) {System.out.println("There is no compilation error nor a runtime error");}
}
