/*
 * Purpose : What will happen to the value of x that is inherited from and Interface and is redeclared in Class
 * Date: 14-January-2019
 */

package sk.questAns._unclassified;

interface InterfaceWithVarX {
	int x = 20;
}

public class DemoInterfaceVar implements InterfaceWithVarX {
	int x = 40;

	public static void main(String args[]) {
		DemoInterfaceVar t1 = new DemoInterfaceVar();
		System.out.println("Accessing x, will get us the instance variable "+t1.x);
		
		System.out.println("Accessing x from the interface : "+InterfaceWithVarX.x);
	}
}