package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class TrainTest {
//	 	並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//	 	需使用的集合裡
//		- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		- (118, “自強”, “高雄”, “台北”, 500)
//		- (1288, “區間”, “新竹”, “基隆”, 400)
//		- (122, “自強”, “台中”, “花蓮”, 600)
//		- (1222, “區間”, “樹林”, 七堵, 300)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		• 請寫一隻程式,能印出不重複的Train物件
//		• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//		• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
//		• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)
	public static void main(String[] args) {
//		• 請寫一隻程式,能印出不重複的Train物件
//		  老師解說:那種集合可以讓我們不重複，又要注意什麼事情

		Set<Train> train = new HashSet<Train>();

        Train t1 = new Train(202  ,"普悠瑪", "樹林", "花蓮", 400);
        Train t2 = new Train(1254 ,"區間"  , "屏東", "基隆", 700);
        Train t3 = new Train(118  ,"自強"  , "高雄", "台北", 500);
        Train t4 = new Train(1288 ,"區間"  , "新竹", "基隆", 400);
        Train t5 = new Train(122  ,"自強"  , "台中", "花蓮", 600);
        Train t6 = new Train(1222 ,"區間"  , "樹林", "七堵", 300);
        Train t7 = new Train(1254 ,"區間"  , "屏東", "基隆", 700);

        train.add(t1);
        train.add(t2);
        train.add(t3);
        train.add(t4);
        train.add(t5);
        train.add(t6);
        train.add(t7);
        
        //覆寫toString讓印出內容從"址"變內容
        //覆寫hasCode跟equals讓物件從比較"址"改成比較內容
        Iterator<Train> itrt = train.iterator();
	    while(itrt.hasNext()) {
	    	System.out.print(itrt.next() + "\n");
	    }
	    System.out.println();
//      • 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
        //老師解說:排順序，又要做些什麼處理?
	    List<Train> list2 = new ArrayList<Train>();
	    
	    list2.add(t1);
        list2.add(t2);
        list2.add(t3);
        list2.add(t4);
        list2.add(t5);
        list2.add(t6);
        list2.add(t7);
        
        Collections.sort(list2);//搭配sort方法排序

        for(int i = 0; i < list2.size() ; i++) {
	    	Object o = list2.get(i);
	    	System.out.print( o + "\n");
	    }
	    
	    System.out.println();
//      承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
        //老師解說:編號由大到小 不重複，需做什麼處理
	    Set<Train> list = new TreeSet<Train>();
        
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        list.add(t6);
        list.add(t7);
        
        //覆寫compare to，讓班次由大到小排序
        for(Object ob: list) {
	    	System.out.print( ob + "\n");
        }
        
	}

}
