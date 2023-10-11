package homework;

//		熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,
//		所以只要看到熊大帳戶的餘額超過3000元,就會停止匯款給熊大;
//		但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。
//		如果帳戶餘額低於熊大要提款的金額,熊大就會暫停提款,
//		直到媽媽告知他錢已經入帳戶。
//		假設媽媽一次匯款 2000 元,熊大一次提款1000元,
//		寫一個Java程式模擬匯款10次與提款10次的情形。


class Account {
	private int balance = 0; //餘額
	private boolean statement = false;

	synchronized public void deposit(int dpsm) {
		 if(!statement) {
			while (balance > 3000) {
				System.out.println("\t\t媽媽看到餘額在3000以上，暫停匯款");
				try {
					wait(1000);
					if(statement) {
						System.out.println("!!!");
						return;
					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			balance += dpsm;
			System.out.printf("\t\t\t媽媽存了%d, 帳戶共有：%d\n",dpsm,balance);
			
			if (balance > 2000) {
				System.out.println("\t\t雄大被老媽告知帳戶已經有錢了");
				notify();
			}
		}
	}

	synchronized public void withdraw(int wdm)  {
		if(!statement) {
			while (balance < 1000) {
				System.out.println("\t\t雄大看到帳戶沒錢，暫停提款");
				try {
					wait(5000);
					if(statement) {
						System.out.println("???");
						return;
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			balance -= wdm;
			System.out.printf("雄大領了%d, 帳戶共有：%d\n",wdm,balance);
			
			if (balance < 2000) {
				System.out.println("\t\t雄大看到餘額再2000以下，要求匯款");
				notify();
				
				
			}else if (balance < 1000) {
				System.out.println("\t\t\t媽媽被熊大要求匯款");
				notify();
			}
		}
		
	}
	synchronized public void changeStatemant() {
		statement = true;
	}
}

class Deposit extends Thread {
	Account acc;
	int count; // 執行次數

	public Deposit(Account acc,int count) {
		this.acc = acc;
		this.count = count;
	}

	public void run() {
		for (int i = 1; i <= count; i++) {
			acc.deposit(2000);
			try {
				Thread.sleep(3000);
				System.out.println("!!!"+ i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}	

}

class Withdraw extends Thread {
	Account acc;
	int count; // 執行次數

	public Withdraw(Account acc,int count) {
		this.acc= acc;
		this.count = count;
	}

	public void run(){
		for (int i = 1; i <= count; i++) {
			
		acc.withdraw(1000);
		System.out.println(":)"+ i);
		}
		acc.changeStatemant();
		
	}	
}

public class Homework9_2{
	public static void main(String[] args) {
		Account acc = new Account();
		int numOperations = 10; // 設定執行次數
		Deposit deposit = new Deposit(acc, numOperations);
		
		Withdraw withdraw = new Withdraw(acc, numOperations);
	
		deposit.start();
		withdraw.start();
		
		try {
			deposit.join();
			withdraw.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("THE END");
	}
}