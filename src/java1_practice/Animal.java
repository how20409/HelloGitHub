 package java1_practice;

public class Animal {
//	建立一個class，名為Animal.java
//	• 此類別有兩個成員變數分別為age(年紀- 型別int)、weight(體重- 型別float)
//	• 此類別需宣告有參數的建構子
//	• 有一成員方法名為speak()，用以列印上述兩個值
//	• 在main()裡藉由建構子產生一個Animal，同時初始化該物件的年紀和體重分別為2歲、5.0
//	公斤，並呼叫speak方法得到此Animal的成員變數值
	private int age;
	private float weight;
	public Animal(int age, float weight) {
		this.age = age;	
		this.weight = weight;
		setAge(age);
		setWeight(weight);
		
	}
	public void setAge(int age) {
		this.age = age;	
	}	
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getAge(int age) {
		return age;
	}
	
	public float getWeight(float weight) {
		return weight;
	}
	
	
	public void speak() {
		System.out.println("年紀: " + age);
		System.out.println("體重: " + weight);
	}
	
	
}
