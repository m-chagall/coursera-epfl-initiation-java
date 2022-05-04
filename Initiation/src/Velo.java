import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        double tarifTotal = 0;
        int horaireNormal = 0;
        int horaireSupplementaire = 0;
               
        if (!((debut >=0 && debut <= 24) && (fin >= 0 && fin <= 24))) {
        	System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        }        
        
        else if (debut == fin) {
        	System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");	
        }
        
        else if (debut > fin) {
        	System.out.println("Bizarre, le début de la location est après la fin ...");	
        }
        else {
        	System.out.println("Vous avez loué votre vélo pendant");
        	if (debut > 7) {
        		if (debut <= 17) {
            		// 7 <= debut/fin <= 17
        			if (fin <= 17) {
            			horaireSupplementaire = (fin - debut);
            		}
            		// 7 <= debut, fin > 17
            		else if (fin > 17) {
            			horaireNormal = (fin - 17);
            			horaireSupplementaire = (17 - debut);
            		}
        		}
        		// debut/fin > 17
        		else {
        			horaireNormal = (fin - debut);
        		}
//        		tarifTotal += horaireNormal + horaireSupplementaire * 2;
        	}
        	// debut <=7
        	else {
        		if (fin <= 7) {
        			horaireNormal = (fin - debut);
        		}
        		else {
        			horaireNormal = (7-debut);
        			horaireSupplementaire = (fin-7);
        		}
//        		tarifTotal += horaireNormal + horaireSupplementaire * 2;
        	}
        	
        	tarifTotal += horaireNormal + horaireSupplementaire * 2;
        	
        	if (horaireNormal!=0) {
        		System.out.println(horaireNormal + " heure(s) au tarif horaire de 1.0 franc(s)");	
        	}
        	if (horaireSupplementaire!=0) {
        		System.out.println(horaireSupplementaire + " heure(s) au tarif horaire de 2.0 franc(s)");	
        	}
        	
        	System.out.print("Le montant total à payer est de " + tarifTotal + " franc(s).");
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}