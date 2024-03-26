package date;
class MySingleton{
	   private int number;
	   private static MySingleton instance;
	   
	   private MySingleton() {}
	   
	   public static MySingleton getInstance() {
	      if(instance == null   ) {
	         instance = new MySingleton();
	      }
	      
	      return instance;
	   }

	   public int getNumber() {
	      return number;
	   }

	   public void setNumber(int number) {
	      this.number = number;
	   }
	   
	   
	}

public class SingletonTest {
	public static void main(String[] args) {
		MySingleton ms1 = MySingleton.getInstance();
	      MySingleton ms2 = MySingleton.getInstance();
	      
	      System.out.println(ms1);
	      System.out.println(ms2);
	      
	      ms1.setNumber(100);
	      
	      System.out.println(ms1.getNumber());
	      System.out.println(ms2.getNumber());

	}
}
