package Inheritance;
class Account {
	String name;
	int acc_no;
	double balance;
	
	void withdraw() {
		System.out.println("Withdraw Limit is 50K");
	}
	
	void deposit() {
		System.out.println("Deposit Limit is 80K");
	}
}

class SavingAccount extends Account {
	int interest;
	void fd_roi() {
		System.out.println("FD ROI is 7%");
	}
	
	//Method Override - upgrade the previous feature that is
	//coming from parent class
	//@Override - annotation, just to tell other developers
	// that this method is overridden
	@Override
	void withdraw() {
		System.out.println("Saving Acc Withdraw Limit is 1 Lac");
	}
}

class CurrentAccount extends Account {
	void roi() {
		System.out.println("ROI on Current Account is 6.5%");
	}
	
	@Override
	void deposit() {
		System.out.println("Current Acc Deposit Limit is 2 Lac");
	}
}

public class IS_A {

	public static void main(String[] args) {
//		SavingAccount sa = new SavingAccount();
//		sa.withdraw();
//		sa.deposit();
//		sa.fd_roi();
//		
//		System.out.println("===================");
//		
//		CurrentAccount ca = new CurrentAccount();
//		ca.withdraw();
//		ca.deposit();
//		ca.roi();
		
		// UpCasting - create object of child class, but type of
		// object is parent class
		Account acc = new SavingAccount();
		acc.withdraw();		// SavingAccount's withdraw
		acc.deposit();		// Account's withdraw
		// methods are binded with type of object
		//acc.fd_roi();
		
		
		System.out.println("===================");
		
		acc = new CurrentAccount();
		acc.withdraw();
		acc.deposit();
		//acc.roi();
	}

}