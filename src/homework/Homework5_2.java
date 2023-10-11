package homework;

public class Homework5_2 {
//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	public static void main(String[] args) {
		System.out.println("本次亂數結果:");
		ranAvg();
	
	}
	public static void ranAvg() {
		int count = 0;
		int[] random =new int[10];
		for(int i = 0; i <random.length ; i++) {
			random [i] = (int)(Math.random()*101);
			System.out.print(random[i] + " ");
			count +=random[i];
		}
		System.out.println();
	    System.out.println(count/random.length);
	}
}
