package hero_app;

public class Operator {

	public static void main(String[] args) {
		int x = 10;
		//Unary Operator 1
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(--x);
		System.out.println(x--);
		//Unary Operator 2
		int a = 10;
		int y=12;
		System.out.println(a++ + ++a);
		
		boolean b = true;
		boolean c = false;
		System.out.println(~a); // ~ used to the value negative
		System.out.println(!c); // Opposite of the value. Mostly boolean
		System.out.println("========================********************======================");
		
		//Arithmetic Operator
		System.out.println("========================********************======================");
		
		//Left Shift Operator
		System.out.println(10<<2); //10*2^2
		
		//Right shift operator
		System.out.println(20>>2); //20/2^2
		
		
		//And Operator
		int z = 20;
		System.out.println(a<z && y<z);

	}

}
