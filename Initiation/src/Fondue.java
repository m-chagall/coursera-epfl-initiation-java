import java.util.Scanner;

public class Fondue {

	public static void main(String[] args) {
		final int BASE = 4;
		double fromage = 800.0;
		double eau = 2.0;
		double ail = 2.0;
		double pain = 400.0;
		
		System.out.print("Entrez le nombre de personne(s) conviée(s) à la fondue : ");
		
		Scanner input = new Scanner(System.in);
		int nbConvives = input.nextInt();
		
		System.out.println();
		System.out.println("Pour faire une fondue fribourgeoise pour 3 personnes, il vous faut : ");
		System.out.println(" - " + fromage*nbConvives/BASE + " gr de Vacherin fribourgeois");
		System.out.println(" - " + eau*nbConvives/BASE + " dl d'eau");
		System.out.println(" - " + ail*nbConvives/BASE + " gousse(s) d'ail");
		System.out.println(" - " + pain*nbConvives/BASE + " gr de pain");
		System.out.println(" - du poivre à volonté");
		
//		dans les corrigés
//		double ratio = nbConvives;
//		ratio /= BASE;
//		fromage *= ratio;
//		eau *= ratio;
//		ail *= ratio;
//		pain *= ratio;
//		
//		System.out.println();
//		System.out.println("Pour faire une fondue fribourgeoise pour 3 personnes, il vous faut : ");
//		System.out.println(" - " + fromage + " gr de Vacherin fribourgeois");
//		System.out.println(" - " + eau + " dl d'eau");
//		System.out.println(" - " + ail + " gousse(s) d'ail");
//		System.out.println(" - " + pain + " gr de pain");
//		System.out.println(" - du poivre à volonté");
		
		input.close();
	}

}
