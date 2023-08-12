package Inheritance;
class Acc {
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

class SavingAcc extends Acc {
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

class CurrentAcc extends Acc {
	void roi() {
		System.out.println("ROI on Current Account is 6.5%");
	}
	
	@Override
	void deposit() {
		System.out.println("Current Acc Deposit Limit is 2 Lac");
	}
}


public class IS_AA {
	
	// Polymorphic Call
	void caller(Acc acc) {
		acc.withdraw();
		acc.deposit();
		if(acc instanceof SavingAcc) {
			// Downcasting
			SavingAcc sa = (SavingAcc) acc;
			sa.fd_roi();
		}
		else if(acc instanceof CurrentAcc) {
			CurrentAcc ca = (CurrentAcc) acc;
			ca.roi();
		}
	}

	public static void main(String[] args) {
		
		IS_AA obj = new IS_AA();
		obj.caller(new SavingAcc());
		obj.caller(new CurrentAcc());
	}

}