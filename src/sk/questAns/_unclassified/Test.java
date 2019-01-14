package sk.questAns._unclassified;

class base {
	base() {
		System.out.println("In the base class..");
	}

	void test() {
		System.out.println("in the test function...");
	}
}

class derived extends base {
	derived() {
		System.out.println("In the derived class..");
		super.test();
	}
}

public class Test {
	public static void main(String args[]) {
		derived d1 = new derived();
	}
}