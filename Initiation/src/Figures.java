public class Figures {

	public static void main(String[] args) {

		// a) de 1 à 9
		System.out.println("a)");
		for (int i=1; i<10; ++i) {
			System.out.print(i);
		}
		System.out.println();
		
		// b) 9 lines de a)
		System.out.println("b)");
		for (int i=1; i<10; ++i) {
			for (int j=1; j<10; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		// c) triangle
		System.out.println("c)");
		for (int i=1; i<10; ++i) {
			for (int j=1; j<=i; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		// d) triangle inversée
		System.out.println("d)");
		for (int i=1; i<10; ++i ) {
			for (int j=i; j<10; ++j) {
				if (j<9) System.out.print(" "); 
			}
			for (int k = 1; k<=i; ++k) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		// d) dans les corrigés
		System.out.println("d')");
		for (int i=1; i<=9; ++i) {
			for (int j=1; j<=(9-i); ++j) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; ++j) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
