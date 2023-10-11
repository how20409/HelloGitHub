package java1_practice;

public class Student {
//	請新增一個Student類別，並宣告一個屬性為score，型別為int，另宣告兩
	 	int score = 80;
//	個方法分別為play()與study()，功能如下：
//	• public void play(int hours)
//	每休息一個小時，score就會減1
	 	public void play (int hours) {
	 		score -= hours;
	    }
//	• public void study(int hours)
//	每讀書一個小時，score就會加1
	 	public void study(int hours) {
	 		score += hours;
	 	}
//	• 該類別完成後，請在main方法裡創建兩個student物件，並藉由呼叫play()
//	與study()並取得分數是否正確
	 	public static void main(String[] args) {
	 		Student zoe = new Student();
	 		Student gordon = new Student();
		
	 		zoe.study(5);
	 		zoe.play(1);
	 		gordon.study(2);
	 		gordon.play(4);
	 		System.out.println(zoe.score);
	 		System.out.println(gordon.score);
		
		
		
		
	}
	
}
