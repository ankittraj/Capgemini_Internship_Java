package Interface;

interface M{
	void m();
	private void mno() {
		System.out.println("Hi MNO");
	}
	private static void pqr() {
		System.out.println("Hi PQR");
	}
	default void xyz() {
		System.out.println("Hello -XYZ");
		mno();
		pqr();
	}
	static void abc() {
		System.out.println("Hello -ABC");
		//mno();//error
		pqr();
	}
}
class N implements M{
	public void m() {
		System.out.println("Hi N");
		//mno();//error
		xyz();
	}
}
public class PrivateMethodInterfaceEx {
	public static void main(String[] args) {
		M m=new N();
		m.m();
		m.xyz();
		M.abc();
		//M.pqr();//error
	}
}