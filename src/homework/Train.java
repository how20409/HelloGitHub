package homework;

import java.util.ArrayList;
import java.util.Objects;



public class Train  implements Comparable<Train>{
//	      請設計一個Train類別,並包含以下屬性T:
//		- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//		- 目的地 dest,型別為String - 票價 price,型別為double
//	      設計對應的getter/setter方法
	private int number;
    private String type, start, dest;
    private double price;
    //1.票價不能 < = 0
    //2.目的地不能等同於出發地
    //3.班次號碼不可為負數
	public Train() {
		super();
		
	}

	public Train(int number, String type, String start, String dest, double price) {
		if(number <= 0) {
			throw new IllegalArgumentException("班次號碼不可為負數");
		} else {
			this.number = number;
		}
		this.type = type;
		this.start = start;
		if (start.equals(dest)) {
            throw new IllegalArgumentException("目的地不可與出發地相同");
        } else {
            this.dest = dest;
        }
		if(price <= 0) {
			throw new IllegalArgumentException("票價不可為負數");
		} else {
			this.price = price;;
		}
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		assert this.number > 0.0 : "班次號碼不可為負數";
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		if (start.equals(dest)) {
            throw new IllegalArgumentException("目的地不可與出發地相同");
        } else {
            this.dest = dest;
        }
	}   

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
			assert this.price > 0.0 : "票價不可為負數";
			this.price = price;
			
	}
	
	@Override
    public String toString() {
		 return "班次: "      + getNumber() +
                "\t 車種: "   + getType() +
                "\t 出發地: " + getStart()+
                "\t 目的地: " + getDest() +
                "\t 票價: "   + getPrice() ;
    }

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	@Override
	public int compareTo(Train train) {
		//物件本身與 train 相比較，如果 return 正值，就表示比 train 小
		if (this.number < train.number) {
			return 1;
		} else if(this.number == train.number) {
			return 0;
		}else {	
			return -1;
		}//回傳正負值，用來代表兩者之間的"左右關係"
	}


	
}
