package xxx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestRandom {
	public static void main(String[] args) {
		Set ran = new HashSet();
		
	    while(ran.size() != 6) {
		    int x =(int)(Math.random()*49) +1;
			ran.add(x);
		}
	    
	    Iterator it = ran.iterator();
	    while(it.hasNext()) {
	    System.out.print(it.next() + " ");
	    } 
	}
}
