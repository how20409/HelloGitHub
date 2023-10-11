package java1_practice;

public class Elephant extends Animal{

//	建立一個class，名為Elephant並延伸自Animal類別
//	• 此類別有一個成員變數為name(名字– 型別String)
//	• 此類別需宣告有參數的建構子
//	• 有一覆寫成員方法名為speak()，用來印出父類別的兩個成員變數和自己的成員變數
//	• 在main()裡透過建構子產生兩個物件：
//	- 其一為Animal，其年紀和體重分別為3歲、8.0公斤
//	- 另一為Elephant，其年紀、體重和種類名稱分別為8歲、1200.0公斤、大象
//	• 列印上述兩種Animal的值
	private String name;
	
	public Elephant(int age, float weight, String name) {
		super(age, weight);
		this.name = name;
	}
	
	public void speak() {
		super.speak();
		System.out.println("名字: " + name);
		
	}

}
