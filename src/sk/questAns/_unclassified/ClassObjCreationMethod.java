/*
 * Take Away
 * 
 * Test method in BaseWithTestMthd will cause a infinite loop till memory is consumed and then an exception will be thrown
 * 
 * */

package sk.questAns._unclassified;

class BaseWithTestMthd {
	BaseWithTestMthd() {
		System.out.println("In the BaseWithTestMthd class..");
		test();
	}

	void test() {
		System.out.println("in the test function...");
		BaseWithTestMthd b1 = new BaseWithTestMthd(); // Will cause an infinite loop and we'll run out of memory
	}
}

public class ClassObjCreationMethod {
	public static void main(String args[]) {
		BaseWithTestMthd b1 = new BaseWithTestMthd();
	}
}
