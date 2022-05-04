import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Entrez le nombre de lignes du triangle (un entier) : ");
		int n = clavier.nextInt();
		
		for (int i=1; i<=n; ++i) {
			for (int j=1; j<=n-i; ++j) {
				System.out.print(" ");
			}
			for (int k=1; k<2*i; ++k) {
				System.out.print("*");
			}			
//			for (int j=1; j<=n-1; ++j) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
		clavier.close();
	}

}
