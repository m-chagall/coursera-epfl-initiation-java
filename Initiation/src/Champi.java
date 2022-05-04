import java.util.Scanner;

public class Champi {
    public static void main(String[] args) {
    	Scanner clavier = new Scanner(System.in);

    	boolean lamelles, anneau, chapeauConvexe, foret;
    	
    	System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
    	System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
    	System.out.println();

    	// #1
    	System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
    	foret = clavier.nextBoolean();
    	
    	if(foret) {    		
    		// #2 
    		System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
        	chapeauConvexe = clavier.nextBoolean();
        	if(chapeauConvexe) {
        		// #3
        		System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
        		anneau = clavier.nextBoolean();
        		System.out.print("==> Le champignon auquel vous pensez est ");
        		if(anneau) {
        			System.out.print("l'amanite tue-mouches");
        		}
        		else {
        			System.out.print("le pied bleu");
        		}
        	}        	
        	else {
        		// #3
        		System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
            	lamelles = clavier.nextBoolean();
            	System.out.print("==> Le champignon auquel vous pensez est ");
            	if(lamelles) {            		
                	System.out.print("la girolle");
            	}
            	else {
            		System.out.print("le cèpe de Bordeaux");
            	}
        	}
    	}
    	
    	else {
    		// #2
    		System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
        	chapeauConvexe = clavier.nextBoolean();
        	System.out.print("==> Le champignon auquel vous pensez est ");
        	if(chapeauConvexe) {
        		System.out.print("l'agaric jaunissant");
        	}
        	else {
        		System.out.print("le coprin chevelu");
        	}
    	}
    	
    	clavier.close();
    }
}