package inner;

public class Outer {
	int instanceVar;
	static int staticVar;
	
	class InstanceInner{
		
	}
	
	static class StaticInner{
		
	}
	
	void instanceMethod() {
		int localVar;
		
		class LocalInner{
			
		}
	}
	
}
