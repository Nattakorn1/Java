package Java;

public class Java3 {

	public static void main(String[] args) {
		//3.1
			int i = 20;
			//3.1.1 a
			i++;
			i++;
			i++;
			i++;
			System.out.println(i);
			//3.1.1 b
			--i;
			--i;
			--i;
			--i;
			--i;
			System.out.println(i);
		//3.2
			float a = 1.1f;
			float b = 1.2f;
			if ((a == 1) && (b == 2)) {
				System.out.println("True");
			}
		//3.3
			char a1 = '\u0001';
			char b1 = '\u0023';
			if ((a1 == '\u5535') || (b1 == '\u0023')) {
				System.out.println("True");
			}
			

	}

}
