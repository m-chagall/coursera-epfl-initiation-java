import java.util.Scanner;

public class Classification {

	public static void main(String[] args) {

		int nombre;
		
		Scanner clavier = new Scanner(System.in); 
		
		System.out.print("Entrez un nombre entier: ");
		nombre = clavier.nextInt();
		
		
		System.out.print("Le nombre est ");
		if (nombre > 0) {
			System.out.print("positif ");
		}
		else if (nombre < 0){
			System.out.print("négatif ");
		}
		else {
			System.out.print("zéro ");
		}
		System.out.print("et ");
		
		// pair ou impair
		if (nombre == 0) {
			System.out.print("(et il est pair)");
		}
		else {
			if (nombre % 2 ==0) {
				System.out.println("pair");
			}
			else {
				System.out.println("impair");
			}
			
		}
		clavier.close();
		
	}

}
