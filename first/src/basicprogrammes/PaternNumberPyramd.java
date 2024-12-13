package basicprogrammes;

public class PaternNumberPyramd {
	public static void main(String[] args) {
//		1
//		12
//		123
//		1234
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) { 
//				System.out.print(j);
//			}
//			System.out.println();
//		}

//		1234
//		123
//		12
//		1
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}

//		1
//		23
//		456
//		78910
//		int k = 1;
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(k + " ");
//				k++;
//			}
//
//			System.out.println();
//		}

//		1
//		0 1
//		1 0 1
//		0 1 0 1
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				if ((i + j) % 2 == 0) {
//					System.out.print("1 ");
//				} else {
//					System.out.print("0 ");
//				}
//			}
//			System.out.println();
//		}

//		 1          
//	    212
//     32123
//    4321234 		
		for (int i = 1; i <= 4; i++) {
			for (int s = 1; s <= 4; s++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

//		*
//		**
//		***
//		****
//		***
//		**
//		*

	}
}
