package homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   while(true) {
	     try {
	    	System.out.println("請輸入x的值");
	    	int x = s.nextInt();
	    	
	    	System.out.println("請輸入y的值");
    	    int y = s.nextInt();
    	    
	    	Calculator c = new Calculator();
	    	c.setCal(x, y);
	    	System.out.printf("%d的%d次方等於%d",x,y,c.powerXY());
	    	s.close();
	    	break;
	    	
	     }catch(CalException e) {
	    	System.out.println(e.getMessage());
	    	
	     }catch(InputMismatchException e) {
	    	System.out.println("格式不正確");
	    	s.nextLine();
	     }
			 
	   }	 
		 
	  
	}
	
}
