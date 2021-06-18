class A{
	int x=10;
	static int y=10;
	private int z=10;
	void m1(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		B b1=new B();
		System.out.println(b1.h);
		b1.m2();
	}
	
	class B{
		int h=50;
		void m2(){
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(h);
		}
	}
}
	class Demo {
		public static void main (String s[]){
			System.out.println(A.y);
			A a=new A();
			System.out.println(a.x);
			a.m1();
			A.B b= a.new B();
			System.out.println(b.h);
		}
	}
	
	
		