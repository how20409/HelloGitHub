package java1_practice;

public class CubeTest {
	public static void main(String[] args) {
		try {
			Cube c = new Cube(2);
			c.setCube(-2);
			c.volume();
		}catch(CubeException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
}
