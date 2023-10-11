package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Homework7{
	
	public static void main(String[] args) {
//		請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//		Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
		File f = new File("C:\\CHA103_Workspace\\sample.txt");
		File f1 = new File("C:\\CHA103_Workspace\\hello.txt");
		File f2 = new File("C:\\CHA103_Workspace\\hello2.txt");
		Homework7 h = new Homework7();
		String str; 
		int count = 0, sum = 0;
		
		try {
			FileReader r = new FileReader(f);
			BufferedReader br = new BufferedReader(r);
			while ((str = br.readLine()) != null) {
				count++;
				sum += str.length();		 
			} 
			br.close();   
         	r.close();
         	
			System.out.println("檔案共有" + f.length() + "個位元組," +
                    sum + "個字元,"  + count + "列資料");
			
		}catch(IOException e) {
			
		}
		
//		請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 
//		(請使用append功能讓每次執行結果都能被保存起來)
		int[] number = new int [10];
		File date = new File("C:\\CHA103_Workspace\\Data.txt");
		try {
			FileWriter wr = new FileWriter(date,true);
			//建構子FileOutputStream(String name, boolean append)與建構子FileWriter(String fileName, boolean append)
//			- 當append = false時，新增的資料將覆蓋/取代原始資料(預設為false)
//			- 當append = true時，新增的資料將附加於原始資料之後
			BufferedWriter br = new BufferedWriter(wr);
			
			for(int i: number) {
				i= (int)(Math.random()*1000) +1;
				System.out.print(i + ", ");	
				br.write(i + ", ");
			}
			br.newLine();  // 換行，準備寫入下一次的資料
            br.close();	
            
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		h.copyFile(f1,f2);
	
	}	
//		請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,
//		第一個參數所代表的檔案會複製到第二個參數代表的檔案
		public int copyFile (File f1, File f2)  {
			int i = 0;
			try {
				FileReader r = new FileReader(f1);
				BufferedReader br = new BufferedReader(r);
				FileWriter fw = new FileWriter(f2);
				BufferedWriter bw = new BufferedWriter(fw);
				
				while ((i = br.read()) != -1) {
//					System.out.print((char)i);
					bw.write(i); //write(int c) Writes a single character.
			
				}
					br.close();
					r.close();
					bw.close();
					fw.close();
					
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			} 	
			
			return i;
		}
		
	
		
		
	
}
