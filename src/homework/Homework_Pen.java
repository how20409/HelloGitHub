package homework;

public class Homework_Pen{
	public static void main(String[] args) {
		Pen p = new Pencil();
		Pen i = new Inkbrush();
		System.out.println(p.getPrice(30));
		p.write();
		System.out.println(i.getPrice(40));
		i.write();
	}
}

abstract class Pen {
//	建立父類別Pen
//	• (1) 兩個屬性：品牌(brand)、價格(price) (封裝設計)
	private String brand;
	private int price;
//	• (2) 建構子設計：一個無參數與一個根據屬性而設計
	public Pen() {
		
	}
	public Pen(String brand, int price) {
		setPen(brand, price);
		
	}
//	• (3) 定義Getter/Setter方法
	public void setPen(String brand, int price) {
		getPrice(price);
		getBrand(brand);
		
	}
	
	public int getPrice(int price) {
		return price;
	}
	
	public String getBrand(String brand) {
		return brand;
	}
//	• (4) 宣告一個抽象方法write()
	public abstract void write();
}
//• 建立兩個子類別Pencil與InkBrush繼承Pen父類別
//• (1) 實作方法：Pencil輸出為削鉛筆再寫，InkBrush為沾墨汁再寫
//• (2) Pencil實際售價為定價8折，InkBrush為定價9折
//• (3) 多型操作，當共同呼叫write()方法與getPrice()方法，各種筆都可正確顯示write內容與售價金額
class Pencil extends Pen{
	public int getPrice(int price) {
		int pencil = (int)(price * 0.8);
		return pencil;
	}
    public void write() {
		System.out.println("削鉛筆再寫");
		return;
	}
}

class Inkbrush extends Pen{
	public int getPrice(int price) {
		int inkbrush = (int)(price * 0.9);
		return inkbrush;
	}
	public void write() {
			System.out.println("沾墨汁再寫");
			return;
	}
}

