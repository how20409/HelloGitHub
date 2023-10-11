package homework;

import java.util.Random;

public class Homework5_5 {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
	public static void main(String[] args) {
		genAuthCode();
	}
	public static void genAuthCode() {
	       Random ran = new Random();
	       String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	       char[] code = new char[8];
	       for (int i = 0; i < code.length; i++) {
	           int Index = ran.nextInt(words.length());//隨機從字串長度中挑選個數讓index變隨機索引
//	           System.out.print(Index+ " ");
	           code[i] =words.charAt(Index);
	          
	       }
	       String autoCode = new String(code); // 將字元改成字串
	       System.out.println("本次隨機產生驗證碼：" + autoCode);
			
	}
		


	
}

