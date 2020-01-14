package hero_app;

public class Variables 
{
	int d = 30; //instance variable outside method inside class
	static int e = 33; // Static variable, outside method, inside class
	public static void main(String[]args)
	{
		int a=10; //Local variable, inside class
		int b= 20;
		int c = a+b;
		float f = a; //Variable widening
		System.out.println("Sum of a and b is " + c);
		System.out.println("Value of f is " +f);
		
		
		//Type casting
		//Type casting, Narrowing
		double x = 10.45;
		int y=(int)x;
		System.out.println("Value of int y is " +y);
		
		//adding lower type
		byte r =10;
		byte q=20;
		byte p = (byte) (q+r);
		System.out.println("Value of byte p is " +p);
		
	}

}
