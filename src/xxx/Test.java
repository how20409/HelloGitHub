package xxx;

class BankAccount {
	private int money = 0; // 庫存量
	private boolean graduated = false;
	
	
	synchronized public void remit(int qty) {
		if( !graduated ) {
			while (money > 3000) {
				System.out.printf("\t\t\t\t存款超過3000，暫停匯款\n");
				try {
					wait(1000);
					if( graduated ) {
						return;
					}
					System.out.printf("\t\t\t\t媽媽被熊大要求匯款!\n");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			money += qty;
			System.out.printf("\t\t\t\t媽媽存了"+qty + "，帳戶共有" + money+"\n");
			notify();
		}
		
	}

	synchronized public void withdraw(int qty) {
		if( !graduated ) {
			while (money < qty ) {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				try {
					wait(1000);
					if( graduated ) {
						return;
					}
					System.out.println("熊大被老媽告知帳戶已經有錢!");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			money -= qty;
			System.out.println("熊大領了1000，帳戶共有:" + money);
			if (money < 2000) {
				System.out.println("熊大看到餘額在2000以下，要求匯款");
				notify();
			}
		}
		
	}
	synchronized public void changeStatemant() {
		graduated = true;
	}
}


class Parent extends Thread {
	BankAccount bankAccount;

	public Parent(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			bankAccount.remit(2000);
	}
}

class Child extends Thread {
	BankAccount bankAccount;

	public Child(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			bankAccount.withdraw(1000);
		}
		bankAccount.changeStatemant();
	}
}




public class Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		Thread parent = new Parent(ba);
		Thread child = new Child(ba);
		parent.start();
		child.start();
		try {
			parent.join();
			child.join();
		}catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println(" ✬ ✭ ✮ ✯ ✰恭喜畢業!!! ✰ ✯ ✮ ✭ ✬");
	}

}