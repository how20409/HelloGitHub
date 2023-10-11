package java1_practice;

public class AnimalTest {
//	在main()裡藉由建構子產生一個Animal，同時初始化該物件的年紀和體重分別為2歲、5.0
//	公斤，並呼叫speak方法得到此Animal的成員變數值
	public static void main(String[] args) {
		Animal gordon = new Animal(2,5.0f);
		gordon.speak();
		
//		• 在main()裡透過建構子產生兩個物件：
//		- 其一為Animal，其年紀和體重分別為3歲、8.0公斤
//		- 另一為Elephant，其年紀、體重和種類名稱分別為8歲、1200.0公斤、大象
//		• 列印上述兩種Animal的值	
		Animal a1 = new Animal(3, 8.0f);
		Animal e1 = new Elephant(8, 1200.0f, "David");
		
		a1.speak();
		e1.speak();
		
		
		
//		Animal a1 = new Animal(2, 5.0f);
//		a1.speak();		
//狀況題:		
//		System.out.println("=== 時光飛逝 歲月如梭, 轉眼三年過去了... ===");
			
//		a1.age = 5; // 修飾子是private不能直接呼叫
//		a1.weight = 25.0f; // 修飾子是private不能直接呼叫
		
//		a1.Animal(5, 25.0f);//建構子只能呼叫一次
		
//		a1 = new Animal(5, 25.0f); //這是在建立一個新的物件了跟原本的不一樣
//		a1.speak();
		
//		a1.setAge(5); // 要用set傳入資料，再用speak印出
//		a1.setWeight(25.0f);
//		a1.speak();				
		
		
	}
}
