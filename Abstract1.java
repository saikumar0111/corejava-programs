abstract class A
{
	public static void test() 
	{
		System.out.println("test");
	}
	
	abstract public  void test1();
	
	
}
class B extends A
{
	public  void test1() 
	{
		System.out.println("test complted");
	}
	
	
	
}
class Abstract1
{
	public static void main(String[] agrs)
	{
		B b1=new B();
	    b1.test();
		b1.test1();
	}

}
