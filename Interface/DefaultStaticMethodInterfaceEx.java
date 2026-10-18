package Interface;

interface A{
	void m();
	default void xyz() {
		System.out.println("A-XYZ");
	}
	static void abc() {
		System.out.println("A-ABC");
	}
}
class X implements A{
	public void m() {
		System.out.println("Hi X");
		xyz();
		//abc();//error
		A.abc();
	}
}
class Y implements A{
	public void m() {
		System.out.println("Hi Y");
		xyz();
	}
}
public class DefaultStaticMethodInterfaceEx {
	public static void main(String[] args) {
		A a;
		a=new X();
		a.m();
		a.xyz();
		a=new Y();
		a.m();
		a.xyz();
		X x=new X();
		x.xyz();
		//x.abc();//error
		A.abc();
	}
}