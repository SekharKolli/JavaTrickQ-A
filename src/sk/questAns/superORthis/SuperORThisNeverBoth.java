/*
 * Purpose : Question : can a constructor have a call to super() and this() in itself?
 * 
 * Ans: NO. Reason being, both super() and this() compete for being the first line in the constructor call  and hence will not compile
 *
 * Date: 05-January-2019
 */

package sk.questAns.superORthis;

class Parent {

} // EO Parent

class Child extends Parent {
	int i;

	public Child() {
		
		// Moving any of the lines to the top throws a CE: "Constructor call must be the first statement in a constructor"
		super(); // super() has to be the first line in the constructor
		this(10); // this() has to be the first line in the constructor
	}

	public Child(int i) {
		this.i = i;

	}

} // EO Child

public class SuperORThisNeverBoth {

	public static void main(String[] args) {

	}

}
