package sk.questAns._unclassified;

class BankAccount {
	int Account_number;
	String Account_Name;

	BankAccount(int x) {
		Account_number = x;
	}
}

public class Module3Quiz {
	public static void main(String args[]) {
		BankAccount bacc = new BankAccount(150);
		
		bacc.Account_Name = "Banking";
		
		System.out.println("Id " + bacc.Account_number);
		System.out.println("Name " + bacc.Account_Name);
	}
}
