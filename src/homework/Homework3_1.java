package homework;

import java.util.Scanner;

public class Homework3_1 {
//	1
//	請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:
	
//	(提示:Scanner,三角形成立條件,判斷式if else)
//	(進階功能:加入直角三角形的判斷)
	
//    正三角質:a=b=c
//	等腰三角形:(a=b)>c && (a=b)!=c
//	其他三角形:a+b>c && b+c>a && c+a>b 
//	不是三角形:!=(a+b>c && b+c>a && c+a>b)
//  直角三角形: a^2+b^2=c^2	
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		System.out.println("請輸入三個數字");
		int a =s.nextInt(), b =s.nextInt(), c =s.nextInt();
		
		if((a+b)>c && (b+c)>a && (c+a)>b  ) {
			if(a==b && b==c) {
				System.out.println("正三角形");
		    }else if(a==b || b==c || c==a){
		    	System.out.println("等腰三角形");
		    }else if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b ){
		    	System.out.println("直角三角形");
		    }else {
		    	System.out.println("其他三角形");
		    }
		}else {
			System.out.println("不是三角形");
		}
	}
}
