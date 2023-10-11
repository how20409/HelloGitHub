package java1_practice;

public class TestTwoDimArray {
//	請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，
//	再將結果顯示於螢幕上
//	• x和y陣列中的數字：
//	• 請用亂數產生介於0～30之間的整數
//	• 亂數之取得可參考java.lang.Math的靜態方法random()
//	• public static double random()
//	．傳回亂數值其範圍為0.0～1.0
	public static void main(String[] args) {
		TestTwoDimArray ran = new TestTwoDimArray();
		int[][] x = ran.setArray();
		int[][] y = ran.setArray();
		int[][] z = new int[3][3];
		for(int i = 0; i < z.length; i++) {
			for(int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
	    ran.printArray(x);
		ran.printArray(y);
		ran.printArray(z);
		
	}
	
	public int[][] setArray(){
		int[][] date = new int [3][3];
		int[][] print = new int [3][3];
		for(int i = 0; i < date.length; i++) {
			for(int j = 0; j < date[i].length; j++) {
				int r = (int) (Math.random()*31);
				date[i][j] = r;
			}
		
		}
		return date;
	}
	
	public void printArray(int[][] xxx) {
		for(int i = 0; i < xxx.length; i++) {
			for(int j = 0; j < xxx[i].length; j++) {
				System.out.print(xxx[i][j] + "\t");
			}
			System.out.println();
		}	
		System.out.println("------------------");

	}
	
	
	
}


