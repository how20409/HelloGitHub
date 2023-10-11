package homework;

import java.util.Scanner;

public class Homework5_1 {
//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:
	
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int width = enter.nextInt();
		int height = enter.nextInt();
		setInteger(width,height);
		starSquare(width,height);
	}
	public static void setInteger(int width, int height) {
		if (width < 0) {
			System.out.println("寬度需大於0，請確認");
		}
		if (height < 0) {
			System.out.println("高度需大於0，請確認");	
	    }
	}	
	//印出矩形星星
	public static void starSquare(int width ,int height) {
		for(int i = 1 ; i <= height ; i++) {
			for(int j =1 ; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
