package Java;

public class Java45 {
	
	public static void main(String[] args) {
		//Lab 9
		//9.1 a
		for (int count = 1; count <= 20; count++) {
			//2.1 b
				if (count == 11) {
					//9.1 c
					System.out.println(count);
					continue;
				}
		}
		//10.1
		for (int lopp = 1; lopp <= 10; lopp++) {
			//2.1 b
				if (lopp == 2) {
					//9.1 c
					continue;
				}
				System.out.println(lopp);
		}
		
	}
}
