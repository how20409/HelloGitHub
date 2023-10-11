package java1_practice;

public class Test4Numbers {
//	請建立一個Test4Numbers.java，可輸出0～100裡4的倍數
    public static void main(String[] args) {   
    	
//  for 迴圈	
        for(int f = 0; f <= 100 ; f += 4) {
        	System.out.print(f + " ");
        }
           
    System.out.println();
      
//  while 迴圈
        int w = 0;
        while(w <= 100) {
        	System.out.print(w + " ");
    	    w += 4 ;
       }
        
    System.out.println();
    
//  do while 迴圈
        int d = 0;
        do {
        	System.out.print(d + " ");
        	d += 4;
        }while(d <=100);
        
    System.out.println(); 
       
    }

}

