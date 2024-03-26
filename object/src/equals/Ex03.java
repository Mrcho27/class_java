package equals;

import java.util.Objects;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if(this==obj) {return true;}
//		
//		if(obj instanceof Person) {
//			Person other = (Person)obj;
//			
//			if(this.age != other.age) {return false;}
//			if(this.name.length()== other.name.length()) {
//				
//				for(int i=0; i<this.name.length(); i++) {
//					if(this.name.charAt(i) != other.name.charAt(i)) {
//						return false;
//					}
//				}
//				return true;
//			}
//		}
//		
//		return false;
//	}
//}
//	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this==obj) {return true;}
//		
//		if(obj instanceof Person) {
//			Person other = (Person)obj;
//			
//			if(this.age != other.age) {return false;}
//			return this.name.equals(other.name);
//	}
//		return false;
//}


//@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Person p1 = new Person("철수",22);
		Person p2 = new Person("영희",22);
		Person p3 = new Person("철수",22);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
	}
}

