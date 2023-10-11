package homework;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Homework8 {
//	    • 請建立一個Collection物件並將以下資料加入:
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
//
//		• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//		• 移除不是java.lang.Number相關的物件
//		• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
	public static void main(String[] args) {
		Object obj = new Object();
		short s = Short.parseShort("100");
		long l = Long.parseLong("1000");
		BigInteger b = BigInteger.valueOf(l);
	    Collection<Object> data = new ArrayList<Object>();
	    data.add(new Integer(100));
	    data.add(new Double(3.14));
	    data.add(new Long(21L));
	    data.add(s);
	    data.add(new Double(5.1));
	    data.add("Kitty");
	    data.add(new Integer(100));
	    data.add(obj);
	    data.add("Snoopy");
	    data.add(l);
	    
	    
	    Iterator itrt = data.iterator();
	    while(itrt.hasNext()) {
	    	System.out.print(itrt.next() + ", ");
	    }
	    System.out.println("\n-----------------");
	    for(int i = 0; i < data.size() ; i++) {
	    	Object o = ((ArrayList<Object>) data).get(i);
	    	System.out.print( o + ", ");
	    }
	    System.out.println("\n-----------------");
	    for(Object ob: data) {
	    	System.out.print( ob + ", ");
	    }
	    System.out.println("\n-----------------");
	    
	    
	        // • 移除不是java.lang.Number相關的物件
	 		Iterator it2 = data.iterator();
	 		while(it2.hasNext()) {
	 			if(!(it2.next() instanceof Number)) {
	 				it2.remove();
	 			}
	 		}
	 		// • 再次印出這個集合物件的所有元素，
	 		//   觀察是否已將非Number相關的物件移除成功
	 		it2 = data.iterator();
	 		while(it2.hasNext()) {
	 			System.out.print(it2.next() + ", ");
	 		}	
	}



	
	
}
