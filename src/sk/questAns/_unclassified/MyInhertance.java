package sk.questAns._unclassified;

class A {
		void displayFromA() {
		System.out.println("displayFromA");
	}
	
}

class B {
	void displayFromB() {
		System.out.println("displayFromB");
	}	
}

//class c  implements A,B { // Syntax Compilation error. Concept : implement keyword is used to implement interfaces only. 
// Class c can implement interfaces only (and not classes) 
class c  extends A{
void displayFromC() {
		System.out.println("In displayFromC");
		displayFromA();
//		displayFromB();
	}	
}

public class MyInhertance{

	public static void main(String[] args) {
		
		

	}

}
