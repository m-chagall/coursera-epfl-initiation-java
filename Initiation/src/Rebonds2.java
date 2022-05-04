

import java.util.Scanner;

public class Rebonds2 {

	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		final double g = 9.81;

		double eps;
		double h0;
		double h_fin;

		int nbr = 0;
		double v = 0;
		double v1 = 0;
		double h = 0;
		double h1 = 0;

		
//		System.out.print("Entrez la valeur de l'hauteur initiale (H0), (H0 >= 0): ");
//		h0 = clavier.nextDouble();
//		System.out.print("Entrez la valeur du coefficient de rebond (eps), (0 <= eps < 1): ");
//		eps = clavier.nextDouble();
//		System.out.print("Entrez la valeur de l'hauteur finale désirée (H_FIN), (0 < h_fin < h0): ");
//		h_fin = clavier.nextDouble();
		
		do {
			System.out.print("Entrez la valeur de l'hauteur initiale (H0), (H0 >= 0): ");
			h0 = clavier.nextDouble();
		} while (h0 < 0);
		do {
			System.out.print("Entrez la valeur du coéfficient de rebond (eps), (0 <= eps < 1): ");
			eps = clavier.nextDouble();
		} while ((eps < 0) || (eps > 1));
		do {
			System.out.print("Entrez la valeur de l'hauteur finale désirée (H_FIN), (0 < h_fin < h0): ");
			h_fin = clavier.nextDouble();
		} while (h_fin <= 0 || h_fin >= h0);

		h = h0;
		do {
			v = Math.sqrt(2 * h * g);
			System.out.println("Falling.\n v: " + v + " h: " + h + " nbr: " + nbr);
			v1 = eps * v;
			
			nbr++;
			h1 = (v1 * v1) / (2 * g);
			h = h1;
			System.out.println("Came up.\n v: " + v + " h: " + h + " nbr: " + nbr);
		} while (h > h_fin);
		System.out.println("Le nombre de rebonds : " + nbr);
		
		clavier.close();
		
	}

}
