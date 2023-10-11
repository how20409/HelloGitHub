package homework;

public class Homework1 {
	public static void main(String[] args) {
//	•請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 6, b = 12 ;
		System.out.println("1.");
		System.out.printf("和 is %d %n積 is %d%n",a+b,a*b);
		System.out.println("--------");
	
//	• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs = 200;
		System.out.println("2.");
		System.out.println(eggs/12 + "打" + eggs%12 + "顆");
		System.out.println("--------");
	
//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec= 256559, min= 60, hour= 60*min, day= 24*hour;
		int extrahour =sec%day, extramin= extrahour%hour,extrasec=extramin%min;
		int d=sec/day, h= extrahour/hour, m=extramin/min, s=extrasec;
		System.out.println("3.");
		System.out.printf("%d天%d小時%d分%d秒%n",d,h,m,s);
	
//	• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final float PI = 3.1415f;
		int radius = 5; 
		float area = (float)(Math.pow(radius,2)*PI), circum=(float)(radius*2*PI);
		System.out.println("4.");
		System.out.printf("圓面積is %.3f%n圓周長is %.3f%n",area,circum);
		System.out.println("--------");
	
//	• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,
//	  本金加利息共有多少錢 (用複利計算,公式請自行google)*/
		
//	     複利公式為：A = P * (1 + r/n)^(n*t)， 其中：
//           A = 最終金額（包括本金和利息）
//           P = 初始本金（Principal）
//           r = 年利率（以小數表示，例如5%表示為0.05）
//           n = 計息次數（每年計息的次數）
//           t = 投資年限（以年為單位）
		int n = 1, t = 10;
		double P = 1.5e+6, r = 0.02, square = Math.pow(( 1 + r/n), (n*t));
		System.out.println("5.");
		System.out.println((int)(P * square));
		System.out.println("--------");
	
//	• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//	    5 + 5
//	    5 + ‘5’
//	    5 + “5”
//	  並請用註解各別說明答案的產生原因
		
		System.out.println("6.");
		System.out.println(5 + 5);
//		   5沒有單引號或雙引號，所以是數字相加，是5+5=10。
		System.out.println(5 + '5');	
//	 	   5加上單引號是字元，所以'5'是特殊字元，換算成unicode碼是0035(unicode碼是十六進位)，
//		   35(十六進位)換算成十進位是53(Java會自動換算成人類習慣使用的十進位)，算法是3*16+5=53。
//		   所以這題是5+53=58。
   
		System.out.println(5 + "5");
//		   5加上雙引號是字串(String)，遇到字串會直接變串接相加。所以結果會呈現是55。
	 
	}

}