package homework;

import java.text.*;
import java.util.*;

public class Homework10_3 {
//	• 請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成
//	(1)年/月/日(2)月/日/年(3)日/月/年三選一,
//	而輸入非指定日期數字格式會顯示出提示訊息如圖
//	(提示:TestFormatter.java, Java API文件,判斷格式可用正規表示法)
	public void dateFormat() {
	    boolean isright = false;
	    boolean keepgoing3 = false;
	    boolean keepgoing4 = false;
	    String ans;
 	    GregorianCalendar cal = new GregorianCalendar();
	    Scanner sc = new Scanner(System.in);
	    String dateRegex = "^(\\d{4}(0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))" +
                  	       "|(\\d{4}(0[469]|11)(0[1-9]|[12]\\d|30))" +
                               "|(\\d{4}(02)(0[1-9]|1\\d|2[0-9]))$";
	    while(!isright) {
		try {
		    System.out.print("請輸入日期(年月日,例如:20110131):");
		    String date = sc.next();		
		    int year = Integer.parseInt(date.substring(0,4));
		    int month = Integer.parseInt(date.substring(5,6));
		    int day = Integer.parseInt(date.substring(6,8));
		    if (!date.matches(dateRegex)){
			System.out.println("日期格式不正確，請再輸入一次!");
		    }else if(month == 2  && day == 29  && !cal.isLeapYear(year)){
			System.out.println("非閏年2月只有28天!");	
		    }else {
			isright = true;
			System.out.print("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:");
			while(!keepgoing3){
			    String choose = sc.next();
			    if(choose.matches("^[123]$")){
			        keepgoing3 = true;
				try {
				    switch(choose) {
					case "1":
					    SimpleDateFormat dfm1 = new SimpleDateFormat("yyyy/MM/dd");
					    Date d1 = new SimpleDateFormat("yyyyMMdd").parse(date);
				            System.out.println("年/月/日:"+ dfm1.format(d1));
				            break;
					case "2":
					    SimpleDateFormat dfm2 = new SimpleDateFormat("MM/dd/yyyy");
					    Date d2 = new SimpleDateFormat("yyyyMMdd").parse(date);
				            System.out.println("月/日/年:" + dfm2.format(d2));
				            break;
					case "3":
					    SimpleDateFormat dfm3 = new SimpleDateFormat("dd/MM/yyyy");
					    Date d3 = new SimpleDateFormat("yyyyMMdd").parse(date);
				            System.out.println("日/月/年:" + dfm3.format(d3));
				            break;
				                        
				    }  
				}catch(ParseException e) {
				    e.printStackTrace();
				}
		            }else {
			        System.out.println("輸入錯誤，請選擇數字(1~3)!");
		            } 
	                 }

	                 System.out.println("是否繼續第3題，請輸入Y/N");
			 while(!keepgoing4){
			    ans = sc.next();
			    if(ans.matches("^[Yy]$")) {
				keepgoing3 =false;
				isright=false;
				break;
			    }else if(ans.matches("^[Nn]$")) {
		                keepgoing3 =true;
		                break;
			    }else{
				System.out.println("輸入錯誤，請選擇Y或N!");				
				keepgoing4 = false;
			    }
			 }
					
		    }
		  
		}catch(StringIndexOutOfBoundsException e) {
		    System.out.println("格式不正確，請再輸入一次!");
		}catch(NumberFormatException e) {
	            System.out.println("格式不正確，請再輸入一次!");
	        }

	    }	
	    sc.close();
	}
	
	public static void main(String[] args) {
		Homework10_3 h = new Homework10_3();
		h.dateFormat();
		System.out.println("The End!");
	}
}
