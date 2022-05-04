public class Tables {

	public static void main(String[] args) {

		System.out.println("     Tables de multiplication");
		for (int i=2; i<=10; ++i) {
			System.out.println("\nTable de " + i + " :");
			for (int j=1; j<=10; ++j) {
				System.out.println("     " + i + " * " + j + " = " + i*j);
			}
		}
	}

}
