package homework;


public class Homework9_1 implements Runnable{
//	開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	競賽過程。
//	• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//	Sleep時間由亂數產生500~3000之間的毫秒數,如圖所示
//	• 參考範例:CounterRunnable.javaSleep時間由亂數產生500~3000之間的毫秒數
//	• 需留意主執行緒執行順序
	
		int counter = 1;
		private String name =null;
		
		public Homework9_1() {
		} // 建構者函數
		
		public Homework9_1(String name) {
			this.name =name;
		} // 建構者函數
		
		@Override
		public String toString() {
			return  name ;
		}

		public void run() { // 執行緒執行的地方
			int sum = 0;
			while (counter <= 10) {
				
				System.out.println( toString()+"吃第"+counter+"碗飯" );
				sum = counter++;
				if(sum == 10) {
					System.out.println( toString()+"吃完了!" );
				}
				try {
					Thread.sleep((int)(Math.random()*2501)+500); 
				} catch (Exception e) {
				}
			}
			
		}
		public static void main(String arg[]) {
			
			Homework9_1 r1 = new Homework9_1("饅頭人");// 產生Runnable物件
			Thread t1 = new Thread(r1); // 再由Runnable物件, 產生執行緒Thread物件
			Homework9_1 r2 = new Homework9_1("詹姆士");
			Thread t2 = new Thread(r2);
			System.out.println("----------大胃王比賽開始了!----------");
	
			try {
				t1.start();
				t2.start();
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("----------大胃王比賽結束了!----------");
		}
		
}
	

