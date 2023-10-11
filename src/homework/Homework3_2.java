package homework;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
//		2
//		• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
		
//		(提示:Scanner,亂數方法,無窮迴圈)
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		//System.out.println((int)(Math.random()*10));請系統隨機出個數//
		

		Scanner s =new Scanner(System.in);
		int x =(int)(Math.random()*101);
		System.out.println("Guess the number please enter");
		
		while(true) {
		int a =s.nextInt();
			if(x == a) {
				System.out.println("WIN");
			    break;
			}else if(x > a) {
				System.out.println("MORE");
			}else if(x < a) {
				System.out.println("LESS");	
			}
				
		}		
		
//		Scanner s =new Scanner(System.in);
//		int x =(int)(Math.random()*10);
//		System.out.println("Guess the number please enter");
//		
//		while(true) {
//		int a =s.nextInt();
//			if(x == a) {
//				System.out.println("WIN");
//			    break;
//			}else {
//				System.out.println("NO");
//			}			
//		}
	}
}
