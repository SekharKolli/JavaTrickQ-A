/*
 * Purpose : Can a method have the same names its class. We are not talking about constructors. we are referring to a method with a return type and
 * having the name of the class
 * 
 * Ans: yes we can. And when declaring it the compiler throws a warning
 *
 * Date: 05-January-2019
 */

package sk.questAns.constructors;

public class MethodWithClassesName {

	public void MethodWithClassesName() { // Compiler says "This method has a constructor name"
		System.out.println(" I'm a method with the same name as that of the class!");

	}

	public static void main(String[] args) {

		MethodWithClassesName m = new MethodWithClassesName();
		m.MethodWithClassesName();

	}

} // EO MethodWithClassesName
