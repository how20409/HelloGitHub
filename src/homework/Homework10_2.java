package homework;

import java.text.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework10_2 {
//	• 請設計一隻程式,讓使用者可以輸入一個任意數後,可以選擇要以下列何種表示方法顯示
//	(1)千分位(2)百分比(3)科學記號,而輸入非任意數會顯示提示訊息如圖 
//	(提示: TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
//	• 補充 (依此類推):
//	輸入12345,千分位為12,345,輸入123,千分位為123
//	輸入0.75,百分比為75%,輸入1,結果為100%
	public void numberFormat() {
		Scanner sc = new Scanner(System.in);
		boolean isRight = false;
		boolean keepgoing = false;
		boolean keepgoing2 = false;
		String ans;
		
		while(!keepgoing){
		    try {
			System.out.print("請輸入數字:");
			double number = sc.nextDouble();
			System.out.print("欲格式化成(1)千分位(2)百分比(3)科學記號:");
			while(!isRight){
			    String choose = sc.next();
			    if(choose.matches("^[123]$")) {
				isRight = true;
				switch(choose) {
				    case "1":
					NumberFormat A1 =NumberFormat.getNumberInstance();
		                        System.out.println("千分位:" + A1.format(number));
		                        break;
				    case "2":
					NumberFormat A2 =NumberFormat.getPercentInstance();
		                       	System.out.println("百分比:" + A2.format(number));
		                       	break;
				    case "3":
					NumberFormat A3= new DecimalFormat("0.#####E0");
					String number3 = A3.format(number);
					System.out.println("科學記號:" + number3);
		                        break;
				}
			    }else {
				System.out.println("輸入錯誤，請選擇數字(1~3)!");
			    }
			}
				
			System.out.println("是否繼續第2題，請輸入Y/N");
			while(!keepgoing2) {
			    ans = sc.next();
			    if(ans.matches("^[Yy]$")) {
				keepgoing =false;
				isRight=false;
				break;
			    }else if(ans.matches("^[Nn]$")) {
	                    	keepgoing =true;
	                   	break;
			    }else{
				System.out.println("輸入錯誤，請選擇Y或N!");			
				keepgoing2 = false;
			    }
			}
				
		    }catch(InputMismatchException e){
			System.out.println("格式不正確，請再輸入一次!");
			sc.next();
		    }
		}
		 
	     sc.close();											
	}	

	public static void main(String[] args) {
		Homework10_2 h = new Homework10_2();
		h.numberFormat();
		System.out.println("The End!");
	}
}
