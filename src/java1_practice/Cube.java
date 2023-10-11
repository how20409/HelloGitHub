package java1_practice;

public class Cube {
//	 請建立一個正立方體Cube.java檔案，並定義邊長屬性(double-length)，
//	 建構子(Constructor)與getter/setter方法
// • 產生一個cube物件並同時傳入邊長值，若是值為0或負數，則拋
//	 出自行定義的例外CubeException，並顯示「正立方體邊長不得
//	 為0或是負數」的訊息
// • 若是傳入邊長的值沒有問題，則顯示體積
	private double length;
	public Cube() {
		
	}
	
	public Cube(double length)throws CubeException{
		setCube(length);
	}
	
	public void setCube (double length) throws CubeException{
		if (length == 0 || length < 0)
			throw new CubeException("正立方體邊長不得為0或是負數");
		else {
			this.length = length;
		}
	}
	
	public double getCube() {
		
		return length;
	}
	
	public void volume() {
		
		System.out.println(Math.pow(length, 3));
	}
	
}
