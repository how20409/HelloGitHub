package xxx;

import java.util.Scanner;

public class Test123 {
	
	    public static void main(String[] args) {
	    	String enter = "^[A-Z][1-2]\\d{8}$";
	        Scanner sc = new Scanner(System.in);
	        String id =(sc.next()).toUpperCase();
	        
	        if(id.matches(enter)) {
	        	System.out.println("OK");
	        }else {
	        	System.out.println("NO");
	        }
	        

	        sc.close();
	    }
	
}
