package Java;

public class Java44 {
	
	public static void main(String[] args) {
		// Lab6
		// 6.1
		int i = 5;
		while (i <= 10) {
//			System.out.println(i);
			i++;
		}
		//6.2
		int sum = 0;
		for (int i1 = 1; i1 <= 10; i1++) {
			sum += i1;
//			System.out.println(sum);
		}
		//6.3
		for (int i2 = 1; i2 <= 100; i2++) {
			if (i2%12 == 0) {
//				System.out.println(i2);
			}
		}
		//6.4
		int[] a = {1,2,3,4,5};
		for (int a1 : a) {
//			System.out.println(a1);
		}
		//7.1
		int x = 20;
		do {
			x -= 1;
//			System.out.println(x);
		}while (x != 1);
		//7.2
		for (int x1 = 1; x1 <= 10; x1++) {
			if (x1%2 ==  0) {
//				System.out.println("Even");
			}else {
//				System.out.println("Odd");
			}
		}
		//8.1 a
		for (int count = 1; count <= 20; count++) {
		//8.1 b
			if (count == 11) {
				System.out.println(count);
				break;
			}
		}
		
	}
}
