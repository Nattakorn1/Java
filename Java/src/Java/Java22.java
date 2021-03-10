package Java;

public class Java22 {

	public static void main(String[] args) {
		//2.2.1
		bark();
		//2.2.2	a
		float a = 1.2f;
		int a1 = (int) a;
		System.out.println(a1);
		//2.2.2 b
		int b = 1;
		float b1 = b;
		System.out.println(b1);
		//2.2.2 c
		double c = 1.1d;
		float c1 = (float) c;
		System.out.println(c1);
		//2.2.2 b
		char d = '\u0000';
		int d1 = d;
		System.out.println(d1);
		//2.2.3
		final String  hello = "Hello";
			//error due to assign
		
	
	}
	public static void bark(){
		String name = "Mumu";
		System.out.println("The dog name " + name + " bark");
	}

}
