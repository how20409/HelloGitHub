package homework;

import java.util.Scanner;

public class Homework4 {
	

//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
	public static void main(String[] args) {
		int a[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0, i ;
		 for ( i = 0; i < a.length;  i++) {
			sum += a[i];  
		 }
		int average = sum / a.length;
		System.out.println("平均值:" + average);
		System.out.print("大於平均值:");
		 for ( i = 0; i < a.length;  i++) {
			if (a[i] > average) {
				System.out.print(a[i] +" ");
			}	
		 }
		System.out.println();
		System.out.println("----------");
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		String words = "Hello World";
		char word[] = new char[words.length()];
		 for(i = (word.length -1) ; i >= 0 ;i--) {
			word[i] =words.charAt(i);
			System.out.print(word[i]);
		 }
		
		System.out.println();
		System.out.println("----------");
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
		String star[]=
			{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		sum = 0;
		
		 for( i = 0; i <star.length; i++) {
			for(int j = 0; j < star[i].length(); j++) {
				if(star[i].charAt(j) == 'a'|| star[i].charAt(j) == 'e' ||  star[i].charAt(j) == 'i'
				||star[i].charAt(j) == 'o' || star[i].charAt(j) == 'u') {
					sum++;
				}
		 	}
		 }System.out.println(sum);
		System.out.println("----------");		
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//			編號:25 => 2500
//			編號:32 => 800
//			編號:8  => 500 
//			編號:19 => 1000
//			編號:27 => 1200 
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
		Scanner enter = new Scanner(System.in);
		System.out.println("輸入小華欲借的金額");
		int number = enter.nextInt();
		System.out.println("有錢可借的員工編號:");
		sum = 0;
		int worker[][]= {{2500,800,500,1000,1200},{25,32,8,19,27}};
			for(i = 0; i < worker[0].length; i++) {
				if(number <= worker[0][i]) {
					sum++;
					System.out.print(worker[1][i]+" ");
				}
			}
		System.out.println("共"+ sum + "人");	
		System.out.println("----------");
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
//		閏年規則
//		西元年份除以4可整除，且除以100不可整除，為閏年。
//		西元年份除以400可整除，為閏年。
		int months[]= {0,1,2,3,4,5,6,7,8,9,10,11,12};
		int days[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("請輸入日期(yyyy-mm-dd");
		sum = 0;
		int year = enter.nextInt();
		 if((year % 4 == 0 && year % 100 != 0 )|| year % 400 == 0 ) {
				days[2]= 29;
		}
		int month =enter.nextInt();
		if(month < 1 || month > 12) {
			System.out.println("月份顯示錯誤");			
		}
		int day=enter.nextInt();
		if(day < 0 || day > days[month]) {			
			System.out.println("日期顯示錯誤");  
		} else {
			for(i = 0; i < month; i++) {
				sum += days[i];
		    }
			System.out.print("輸入的日期為該年第");
			System.out.println(sum + day +"天");		
		}	
		System.out.println("----------");
//		班上有8位同學,他們進行了6次考試結果如下:
//
//		請算出每位同學考最高分的次數
//		(提示:二維陣列)
		int[][] exam = {
		{10,35,40,100,90,85,75,70},
		{37,75,77,89,64,75,70,95},
		{100,70,79,90,75,70,79,90},
		{77,95,70,89,60,75,85,89},
		{98,70,89,90,75,90,89,90},
		{90,80,100,75,50,20,99,75}};

		int[] count = new int [8];
//		挑出最高分		
		for( i = 0 ; i < exam.length ; i++) {
			int maxscore =0;
			for(int j = 0 ; j < exam[i].length; j++) {
				if(exam[i][j] > maxscore) {
					maxscore =exam[i][j];
				}
			}
//		計算的次數
			for(int j = 0; j < count.length;j++) {
				if(exam[i][j] == maxscore) {
					count[j]++;
				}
			}	
		}
		for ( i = 0; i < count.length; i++) {
            System.out.println((i + 1) + "號同學考最高分的次數：" + count[i]);
        }
		
		
		
		
		
		
		
		
		
	}

}	
