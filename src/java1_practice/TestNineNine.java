package java1_practice;

public class TestNineNine {
	public static void main(String[] args) {
//		請建立一個TestNineNine.java程式，可輸出九九乘法表
//		• 一：使用for迴圈+ while迴圈	
		System.out.println("一：使用for迴圈+ while迴圈");
			for(int f = 1; f <= 9; f++) {
				int w = 1;
				while(w <= 9) {
					System.out.printf("%d*%d=%d\t",f,w,f*w);
					w++;
				}
				System.out.println();
			}
		 System.out.println("----------------------------------------");
//		• 二：使用for迴圈+ do while迴圈
		 System.out.println("二：使用for迴圈+ do while迴圈");
		 	for(int f = 1; f <= 9; f++) {
		 		int d = 1;
		 		do {
		 			System.out.printf("%d*%d=%d\t",f,d,f*d);
		 			d++;
		 		}while(d <= 9);
		 		System.out.println();
		 	}
		
		System.out.println("----------------------------------------");
//		• 三：使用while迴圈+ do while迴圈
		System.out.println("三：使用while迴圈+ do while迴圈");
			int w = 1; 
			while(w <= 9) {
				int d =1;
				do { 
					System.out.printf("%d*%d=%d\t",w,d,w*d);
					d++;
				}while(d <= 9);
				System.out.println();
				w++;
			}
		
	}
}
