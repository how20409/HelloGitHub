package java1_practice;

public class Triangle {
    // 正三角形_1
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			  for(int j = 1; j <= i; j++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		System.out.println();
	// 正三角形_2	
		for(int i = 0; i < 5; i++) {
			int j;
			for( j = 1; j < (5-i); j++) {
				System.out.print(" ");
			}
			for(int n = i; n >= 0; n--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	// 倒三角形_1
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
    // 倒三角形_2
		int n = 5; // 控制行數，這裡使用 5 行
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "); // 輸出空格，實現右側位移
            }
            for (int k = i; k < n; k++) {
                System.out.print("*"); // 輸出星號
            }
            System.out.println(); // 換行
        }
		
		
	}
	  
}
