package coreProgramming;

public class Testcode {

	int d;
	int c;
	public void Testcode1()
	
	{ System.out.println("Total is: "+c);}
	
	public Testcode(int a, int x) {
		
		this.d=x;
		int b = 10;
		c = a+b+d;
		
	}
	
	public static void main(String[] args) {
		
		Testcode obj = new Testcode(10,30);
		obj.Testcode1();
		Testcode obj1 = new Testcode(20,40);
		obj1.Testcode1();
		
	}

	

}
