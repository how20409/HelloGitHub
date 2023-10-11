package homework;

public class Homework5_3 {
//	利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳,如圖:
	public static void main(String[] args) {
		int[][] iArray = {{1,6,3},{9,5,2}};
		double [][] dArray =  {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
	    work w =new work();
	    System.out.println(work.maxElement(iArray));
	    System.out.println(work.maxElement(dArray));
	}
}


class work{
	public static int maxElement(int x[][]) {
		int max = 0;
    	for(int i = 0; i < x.length; i++) {
  		   max =x[0][0];
  		   for(int j = 0 ; j < x[i].length; j++) {
  			  if (x[i][j] > max) {
  				max =  x[i][j]; 
  			  }
  		   }
    	}
		return max;
    }
    public static double maxElement(double x[][]) {
    	double max = 0 ;
    	for(int i = 0; i < x.length; i++) {
  		  max =x[0][0];
  		  for(int j = 0 ; j < x[i].length; j++) {
  			  if (x[i][j] > max)
  				  max =  x[i][j];
  		  }
  		  
    	}
    	return max;
    }
	
	
}  
	

