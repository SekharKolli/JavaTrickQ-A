/* Lessons / Take Aways
 * 1. Accessing data members (declared in line 12, 13, 14) directly (line 26) will require these to be declared static
 * 2. Once an object is assigned NULL, other assignments is throwing a Null pointer access and at runtime java.lang.NullPointerException
 */

package sk.questAns._unclassified;

public class MyClass {

	int i; 
	float f; 
	String s;
	
	public static void main(String[] args) {
		
		MyClass obj = null; // Over here, obj is storing the address null, as opposed to the memory location
		
		obj.i=0; // java.lang.NullPointerException, obj can only be null at this location
		obj.f=0.0f; // java.lang.NullPointerException. Null pointer access: The variable obj can only be null at this location
		obj.s="some String"; // java.lang.NullPointerException. Null pointer access: The variable obj can only be null at this location
		
		System.out.println("Program Starts...");
		
		System.out.println(i+f+s); // Cannot make a static reference to the non-static field i
		System.out.println(obj.i+obj.f+obj.s);
		
		System.out.println("Program Ends...");

	}

}
