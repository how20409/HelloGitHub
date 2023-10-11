package homework;

public class Homework10_1 {

//	請設計一隻程式,用亂數產生5個介於1~100之間的整數,而輸出結果
//	可以判斷出這5個整數為是否為質數 (提示:Math類別)
	public void prime() {
		int[] numbers = new int [5];
		for(int i : numbers) {
			int number = (int)(Math.random()*100)+1;
			System.out.print(number);

			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(number); j++) {
		           if (number % j == 0) {
		               isPrime = false;
		               break;
		           }
			} 
			System.out.println(isPrime?"是質數":"不是質數");
		}	
	}
	

	public static void main(String[] args) {
		Homework10_1 h = new Homework10_1();
		h.prime();
		
	}
	
	
}
