package inner;

public class Main {
	public static void main(String[] args) {
		Outer o = new Outer();
		
		o.instanceVar =3;
		
		Outer.InstanceInner ii = o.new InstanceInner();
		
		Outer.StaticInner si = new Outer.StaticInner();
	}
}
