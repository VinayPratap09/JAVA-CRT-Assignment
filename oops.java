class employee
{
	static{
		System.out.println("BASICS OOPS CONCEPT");
	}
private String name;
private int age;
static private String inst="incapp";
void input(String n,int a)
{name=n;
age=a;
}
void show(){
	System.out.println(name);
	System.out.println(age);
	System.out.println(inst);
}}
class demo {
	public static void main (String s[]){
	employee a=new employee();
	employee b=new employee();	
    employee c=new employee();
	a.input("Vinay",19);
	b.input("Pratap",20);
	c.input("Singh",21);
	a.show();
	b.show();
	c.show();
	}
}
	