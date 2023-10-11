package homework;

import java.io.*;

public class Homework7_4 {
//	請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//	注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File date = new File("C:\\date");
		File obj = new File(date,"Object.ser");
		if(!date.exists()) {
			date.mkdir();
			if(!obj.exists()) {
				try {
					obj.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		Animal[] a = new Animal[4];
		a[0] = new Dog("Mark");
		a[1] = new Dog("Ken");
		a[2] = new Dog("May");
		a[3] = new Dog("Kitty");
		//以下是輸出
		FileOutputStream fos = new FileOutputStream(obj);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < a.length; i++)
			oos.writeObject(a[i]);
		oos.close();
		fos.close();
		
//		承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何
//		(請利用多型簡化本題的程式設計)
		
		//以下是輸入
		FileInputStream fis = new FileInputStream(obj);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(obj.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
		
	}
	

	
	
	
	
	
}

abstract class Animal implements Serializable {
  
	private static final long serialVersionUID = 1L;
//	protected String name;
//
//    public Animal(String name) {
//        this.name = name;
//    }

	protected abstract void speak();

}

class Cat extends Animal {
	
	protected String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
}


class Dog extends Animal{

	protected String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}

