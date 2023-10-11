package homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {

//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數,如圖:
//
//	(提示:Scanner)
//	(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
	   
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r =new Random();
		ArrayList<Integer> array = new ArrayList<Integer>();
		int[] number =new int[6];
		System.out.println("阿文，請你輸入不想要的數字(0~9)");
		int x = s.nextInt(),sum = 0,a ;
	    for (a = 1; a <= 49; a++) {
			if( a % 10 != x && a / 10 != x ) {
				System.out.print( a + "\t" );
				sum++;
				if(sum % 6 == 0) {
					System.out.println();
				}
				array.add(a);
			}
		}
	    System.out.println();
	    System.out.print("總共有" + sum +"個數字可以選，隨機提供6個號碼供參考");	
	    for (int i = 0; i < number.length; i++) {
	    	int index = r.nextInt(array.size());
	    	number[i] = array.remove(index);
	    	System.out.print(number[i] + " ");	
	    }
	    
		
		
	}	
	
}
