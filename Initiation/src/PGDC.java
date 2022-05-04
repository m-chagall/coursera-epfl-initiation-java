import java.util.Scanner;

// Il existe une solution dite récursive du calcul du PGDC un peu plus intuitive à écrire.

public class PGDC {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int a, b;
		int pgdc;
		
		System.out.print("Entrez un nombre positif : ");
		a = clavier.nextInt();
		System.out.print("Entrez un nombre positif : ");
		b = clavier.nextInt();
		
		int c=a, d=b;
		while (c != d) {
			if (c > d) {
				c -= d;
			}
			else if (c < d) {
				d -= c;
			}
		}
		pgdc = c;
		System.out.println("Le plus grand diviseur commun de " + a + " et " + b + " est " + pgdc);
		clavier.close();
	}

}
