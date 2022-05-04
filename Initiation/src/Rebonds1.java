

import java.util.Scanner;

public class Rebonds1 {

	public static void main(String[] args) {

		Scanner clavier = new Scanner(System.in);
		
		final double g = 9.81;

		double eps = 0;
		double h0 = 0;
		int nbr = 0;
		double v = 0;
		double v1 = 0;
		double h = 0;
		double h1 = 0;
		
//		System.out.print("Entrez la valeur de l'hauteur initiale (H0), (H0 >= 0): ");
//		h0 = clavier.nextDouble();
//		System.out.print("Entrez la valeur du coéfficient de rebond (eps), (0 <= eps < 1): ");
//		eps = clavier.nextDouble();
//		System.out.print("Entrez la valeur du nombre de rebonds (NBR), (NBR >= 0): ");
//		nbr = clavier.nextInt();
		
		do {
			System.out.print("Entrez la valeur de l'hauteur initiale (H0), (H0 >= 0): ");
			h0 = clavier.nextDouble();
		} while (h0 < 0);
		do {
			System.out.print("Entrez la valeur du coéfficient de rebond (eps), (0 <= eps < 1): ");
			eps = clavier.nextDouble();
		} while ((eps < 0) || (eps > 1));
		do {
			System.out.print("Entrez la valeur du nombre de rebonds (NBR), (NBR >= 0): ");
			nbr = clavier.nextInt();
		} while (nbr < 0);
		
		h = h0;
		for (int i=0; i<nbr; ++i) {
			v = Math.sqrt(2 * h * g);
			v1 = eps * v;
			h1 = (v1 * v1) / (2 * g);
			h = h1;
//			 System.out.println("le nombre de rebond : " + (i+1));
//			 System.out.println("l'hauteur actuelle : " + h);
		}
		System.out.println("La hauteur: " + h);
		
		clavier.close();
	}

}
