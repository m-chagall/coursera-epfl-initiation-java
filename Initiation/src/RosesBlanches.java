import java.util.Scanner;
public class RosesBlanches {

	public static void main(String[] args) {
		
		final int CAFE = 2;
		final int FLASH_INFORMATIQUE = 4;
		final int BILLET_METRO = 3;
		
		int somme, livresEtFournitures, reste, tiers;
		int cafe, flashInformatique, billetMetro, rosesBlanches;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Combien avez-vous reçu d'argent (Frs) ? ");
		
//		error
//		livresEtFournitures = input.nextInt() * 3/4;
		
		somme = input.nextInt();
		livresEtFournitures = somme * 3/4;
		reste = somme / 4;
		
		System.out.println("Livres et Fournitures: " + livresEtFournitures + " Frs");
		
		System.out.println("Vous pouvez ensuite acheter:");
		
		tiers = reste / 3;
		cafe = reste / CAFE;
		flashInformatique = reste / FLASH_INFORMATIQUE;
		billetMetro = reste / BILLET_METRO;
		
		System.out.println(" " + cafe + " cafés");
		System.out.println(" " + flashInformatique + " numéros du Flash Informatique");
		System.out.println(" " + billetMetro + " billets de métro");
		
//		error
//		rosesBlanches = (reste / 3) % CAFE + (reste / 3) % FLASH_INFORMATIQUE + (reste / 3) % BILLET_METRO;
		
		rosesBlanches = (reste % 3 + tiers % CAFE + tiers % FLASH_INFORMATIQUE + tiers % BILLET_METRO);
		
		System.out.println("et il vous restera " + rosesBlanches + " Frs pour les roses blanches.");
		
		input.close();
	}

}
