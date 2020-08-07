package coreProgramming;

public class Const {

	public Const()
	{
		this(10,20,30,40);
		System.out.println("Default Constructor");
	}
	public Const(int a)
	{
		
		this();
		System.out.println("1 parameterised Constructor");
	}
	public Const(int a,int b)
	{
		
		this(10);
		System.out.println("2 parameterised Constructor");
	}
	public Const(int a, int b, int c)
	{
		this(10,20);
		System.out.println("3 parameterised Constructor");
	}
	public Const(int a, int b, int c, int d )
	{
		System.out.println("4 parameterised Constructor");
	}
	
	public static void main(String[] args) {
		new Const(1,2,3);

	}

}
