package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User{
   String id;
   String name;
   int age;

   public User(String id, String name, int age) {
      this.id = id;
      this.name = name;
      this.age = age;
   }

   @Override
   public String toString() {
      return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
   }
   
   
}

class Test{
   public String print(User user) {
      return user.toString();
   }
}

class MyClass{
	int num;

	public MyClass(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "MyClass [num=" + num + "]";
	}
	
	
}


public class Ex05 {
   public static void main(String[] args) {
      User[] users = {
            new User("aa", "김철수", 25),
            new User("bb", "홍길동", 22),
            new User("cc", "김영희", 28)
            };
      
      Map<String, Integer> map = Arrays.stream(users)
            .collect(Collectors.toMap(user -> user.name + "님", user -> user.age));
      
      System.out.println(map);
      
      String[] arStr = {"1", "2", "3", "4"};
      
//      메소드 참조
//      람다식이 하나의 메소드를 호출하는 경우에만 사용 가능하다.
//      불필요한 매개변수를 제거하고 사용할 수 있어서 람다식의 가독성을 높인다.
//      매개변수가 없거나 매개변수로 전달받은 값을 아무런 처리없이 바로 메소드에 넘겨준다면 메소드 참조가 가능
      
//      클래스명::메소드명 -> 스테틱 메소드를 참조하는 방법
//      int[] arInt = Arrays.stream(arStr).mapToInt(str -> Integer.parseInt(str)).toArray();
      int[] arInt = Arrays.stream(arStr).mapToInt(Integer::parseInt).toArray();
      
      Test t = new Test();
   
//      참조변수명::메소드명 -> 인스턴스 메소드를 참조하는 방법
      
      Arrays.stream(users).map(user->t.print(user)).forEach(str -> System.out.println(str));
      Arrays.stream(users).map(t::print).forEach(str -> System.out.println(str));
      
      
      List<Integer> list = List.of(1,2,3,4,5);
      
      List<MyClass> myList = list.stream()
//    		  .map(num -> new MyClass(num))
    		  .map(MyClass::new)  //생성자 참조
    		  .collect(Collectors.toList());
      
      System.out.println(myList);
      
   }
}























