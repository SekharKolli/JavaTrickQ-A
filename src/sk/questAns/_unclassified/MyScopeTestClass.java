/*
 * This is how the Class scope_test is defined in the other package 
package packageTestEdureka; 

public class scope_test
{ 
	private int priv_data=20; 
	protected int prot_data = 30; 
	public int pub_data=40;
	int pack_data = 50;
}

// All these variables are used in another package as given below:
*/

package sk.questAns._unclassified;

import packageTestEdureka.scope_test; // This will get us the scope_test class, 

// Which are the variables accessible in MyScopeTestClass class

public class MyScopeTestClass {
	public static void main(String args[]) {
		scope_test t1 = new scope_test();
//		System.out.println(t1.priv_data); // The field priv_data is not visible
//		System.out.println(t1.prot_data); // The field prot_data is not visible
//		System.out.println(t1.pack_data); // The field pack_data is not visible
		System.out.println(t1.pub_data);
	}
}
