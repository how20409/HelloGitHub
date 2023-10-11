package java1_practice;

import java.util.Scanner;

public class TestBMI {
   public static void main(String[] args) {
    /*請建立一個TestBMI.java，並計算自己的BMI值後輸出，另加入判
	  斷結果為過瘦、正常或是過重
	• 提示一：BMI公式為體重(kg) / 身高2(m)
	• 提示二：BMI<18.5為過瘦，18.5≦BMI<24為正常、BMI≧24為過胖
	• 提示三：運算子+ if – else判斷*/
	 Scanner s = new Scanner(System.in);
	 System.out.println("請輸入體重");
      int weight =s.nextInt();
     System.out.println("請輸入身高");
	  float height =s.nextInt();
	  
	  double bmi = weight / (Math.pow((height/100), 2));
	 System.out.printf("BMI is %.2f %n", bmi);

	     if(bmi < 18.5) {
		     System.out.println("BMI過瘦");
	     }else if(bmi >= 24) {
		     System.out.println("BMI過胖");
	     }else {
		     System.out.println("BMI正常");
	  s.close();	     
	 }
   }
}
