package homework;

public class Homework2 {
	public static void main(String[] args) {
		int sum = 0, i ;
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
			for(i = 2; i <= 1000; i += 2) {
				sum += i;
			}
			System.out.println("1~1000的偶數和 is " + sum);
			System.out.println("--------");
		
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈);
			sum =1;
			for(i = 1; i <= 10; i++) {
				sum *= i;
			}
			System.out.println("1~10的連乘積(用for迴圈) is " + sum);
			System.out.println("--------");		
		
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
			sum = 1;
			i = 1;
			while( i <= 10) {
				sum *= i;
				i++;
			}
			System.out.println("1~10的連乘積(用while迴圈) is " + sum);
			System.out.println("--------");
		
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100		
			System.out.print( "輸出結果 is " );
			for(i = 1 ; i <= 10; i++) {
				System.out.print((int)Math.pow(i, 2)+" ");
			}
			System.out.println();
			System.out.println("--------");		
		
//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
//		請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
			sum = 0;
			System.out.println("阿文可以選擇的數字:");
			for(i = 1; i <= 49; i++) {
				if(i % 10 != 4 && i /10 != 4) {
					System.out.print(i + " ");
					sum++;
				}
			}
			System.out.println();
			System.out.printf("總共有%d個%n",sum);
			System.out.println("--------");	
		
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
			for(i = 0; i < 10; i++) {
				for(int j = 1 ; j <= (10-i) ; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			System.out.println("--------");		
		
//		• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
			for(i = 1; i <= 6 ; i++) {
				for(int j = 1; j <= i ; j++) {
					System.out.print((char)('@'+ i));
				}
				System.out.println();
			}
			
			
	}
}
