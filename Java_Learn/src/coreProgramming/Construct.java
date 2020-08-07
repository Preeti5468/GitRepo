package coreProgramming;

public class Construct {

	public Construct()
	{
		this("abc",10,20);
		System.out.println("Default Constructor");
		
	}
	public Construct(float a)
	{
		this();
		System.out.println("1 Parameterized Constructor");
		
	}
	public Construct(String x, int a)
	{
		this(10);
		System.out.println("2 Parameterized Constructor");
		
	}
	public Construct(String x, int a, float b)
	{
		System.out.println("3 Parameterized Constructor");
		
	}
	public Construct(int a, int b, int c, int d)
	{
		this("abc", 10);
		System.out.println("4 Parameterized Constructor");
		
	}
	public static void main(String[] args) {
		
		new Construct(10,20,30,40);

	}

}
