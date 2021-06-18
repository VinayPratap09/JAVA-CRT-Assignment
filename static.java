class A{
	private int a;
	static String s="ABC";
	void show(){
		System.out.println(a+" "+s);
	}
	A(int k,String y){
		a=k;
		s=y;
	}
	static {
		System.out.println("Start");
	}
}
class start{
	public static void main(String s[]){
		A a=new A(10,"vinay");
		A b=new A(20,"Pratap");
		a.show();
		b.show();
	}
}
	